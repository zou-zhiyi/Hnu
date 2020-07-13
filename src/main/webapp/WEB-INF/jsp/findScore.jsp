<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <div align="center"> 
</div>
<div style="width:1000px;margin:20px auto;text-align: center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>scoreId</td>
            <td>stuNo</td>
            <td>cName</td>
            <td>grade</td>
        </tr>
        <c:forEach items="${scores}" var="c" varStatus="st">
            <tr>
                <td>${c.scoreId}</td>
                <td>${c.stuNo}</td>
                <td>${c.cName}</td>
                <td>${c.grade}</td>
                <td><a href="editScore?scoreId=${c.scoreId }">编辑</a></td>
                <td><a href="deleteScore?scoreId=${c.scoreId }&stuNo=${c.stuNo }">删除</a></td>
                </form>
            </tr>
        </c:forEach>
    </table>
    
	<form action="listScore?stuNo=${stu}" method="post">
	<button type="submit">返回</button>
	</form>
   
</div>