<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
request.setAttribute("path", path);
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>我的简历</title>
		<link rel="stylesheet" type="text/css" href="${path}/stu/css/basic.css"/>
		<link rel="stylesheet" type="text/css" href="${path}/stu/css/common.css"/>
		<script type="text/javascript" src="${path}/stu/js/index.js"></script>
	</head>
	<body>
		<div id="top_bottom">
			<div class="intro_top">
				<span id="top_index">
					<a href="###">首页</a>
				</span>
				<span id="top_quit">
					<a href="###">退出</a>
				</span>
				<span id="top_user">
					<img src="${path}/stu/img/user.png"/>
					<a href="###">刘茂填写功填写</a>
				</span>
			</div>
		</div>
		<div class="intro_main">
			
			<div class="intro_main_left">
				<div id="left_user">
					<dl>
						<dt><a href="###"><img src="${path}/stu/img/user.png"/></a></dt>
						<dd class="user_name">昵称</dd>
						<dd class="user_name_modify"><a href="###">设置</a></dd>
					</dl>
					<ul>
						<li><a href="###">填写</a></li>
						<li><a href="###">修改</a></li>
						<li><a href="###">删除</a></li>
					</ul>
				</div>
				
			</div>
			
			<div class="intro_main_center">
				<!--
	            	作者：1310715652@qq.com
	            	时间：2016-04-09
	            	描述：内容部分——中间——基本信息
            	-->
				<div id="box0" class="bas_info info_common">
					<div class="form_title">
						基本信息<span class="mark_multiply">(* 必填)</span>
					</div>
					<div class="###">
						<form action="" method="">
							<span>
								<label for="name" class="row_one_label">姓　名</label>
								<input type="text" id="name" name="name"/>
							</span>
							<span>
								<label class="row_one_label">性　别</label><input type="radio" name="sex" id="sex1" value="1" checked="checked"/>
								<label for="sex1">男</label>
								<input type="radio" name="sex" id="sex2" value="0" />
								<label for="sex2">女</label>
							</span>
							
							<span>
								<label for="birth_time" class="row_one_label">出生年月</label>
								<input type="text" id="birth_time" name="birth_time" class="generic_time"/>
							</span>
				
							<span>
								<label for="addr_home" class="row_one_label">家庭住址</label>
								<input type="text" id="addr_home" name="addr_home"/>
							</span>
							<span>
								<label for="addr_com" class="row_one_label">通信地址</label>
								<input type="text" id="addr_com" name="addr"/>
							</span>
							<!--修改时间：2016.05.15-->
							<!--<span>
								<label for="grad_school" class="row_one_label">毕业院校</label>
								<input type="text" id="grad_school" name="grad_school" class="input_text"/>
							</span>
							<span>
								<label for="grad_major" class="row_one_label">专业方向</label>
								<input type="text" id="grad_major" name="grad_school" class="input_text"/>
							</span>
							<span>
								<label for="start_time" class="row_one_label">时　间</label>
								<input type="text" id="start_time" name="study_start" class="generic_time"/>
								<strong id="">至</strong>
								<input type="text" id="end_time" name="study_end" class="generic_time"/>
							</span>-->
							<span>
								<label class="row_one_label">证件类型</label>
								<select name="ident_category">
									<option value="01">学生证</option>
									<option value="02">身份证</option>
								</select>
								<label for="identity_id" class="row_two_label identity">证件号码</label>
								<input type="text" id="identity_id" name="identity_id"/>
							</span>
							<span>
								<label for="phone_number" class="row_one_label">电　话</label>
								<input type="text" id="phone_number" name="phone_number" class="input_text"/>
								<label for="email" class="row_two_label email">邮　　箱</label>
								<input type="text" id="email" name="email" class="input_text"/>
							</span>
							<!--修改时间：2016.05.15-->
							<!--<span>
								<label for="emer" class="emer_label">紧急联系人</label>
								<input type="text" id="emer" name="emer" class="input_text"/><br/>
							</span>
							<span>
								<label for="emer_com" class="emer_label">紧急联系电话</label>
								<input type="text" id="emer_com" name="emer_com" class="input_text"/>
							</span>-->
						</form>
					</div>
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag1');this.blur()">下一步</a>
						</span>
					</div>
				</div>
				<!--
                	作者：1310715652@qq.com
                	时间：2016-04-09
                	描述：内容部分——中间——教育经历
                -->
				<div id="box1" class="education info_common">
					<div class="form_title">
						教育经历<span class="mark_multiply">(* 必填)</span>
					</div>
					
					<div class="table">
						<table border="0" cellpadding="0" cellspacing="0">
							<thead>
								<tr><th>时间</th><th>毕业院校</th><th>专业</th><th>操作</th></tr>
							</thead>
							<tbody>
								
							</tbody>
						</table>
					</div>
					<div id="edu">
						<form action="" method="post">
							<span>
								<label for="adm_time" class="row_one_label">入学时间</label>
								<input type="text" id="adm_time" name="adm_time" class="generic_time">
								<label for="gra_time" class="row_two_label" >毕业时间</label>
								<input type="text" id="gra_time" name="gra_time" class="input_text"/>
							</span>
							<span>
								<label for="school_name" class="row_one_label">学　　校</label>
								<input type="text" id="school_name" name="school_name" class="input_text"/>
								<label for="gra_major" class="row_two_label" >专　　业</label>
								<input type="text" id="gra_major" name="gra_major" class="input_text"/>
							</span>
							<span>
								<label for="eduback" class="row_one_label">学　　历</label>
								<select name="eduback" size="1">
									<option value="专科">专科</option>
									<option value="本科">本科</option>
									<option value="硕士">硕士</option>
									<option value="博士">博士</option>
									<option value="其他">其他</option>
								</select>
							</span>
							<span>
								<label for="edudegree" class="row_one_label">学　　位</label>
								<select name="edudegree" size="1">
									<option value="学士">学士</option>
									<option value="硕士">硕士</option>
									<option value="博士">博士</option>
									<option value="MBA">MBA</option>
									<option value="EMBA">EMBA</option>
									<option value="其他">其他</option>
								</select>
							</span>
							<span>
								<label for="class_rank" class="row_one_label" >班级名次</label>
								<input type="text" id="class_rank" name="class_rank" class="input_text"/>
							</span>
							<span>
								<label for="compre_score" class="row_one_label">综合分数</label>
								<input type="text" id="compre_score" name="compre_score" class="input_text"/>
							</span>
							<span style="margin-bottom: 120px;">
								<label for="major_course" class="row_one_label">专业课程</label>
								<textarea id="major_course" name="major_course" ></textarea>
							</span>
							<span>
								<label for="reference" class="row_one_label" >证 明 人</label>
								<input type="text" id="reference" name="reference" class="input_text" />
								<label for="refer-com" class="row_two_label" >联系方式</label>
								<input type="textarea" id="refer-com" name="refer-com" class="input_text"/>
							</span>
							<span class="continue_add">
								<input type="button" name="addItem"  value="继续添加"/>
							</span>
						
						</form>
					</div>
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag2');this.blur()">下一步</a>
						</span>
						
					</div>
				</div>
				<!--
                	作者：1310715652@qq.com
                	时间：2016-04-09
                	描述：内容部分——中间——个人展望
                -->
				<div id="box2" class="per_aim info_common">
					<div class="form_title">
						个人展望<span class="mark_multiply">(* 必填)</span>
					</div>
					<div>
						<form action="" method="post">
							<input type="hidden" value="" />
							<div id="expect_city">
								<span id="forward">
									<label class="wish-city">个人期望就业城市</label>
								</span>
								<span id="city" >
									<label for="primcity" class="desire-label">主要意愿</label><input type="text" name="primcity" id="primcity" value="如：成都" /><br/>
									<label for="secondcity" class="desire-label">次要意愿</label><input type="text" name="secondcity" id="secondcity" value="如：成都" />
								</span>
							</div>
							<span>
								<label for="work_direc" class="wish-city">期望工作方向</label>
								<input type="text" name="work_direc" id="work_direc" class="input_text"/>
							</span>
							<span>
								<label for="work_pos" class="wish-city">期望工作职位</label>
								<input type="text" name="work_pos" id="work_pos" class="input_text"/>
							</span>
							<span>
								<label for="exp_salary" class="row_one_label">展 望 薪 资</label>
								<select name="exp_salary">
									<option value="2000">2000-4000</option>
									<option value="3000">3000-5000</option>
									<option value="5000">5000-8000</option>
									<option value="8000">8000以上</option>
								</select>
							</span>
							<!--修改时间:2016.05.15-->
							<!--<span>
								<label for="arr_time" class="row_one_label">到岗时间</label>
								<select name="arr_time">
									<option value="">请选择</option>
									<option value="">立即</option>
									<option value="">一周以内</option>
									<option value="">一月以内</option>
									<option value="">两月以内</option>
								</select>
							</span>-->
							<span style="margin-bottom: 120px;">
								<label for="major_course" class="row_one_label">自 我 评 价</label>
								<textarea id="major_course" name="evalution" ></textarea>
							</span>
						</form>
					</div>
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag3');this.blur()">下一步</a>
						</span>
						
					</div>
				</div>
				<!--
                	作者：1310715652@qq.com
                	时间：2016-04-09
                	描述：内容部分——中间——奖励荣誉
                -->
				<div id="box3" class="rep info_common">
					<div class="form_title">
						奖励荣誉<span class="mark_multiply">(* 必填)</span>
					</div>
					<div>
						<form action="" method="post">
							<!--修改时间:2016.05.15-->
							<!--<div id="social_work">
								<span class="lang-subject">
									<label >学生干部经历</label>
								</span>
								<span>
									<label class="row_one_label">学生干部</label>
									<select name="work_pos">
										<option value="c1">班委干部</option>
										<option value="c2">学生会干部</option>
										<option value="c3">学生社团干部</option>
										<option value="c4">学生社团联干部</option>
										<option value="c5">其他学生干部</option>
									</select>
									<label for="work_intr" class="row_two_label">职责描述</label>
									<input type="text" name="work_intr" id="work_intr" />
									<input type="button" name="add" id="add" value="增加" />
								</span>
							</div>-->
							<div id="social_work">
								<span class="lang-subject">
									<label >奖学金/奖励</label>
								</span>
							</div>
							<div class="table">
								<table border="0" cellspacing="0" cellpadding="0">
									<thead>
										<tr>
											<th>来源</th><th>奖励名称</th><th>时间</th><th>操作</th>
										</tr>
									</thead>
									<tbody>
										
									</tbody>
								</table>
							</div>
							<div>	
								<span>
									<label class="row_one_label">级　　别</label>
									<select name="work_pos">
										<option value="c1">学校</option>
										<option value="c2">市级</option>
										<option value="c3">省级</option>
										<option value="c4">国家级</option>
										<option value="c5">国际级</option>
										<option value="c5">其他</option>
									</select>
								</span>
								<span>
									<label class="row_one_label">奖励名称</label>
									<input type="text" name="rep_name" id="rep_name" />
								</span>
								<span>
									<label for="rep_time"  class="row_one_label">奖励时间</label>
									<input type="text" name="rep_time" id="rep_time" />
								</span>
								<span class="continue_add">
									<input type="button" name="add" id="add" value="继续添加" />
								</span>
							</div>
							<input type="hidden"/>
						</form>
					</div>
					
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag4');this.blur()">下一步</a>
						</span>
						
					</div>
				</div>
	              <!--
	              	作者：1310715652@qq.com
	              	时间：2016-04-09
	              	描述：内容部分中间——工作经历
	              -->
				<div id="box4" class="work_exper info_common">
					<div class="form_title">
						工作经历<span class="mark_multiply">(* 必填)</span>
					</div>
					<div class="table">
						<table border="0" cellpadding="0" cellspacing="0">
							<thead>
								<tr>
									<th>时间</th><th>公司名称/实践地点</th><th>所担任职务</th><th>操作</th>
								</tr>
							</thead>
						</table>
					</div>
					<div id="">
						<form action="" method="post">
							<input type="hidden" value=""/>
							<span>
								<label class="row_one_label">实践经历</label>
								<input type="radio" name="prac_exper" id="pr_exper_y" value="1" checked="checked"/><label for="pr_exper_y">有</label>
								<input type="radio" name="prac_exper" id="pr_exper_n" value="0"  /><label for="pr_exper_n">无</label>
							</span>
							<span>
								<label for="pr_loc"  class="row_one_label">实践经历</label>
								<input type="text" name="pr_loc" id="pr_loc"/>
								<label for="pr_pos" class="row_two_label">所担任职务</label>
								<input type="text" name="pr_pos" id="pr_pos"/>
							</span>
							<span >
								<label for="pr_start" class="row_one_label">实践时间</label>
								<input type="text" name="pr_start" id="pr_start" />
								<strong>至</strong>
								<input type="text" name="pr_end" id="pr_end" />
							</span>
							<span style="margin-bottom: 120px;">
								<label for="pr_content" class="row_one_label">实践内容</label>
								<textarea id="pr_content" name="major_course" ></textarea>
							</span>
							<span class="continue_add">
								<input type="button" name="add" id="add" value="继续添加" />
							</span>
						</form>
					</div>
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag5');this.blur()">下一步</a>
						</span>
						
					</div>
				</div>
				<!--
                	作者：1310715652@qq.com
                	时间：2016-04-09
                	描述：内容部分中间——项目经历
                -->
				<div id="box5" class="pro_exper info_common">
					<div class="form_title">
						项目经历<span class="mark_multiply">(* 必填)</span>
					</div>
					<div class="table">
						<table border="0" cellpadding="0" cellspacing="0">
							<thead>
								<tr>
									<th>时间</th><th>项目名称</th><th>职责</th><th>操作</th>
								</tr>
							</thead>
						</table>
					</div>
					<div id="">
						<form action="" method="post">
							<input type="hidden" value="" />
							<span >
								<label for="pro_start" class="row_one_label">时　　间</label>
								<input type="text" name="pro_start" id="pro_start" />
								<strong>至</strong>
								<input type="text" name="pro_end" id="pro_end" />
							</span>
							<span>
								<label for="pro_name"  class="row_one_label">项目名称</label>
								<input type="text" name="pro_name" id="pro_name"/>
							</span>
							<span>
								<label for="pro_duty"  class="row_one_label">项目职责</label>
								<input type="text" name="pro_duty" id="pro_duty"/>
							</span>
							<span style="margin-bottom: 120px;">
								<label for="pro_content" class="row_one_label">项目描述</label>
								<textarea id="pro_content" name="major_course" ></textarea>
							</span>
							<span class="continue_add">
								<input type="button" name="add" id="add" value="继续添加" />
							</span>
						</form>
					</div>
					<div class="submit_button">
						<span class="">
							<a class="btn-red btn-save-next">保存并继续下一步</a>
							<a class="btn-red btn-next" onclick="changeBox('tag6');this.blur()">下一步</a>
						</span>
						
					</div>
				</div>
				<!--
                	作者：1310715652@qq.com
                	时间：2016-04-09
                	描述：内容部分——中间——语言能力
                -->
				<div id="box6" class="lang_level info_common">
					<div class="form_title">
						语言能力<span class="mark_multiply">(* 必填)</span>
					</div>
					
					<div >
						<form action="" method="post">
							<span>
								<label class="row_one_label">英语等级</label>
								<select>
									<option value="forlevel001">未参加</option>
									<option value="forlevel002">CET4</option>
									<option value="forlevel003">CET6</option>
									<option value="forlevel004">专业六级</option>
									<option value="forlevel005">专业八级</option>
								</select>
								<label class="row_two_label">分数</label>
								<input type="text" name="forlangscore" id="forlangscore"/>
							</span>
							<span>
								<label class="levelname" for="toefl_score">TOEFL</label>
								<input type="text" name="toefl_score" id="toefl_score" />
							</span>
							<span>
								<label class="levelname" for="gre_score">GRE</label>
								<input type="text" name="gre_score" id="gre_score" />
							</span>
							<span>
								<label class="levelname" for="gmat_score">GMAT</label>
								<input type="text" name="gmat_score" id="gmat_score" />
							</span>
							<span>
								<label class="levelname" for="ielts_score">IELTS</label>
								<input type="text" name="ielts_score" id="ielts_score" />
							</span>
							<span>
								<label class="levelname" for="toeic_score">TOEIC</label>
								<input type="text" name="toeic_score" id="toeic_score" />
							</span>
							<span>
								<label class="levelname" for="sat_score">SAT</label>
								<input type="text" name="sat_score" id="sat_score" />
							</span>
						</form>
					</div>
					<div id="other-lang">
						<span class="lang-subject">
							<label >其他语种</label>
						</span>
						<div class="table">
							<table border="0" cellpadding="0" cellspacing="0">
								<thead>
									<tr>
										<th>序号</th><th>详细内容</th><th>操作</th>
									</tr>
								</thead>
							</table>
						</div>
						<!--修改时间2016.05.15-->
						<!--<form action="" method="post">
							<span>
								<label class="row_one_label">外语语种</label>
								<select>
									<option value="">请选择</option>
									<option value="forlang001">法语</option>
									<option value="forlang002">德语</option>
									<option value="forlang003">俄语</option>
									<option value="forlang004">韩语</option>
									<option value="forlang005">日语</option>
									<option value="forlang006">荷兰语</option>
									<option value="forlang007">意大利语</option>
									<option value="forlang008">西班牙语</option>
									<option value="forlang009">葡萄牙语</option>
									<option value="forlang010">阿拉伯语</option>
								</select>
							</span>
							<span>
								<label  for="certificate" class="row_one_label">证　　书</label>
								<input type="" name="certificate" id="certificate"/>
							</span>
							<span>
								<label class="row_one_label">读写能力</label>
								<select name="rw">
									<option value="rwlevel01">入门</option>
									<option value="rwlevel02">一般</option>
									<option value="rwlevel03">熟练</option>
									<option value="rwlevel04">精通</option>
								</select>
							</span>
							<span>
								<label class="row_one_label">听说能力</label>
								<select name="ls">
									<option value="lslevel01">入门</option>
									<option value="lslevel02">一般</option>
									<option value="lslevel03">熟练</option>
									<option value="lslevel04">精通</option>
								</select>
							</span>
							<span class="continue_add">
								<input type="button" name="add" id="add" value="继续添加" />
							</span>
						</form>-->
						<form action="" method="post">
							<input type="hidden" value="" />
							<div id="det-elabor">
								<label for="pro_content" class="row_one_label">详细描述</label>
								<textarea id="pro_content" name="major_course" ></textarea>
							</div>
							<div id="do-intro">
								<span><strong>语种: </strong>法语、德语、俄语、日语......</span>
								<span><strong>证书: </strong>证书名称</span>
								<span><strong>读写能力</strong>(入门/一般/熟练/精通)</span>
								<span><strong>听说能力</strong>(入门/一般/熟练/精通)</span>
							</div>
							<span class="continue_add">
								<input type="button" name="add" id="add" value="继续添加" />
							</span>
						</form>
					</div>
					<div class="submit_button">
						<span>
							<a class="btn-red btn-save-next">保存</a>
						</span>
						
					</div>
				</div>
			</div>
			<!--
            	作者：1310715652@qq.com
            	时间：2016-04-09
            	描述：内容右边部分
            -->
			<div class="intro_main_right">
				<ul class="procession">
					<li><a class="proc_a" href="###" onclick="changeBox('tag0');this.blur()">基本信息<span>必填</span></a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag1');this.blur()">教育经历<span>必填</span></a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag2');this.blur()">个人期望</a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag3');this.blur()">奖励荣誉</a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag4');this.blur()">工作经历<span>必填</span></a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag5');this.blur()">项目经历</a></li>
					<li><a class="proc_a" href="###" onclick="changeBox('tag6');this.blur()">语言能力</a></li>
				</ul>
			</div>
		</div>
		
		<div id="footer_bottom">
			<div id="footer">
				<span>
					Copyright &copy; 2016-2017  西南石油大学-计算机科学学院. All rights reserved.
				</span>
			</div>	
		</div>
	</body>
</html>
