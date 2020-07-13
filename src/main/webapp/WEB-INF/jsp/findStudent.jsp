<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <div align="center"> 
</div>
<div style="width:1000px;margin:20px auto;text-align: center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>stuNo</td>
            <td>stuName</td>
            <td>sex</td>
            <td>birth</td>
            <td>department</td>
            <td>addr</td>
        </tr>
        <c:forEach items="${students}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.stuNo}</td>
                <td>${c.stuName}</td>
                <td>${c.sex}</td>
                <td><fmt:formatDate value="${c.birth }" pattern="yyyy-MM-dd"/></td>
                <td>${c.department}</td>
                <td>${c.addr}</td>
                <td><a href="listScore?stuNo=${c.stuNo }">查看成绩</a></td>
                <td><a href="editStudent?id=${c.id }">编辑</a></td>
                <td><a href="deleteStudent?id=${c.id }">删除</a></td>
                </form>
            </tr>
        </c:forEach>
    </table>
    
	<form action="listStudent" method="post">
	<button type="submit">返回</button>
	</form>
   
</div>