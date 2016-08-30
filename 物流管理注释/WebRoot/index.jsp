<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>快递物流跟踪--单号查询</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
  	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
  	<link rel="stylesheet" href="jquery-easyui-1.3.3/themes/default/easyui.css" type="text/css"></link>
  	<link rel="stylesheet" href="jquery-easyui-1.3.3/themes/icon.css" type="text/css"></link>
  	<script type="text/javascript">
  	//    两种写法效果是相同的
  		//$(document).ready(function(){})
  		//$(function(){})
  		$(function(){
  			 $('#yunDanChaXun').text('请输入要查询的单号,\n多个单号请用Enter(回车)隔开');
  		})
  	    function yunDanChaXun_onblur(){
  	        if($('#yunDanChaXun').text()==''){
  	            $('#yunDanChaXun').text('请输入要查询的单号,\n多个单号请用Enter(回车)隔开');
  	        }
  	    }
  	    function yunDanChaXun_onclick(){
  	        if($('#yunDanChaXun').text()=='请输入要查询的单号,\n多个单号请用Enter(回车)隔开'){
  	            $('#yunDanChaXun').text('');
  	        }
  	    }
  	    function chageValidateCode()
		{
			var timenow = new Date().getTime();
			$("#vCimg").attr("src", "getVerificationCode?d="+timenow);
		}
		function queryYunDanXinXi(){
		    $.getJSON("validateVerificationCode?vCode="+$('#verificationCode').val(),function(result){
    			/*$.each(result, function(i, field){
     			 $("div").append(field + " ");
    			});*/
    			if(result=='true'){
    			   $('#validateStat').css("color","green");
    			   $('#validateStatBorder').css("border","0");
    			   $('#validateStatBorder').css("border-color","green");
    			   $('#validateStat').html("");
    			   $('#verificationCode').val("");
    			   $("#tbYunDan").empty();
    			   chageValidateCode();
    			   $.getJSON("getYunDanByYunDanDanHao?yunDanDanHaoList="+$('#yunDanChaXun').val().replace(/\n/g,"<br/>") ,function(result){
    			       $.each(result, function(i, data){
     			 		    $("#tbYunDan").append("<tr>"+
     			 		    "<td><br/>"+
     			 		    "<div id=\"yunDan"+i+"\" class=\"easyui-panel\" "+
     			 		    "title=\"运单【"+i+"】物流信息\" style=\"width:auto;height:200px;padding:10px;\" "+
     			 		    "data-options=\"collapsible:true,minimizable:false,maximizable:false,closable:false\">"+
     			 		    "</div></td></tr>");
     			 		    if(data==""){
     			 		    	$("#yunDan"+i).append("<font style=\"color:red\">暂无运单信息！</font>");
     			 		    }
     			 		    else{
     			 		    	$.each(data,function(j,rows){
     			 		    	    if(rows.faCheFou==false){
     			 		        		$("#yunDan"+i).append("当前到达"+rows.diQu+":网点【<font style=\"color:red\">"+rows.wangDian+"</font>】。<br/>");
     			 		    	    }
     			 		    	    else{
     			 		    	        $("#yunDan"+i).append("已到达"+rows.diQu+":网点【"+rows.wangDian+"】，已发往下一网点。<br/>");
     			 		    	    }
     			 		    	});
     			 		    }
    					    $.parser.parse($("#tbYunDan"));//重新渲染EasyUI控件
    					    
    					});
    			   });
    			}
    			else{
    			   $('#validateStat').css("color","red");
    			   $('#validateStatBorder').css("border","1 solid");
    			   $('#validateStatBorder').css("border-color","red");
    			   $('#validateStat').html("×");
    			}
  			});
		}
  	</script>
  </head>
  
  <body  class="easyui-layout">
     <div region="west" style="width:265px;height:auto;" title="运单查询"  split="true"  data-options="border:true,collapsible:false">
         <textarea id="yunDanChaXun" name="yunDanChaXun" onblur="yunDanChaXun_onblur()" onclick="yunDanChaXun_onclick()" style="width:99%;height:300px;"></textarea>
         <br/>
         <table>
         	<tr>
         		<td> 验证码：</td>
         		<td><div id="validateStatBorder"><input id="verificationCode" type="text" style="width:80px;"></div></td>
         		<td><img id="vCimg" style="cursor:pointer" src="getVerificationCode" onclick="chageValidateCode()"/></td>
         		<td><font id="validateStat"></font></td>
         	</tr>
         </table>
         <button onclick="queryYunDanXinXi()">查询</button>
         <a href="background.jsp" target="_blank"><button>后台管理</button></a>
     </div>
     <div data-options="region:'center'" title="运单物流信息"  border="true">
         <table id="tbYunDan" style="width:98%;">
             
         </table>
     </div>
     <div region="east" style="width:200px;height:auto;" title="所有运单" split="true"  data-options="border:true,collapsible:false">
         <table id="chanpinxinxi" class="easyui-datagrid"  style="width:1400px;height:450px"
			data-options="singleSelect:true,scrolling:true,idField:'yunDanId',fit:true" url="getYunDanAll">
		  <thead>
			<tr>
			    <th data-options="field:'yunDanDanHao',width:200">运单单号</th>
			</tr>
		  </thead>
		</table>
     </div>
  </body>
</html>
