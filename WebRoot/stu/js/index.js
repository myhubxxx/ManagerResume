var className=new Array("bas_info","education","per_aim","rep","work_exper","pro_exper","lang_level");

function changeBox(tag)
{
	for(var i=0;i<7;i++)
	{
		if("tag"+i==tag)
		{
			document.getElementById("box"+i).className=className[i];
		}
		else{
			document.getElementById("box"+i).className="nodis";
		}
	}
}
function checkLength(obj,display,length){
	if(isNaN(length)) length=0;
	var objtext=document.getElementById(obj);
	var disobj=document.getElementById(display);
	objtext.value=objtext.value.substring(0,length);
	disobj.innerHTML="字数:"+objtext.value.length+"/"+length;
	}
