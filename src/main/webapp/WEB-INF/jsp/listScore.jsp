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
    
        <form action="insertScore" method="post" >
    stuNo:<input type="text" name="stuNo" value="${stu }" readonly> <br>
    cName:<input type="text" name="cName" value="null"> <br>
    grade:<input type="text" name="grade" value="0"> <br>
    <button type="submit">插入</button><br>
    </form>
     <form action="findScore?stuNo=${stu }" method="post">
    cName:<input type="text" name="cName1" value="null"> <br>
    <button type="submit">科目成绩查询</button><br>
    </form>
    
    <form action="listStudent" method="post">
	<button type="submit">返回</button>
	</form>
</div>