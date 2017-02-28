var className = new Array("bas_info", "education", "per_aim", "rep",
		"work_exper", "pro_exper", "lang_level");

function changeBox(tag) {
	for (var i = 0; i < 7; i++) {
		if ("tag" + i == tag) {
			document.getElementById("box" + i).className = className[i];
		} else {
			document.getElementById("box" + i).className = "nodis";
		}
	}
}
function init() {
	setIdentityValidType();
}
function checkLength(obj, display, length) {
	if (isNaN(length))
		length = 0;
	var objtext = document.getElementById(obj);
	var disobj = document.getElementById(display);
	objtext.value = objtext.value.substring(0, length);
	disobj.innerHTML = "字数:" + objtext.value.length + "/" + length;
}
function setIdentityValidType() {
	var inputobj = document.getElementsByName('ident_category')[0];
	var destObj = document.getElementById('identity_id');
	var selectedIndex = inputobj.selectedIndex;
	if (inputobj.options[selectedIndex].value == '01') {
		destObj.setAttribute("valid", 'isRequired|isSId');
		destObj.setAttribute('errmsg', '学号不允许为空|学号为12位数字');
	}
	if (inputobj.options[selectedIndex].value == '02') {
		destObj.setAttribute("valid", 'isRequired|isIdCard');
		destObj.setAttribute('errmsg', '身份证号不允许为空|身份证号码错误');
	}
}
function validfrm(form, tag) {
	var flag=validator(document.getElementById(form))?true:false;
	if (flag) {
		changeBox(tag);
		this.blur();
	}
	return flag;
}
function saveAll(){
	var lang_level=document.getElementById('submitlanglevel');
	var flag=lang_level.onclick()?validfrm('pro_skills','tag6'):false;;
	return flag;
}
