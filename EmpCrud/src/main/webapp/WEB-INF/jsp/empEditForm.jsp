<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<p>Edit employee</p>
<form:form method="post" action="/editEmployee"></form:form>
<table>
<tr><td>name</td>
<td><form:input path="name"/></td></tr>
<tr><td>salary</td>
<td><form:input path="salary"/></td></tr>
<tr><td>designation</td>
<td><form:input path="designation"/></td></tr>
<tr><td><input type="submit" value="save edited"></td></tr>
</table>
</body>
</html>