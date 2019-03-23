<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<body>
<p>employees list</p>
<table>
<tr><th>id</th><th>name</th><th>salary</th><th>designation</th><th>edit</th><th>delete</th></tr>
<c:forEach var="emp" items={list}>
<tr><td>$emp.id</td>
<td>$emp.name</td>
<td>$emp.salary</td>
<td>$emp.designation</td></tr>
</c:forEach>

</table>
<a href="empform"> add new employee</a>
</body>
</html>