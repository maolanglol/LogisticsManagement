<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'background.jsp' starting page</title>
    
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
		
		function districtOnClick(){
		    var id=$("#treeDistrict").tree("getSelected").id;
  		    var url1="getYunDanByWangDianID?wangDianId="+id;
  		    $('#yunDanXinXi').datagrid({
  		      url:url1
  		    });   
		}
		function onTreeLoadSuccess(){
		    $('#divTree').css("display","");
		    $('#divLoadingTips').css("display","none");
		}
		function faChe(yunDanId){
		    $.getJSON("faChe?yunDanId="+yunDanId,function(result){
		        if(result=="true"){
		            alert("发车成功，运单已送往下一网点！");
		            var id=$("#treeDistrict").tree("getSelected").id;
  		            var url1="getYunDanByWangDianID?wangDianId="+id;
  		            $('#yunDanXinXi').datagrid({
  		              url:url1
  		            }); 
		        }
		        else{
		            alert("发车失败！");
		        }
		    });
		}
		function returnBtnColumn(yunDanId, rowIndex) {
            return "<a href='javascript:faChe("+yunDanId+")'>发车</a>";
        }
	</script>
  </head>
  
  <body class="easyui-layout">
    <div region="west" style="width:200px;height:auto;" title="网点信息"  split="true"  data-options="border:true,collapsible:false">
      <div id="divTree" style="display:none">
        <ul id="treeDistrict" class="easyui-tree" data-options="url:'getWangDianAll',animate:true,lines:true,onLoadSuccess:onTreeLoadSuccess" onDblClick="districtOnClick()"></ul>
      </div>
      <div id="divLoadingTips">
          <img src="<%=basePath%>img/loadingImg.gif" alt="努力加载中......" style="margin-top:250px;">
      </div>
    </div>
    <div data-options="region:'center'" title="网点运单信息"  border="true">
         <table id="yunDanXinXi" class="easyui-datagrid"  style="width:auto;height:auto"
			data-options="singleSelect:true,scrolling:true,idField:'yunDanId',fit:true">
		  <thead>
			<tr>
			    <th data-options="field:'yunDanDanHao',width:200">运单单号</th>
			    <th data-options="field:'dangQianWeiZhi',width:200">当前位置</th>
			    <th data-options="field:'yunDanId',width:40,formatter:returnBtnColumn">操作</th>
			</tr>
		  </thead>
		</table>
    </div>
  </body>
</html>
