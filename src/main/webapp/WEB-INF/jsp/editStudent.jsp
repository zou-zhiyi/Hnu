<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div style="margin:0px auto; width:500px">
  
<form action="updateStudent" method="post">
  
stuNo:<input type="text" name="stuNo" value="${c.stuNo }"><br>
stuName:<input type="text" name="stuName" value="${c.stuName }"><br>
sex:<input type="text" name="sex" value="${c.sex }"><br>
birth:<input type="text" class="form-control" name="birth"
         value="<fmt:formatDate value='${c.birth}' pattern='yyyy-MM-dd '/>"><br>
department:<input type="text" name="department" value="${c.department }"><br>
addr:<input type="text" name="addr" value="${c.addr }"><br>
<input name="id" type="hidden" value="${c.id }">
<button type="submit">修改</button>
</form>

<form action="listStudent" method="post">
	<button type="submit">返回</button>
	</form>
</div>