<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
<script type="text/javascript">
var flag=1;
function check(){
	var myform=document.getElementById("myform");
	var formData=new FormData(myform);
	$.ajax({
		url:"<%=request.getContextPath()%>/stu.action?insert",
		type:"post",
		data:formData,
		processData:false,
		contentType:false,
		success:function(data){
			if(data==1){
				alert("插入成功");
			}
		}
	});
}
/**
 * 获取分页数据
 */
 function jiazai(){
	//下一页数据
	var data2=$("#btn1").attr("data");
	if(flag==1)
	$.post("<%=request.getContextPath()%>/stu.action?fenye2",{page:parseInt(data2)},function(data){
		//将数据放入到div中
		var str='<table><tr><td>编号</td><td>姓名</td><td>图片</td><td>操作</td></tr>';
		$.each(data["fenyeData"],function(i){
			str+='<tr><td>'+data["fenyeData"][i]["sid"]+'</td><td>'+data["fenyeData"][i]["sname"]+'</td><td><img src="<%=request.getContextPath()%>/upload/'+data["fenyeData"][i]["spic"]+'"></td>'
			+'<td><a href="javascript:delone('+data["fenyeData"][i]["sid"]+')">删除</a>'
			+'<a href="javascript:findone('+data["fenyeData"][i]["sid"]+')">修改</a></td>'
			+'</tr>';
		});
		str+='</table>';
		$("#con").append(str);
		//再将总页数放入到加载更多的pages属性中
		$("#btn1").attr("pages",data["pages"]);
		//将下一页放入到data属性中
		$("#btn1").attr("data",parseInt(data2)+1);
		flag=-1;
	});
	else{
		$.post("<%=request.getContextPath()%>/stu.action?fenye2",{page:parseInt(data2)},function(data){
			//将数据放入到div中
			var str='<table><tr><td>编号</td><td>姓名</td><td>图片</td><td>操作</td></tr>';
			$.each(data["fenyeData"],function(i){
				str+='<tr><td>'+data["fenyeData"][i]["sid"]+'</td><td>'+data["fenyeData"][i]["sname"]+'</td><td><img src="<%=request.getContextPath()%>/upload/'+data["fenyeData"][i]["spic"]+'"></td>'
				+'<td><a href="javascript:delone('+data["fenyeData"][i]["sid"]+')">删除</a>'
				+'<a href="javascript:findone('+data["fenyeData"][i]["sid"]+')">修改</a></td>' 
				+'</tr>';
			});
			str+='</table>';
			$("#con").append(str);
			//再将总页数放入到加载更多的pages属性中
			//$("#btn1").attr("pages",data["pages"]);
			//将下一页放入到data属性中
			$("#btn1").attr("data",parseInt(data2)+1);
			//flag=-1;
		});
	}
}
//删除一条学生记录
function delone(id){
	//删除前确认
	var flag=confirm("确认删除吗?");
	if(flag)
	$.post("<%=request.getContextPath()%>/stu.action?delflag",{sid:id},function(data){
		if(data==1){
			alert("删除成功");
			jiazai();
		}
	});
}
</script>
<form action="" method="post" enctype="multipart/form-data" id="myform">
姓名:<input type="text" name="sname" id="sname"><br>
图片:<input type="file" name="spic2" id="spic2"><br>
<input type="button" value="提交" onclick="check()">
</form>
<input type="button" value="加载更多" data="1" pages="" onclick="jiazai()" id="btn1"> 
<div id="con">
</div>
</body>
</html>