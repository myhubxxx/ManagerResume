/*The class of FormValidator*/
var FormValidator=function(form){
	/*To save the object form*/
	this.form=form;
	/*Error message*/
	this.errMsg=new Array();
	/*Error name*/
	this.errName=new Array();
	/*错误提示操作*/
	this.addErrorMsg=function(name,msg){
		this.errName.push(name);
		this.errMsg.push(msg);
	}
	this.addAllName=function(names){
		this.errName.push(names);
	}
	/*必填验证*/
	this.isRequired=function(inputObj){
		if(typeof(inputObj)=="undefined"||inputObj.value.trim()=="") return false;
		return true;
	}
	/*相等验证*/
	this.isEquals=function(inputObj,formElements){
		var flag=false;
		var fstObj=inputObj;
		var sndObj=formElements[inputObj.getAttribute('equalName')];
		if(fstObj!=null&&sndObj!=null){
			if(fstObj.value==sndObj.value) flag=true;
		}
		return flag;
	}
	/*大于验证*/
	this.gt=function(inputObj,formElements){
		var flag=false;
		var fstObj=inputObj;
		var sndObj=formElements[inputObj.getAttribute('equalName')];
		if(fstObj!=null&&sndObj!=null){
			if(fstObj.value.trim()!=''&&sndObj.value.trim()!=''&&fstObj.value>sndObj.value) flag=true;
		}
		return flag;
	}
	/*按条件验证*/
	this.compare=function(inputObj,formElements){
		var flag=false;
		var fstObj=inputObj;
		var sndObj=formElements[fstObj.getAttribute('equalName')];
		if(fstObj!=null&&sndObj!=null){
			if(fstObj.value.trim()!=''&&sndObj.value.trim()!=''){
				if(eval(fstObj.value+fstObj.getAttribute('operator'))+sndObj.value) flag=true;
			}
		}
		return flag;
	}
	/*The limit of length*/
	this.limit=function(inputObj){
		var flag=false;
		var len=inputObj.value.trim().length;
		if(len){
			var minLength=inputObj.getAttribute('minLength');
			var maxLength=inputObj.getAttribute('maxLength');
			minLength=minLength||0;
			maxLength=maxLength||Number.MAX_VALUE;
			if (minLength<=len&&len<=maxLength) flag=true;
		}
		return flag;
	}
	/*The range of value*/
	this.range=function(inputObj){
		var flag=false;
		var number=inputObj.value.trim();
		if(number){
			var min=inputObj.getAttribute('min');
			var max=inputObj.getAttribute('max');
			min=min||0;
			max=max||Number.MAX_VALUE;
			if(min<=number&&number<=max) flag=true;
		}
		return flag;
	}
	/*验证复选选择数量*/
	this.isRequiredChecked=function(inputObj){
		var flag=false;
		var min=inputObj.getAttribute('min');
		var max=inputObj.getAttribute('max');
		min=min||1;
		max=max||Number.MAX_VALUE;
		var groups=document.getElementsByName(inputObj.name);
		var checked=0;
		for(var i=0;i<groups.length;i++){
			if(groups[i].checked) checked++;
		}
		if(checked<=max&&min<=checked) flag=true;
		return flag;
	}
	/*文件拓展名过滤*/
	this.filter=function(inputObj){
		var flag=false;
		var value=inputObj.value;
		var allow=inputObj.getAttribute('allow');
		if(value.trim()){
			var regExp=new RegExp("^.+\.(?=EXT)(EXT)$".replace("/EXT/g",allow.split("/\s*,\s*/").join("|")),"gi");
			if(regExp.test(value)) flag=true;
		}
		return flag;
	}
	/*验证其不等于*/
	this.isNo=function(inputObj){
		var value=inputObj.value.trim();
		var noValue=inputObj.getAttribute("noValue");
		return value!=noValue;
	}
	/*正则表达式匹配*/
	this.regCheck=function(inputObj,reg,msg){
		inputObj.value=inputObj.value.trim();
		if(inputObj.value=="") return;
		else{
			if(!reg.test(inputObj.value)) this.addErrorMsg(inputObj.name,msg);
		}
	}
	/*表单验证及错误显示*/
	this.passed=function(){
		var flag=true;
		if(this.errMsg.length>0){
			FormValidator.showError(this.errMsg,this.errName);
			frt=document.getElementsByName(this.errName[0])[0];
			if(frt.type!='radio'&&frt.type!='checkbox') frt.focus();
			flag=false;
		}
		return flag;
	}
}
FormValidator.allName=new Array();
FormValidator.showError=function(errMsg){
	var msg="";
	for (var i = 0; i < errMsg.length; i++) {
		msg+="-"+errMsg[i]+"\n";
	}
	alert(msg);
}
function validator(frm) {
	/*获取所有的表单元件*/
	var formElements = frm.elements;
	/*传递表单引用构造验证器*/
	var fv = new FormValidator(frm);
	
	for (var i=0; i<formElements.length;i++) {
		var validType = formElements[i].getAttribute('valid');
		var errorMsg = formElements[i].getAttribute('errmsg');
		/*判断是否具有自定义验证标记*/
		if (validType==null) continue;
		fv.addAllName(formElements[i].name);
		/*验证类型同错误提示信息一一对应，验证类型用|分割*/
		var vts = validType.split('|');
		var ems = errorMsg.split('|');
		for (var j=0; j<vts.length; j++) {
			/*使用for循环进行相应验证*/
			var curValidType = vts[j];
			var curErrorMsg = ems[j];
			
			switch (curValidType) {
			case 'isNumber':
			case 'isEmail':
			case 'isPhone':
			case 'isMobile':
			case 'isIdCard':
			case 'isMoney':
			case 'isZip':
			case 'isQQ':
			case 'isInt':
			case 'isEnglish':
			case 'isChinese':
			case 'isUrl':
			case 'isDate':
			case 'isTime':
			case 'isSId':
				fv.regCheck(formElements[i],RegExps[curValidType],curErrorMsg);
				break;
			case 'regexp':
				fv.regCheck(formElements[i],new RegExp(formElements[i].getAttribute('regexp'),"g"),curErrorMsg);
				break;
			case 'custom':
				if (!eval(formElements[i].getAttribute('custom')+'(formElements[i],formElements)')) {
					fv.addErrorMsg(formElements[i].name,curErrorMsg);
				}
				break;
			default :
				if (!eval('fv.'+curValidType+'(formElements[i],formElements)')) {
					fv.addErrorMsg(formElements[i].name,curErrorMsg);
				}
				break;
			}
		}
	}
	return fv.passed();
}
String.prototype.trim=function(){
	return this.replace("/^\s*|\s*$/g","");
}
var RegExps=function(){};
RegExps.isNumber = /^[-\+]?\d+(\.\d+)?$/;
RegExps.isEmail = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,5}$/;
RegExps.isPhone = /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/;
RegExps.isMobile = /^1[3|4|5|8][0-9]\d{4,8}$/;
RegExps.isIdCard = /^(^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$)|(^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])((\d{4})|\d{3}[Xx])$)$/;
RegExps.isMoney = /^\d+(\.\d+)?$/;
RegExps.isZip = /^[1-9]\d{5}$/;
RegExps.isQQ = /^[1-9]\d{4,10}$/;
RegExps.isInt = /^[-\+]?\d+$/;
RegExps.isEnglish = /^[A-Za-z]+$/;
RegExps.isChinese =  /^[\u0391-\uFFE5]+$/;
RegExps.isUrl = /^(http|ftp|https):\/\/([\w\-]+(\.[\w\-]+)*\/)*[\w\-]+(\.[\w\-]+)*\/?(\?([\w\-\.,@?^=%&:\/~\+#]*)+)?/;
RegExps.isDate = /((^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(10|12|0?[13578])([-\/\._])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(11|0?[469])([-\/\._])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(0?2)([-\/\._])(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\/\._])(0?2)([-\/\._])(29)$)|(^([3579][26]00)([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][0][48])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][0][48])([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][2468][048])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][2468][048])([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][13579][26])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][13579][26])([-\/\._])(0?2)([-\/\._])(29)$))/;
RegExps.isTime = /^\d{4}-\d{1,2}-\d{1,2}\s\d{1,2}:\d{1,2}:\d{1,2}$/;
RegExps.isSId=/^[1-9]\d{11}$/;