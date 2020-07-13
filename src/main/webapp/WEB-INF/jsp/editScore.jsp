<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div style="margin:0px auto; width:500px">
  
<form action="updateScore" method="post">
scoreId:<input type="hidden" name="scoreId" value="${c.scoreId }"><br>
stuNo:<input type="hidden" name="stuNo" value="${c.stuNo }"><br>
cName:<input type="text" name="cName" value="${c.cName }"><br>
grade:<input type="text" name="grade" value="${c.grade }"><br>
<button type="submit">修改</button>
</form>

<form action="listScore?stuNo=${c.stuNo }" method="post">
	<button type="submit">返回</button>
	</form>
</div>