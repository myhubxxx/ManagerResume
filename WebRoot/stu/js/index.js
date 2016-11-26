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
