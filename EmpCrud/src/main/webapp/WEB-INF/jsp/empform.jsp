<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<body>
<h1>Add employee</h1>
<form:form  action="save" method="post">
<table>
<tr><td>name</td>
<td><form:input path="name"></form:input></td></tr>
<tr><td>salary</td>
<td><form:input path="salary"></form:input></td></tr>
<tr><td>designation</td>
<td><form:input path="designation"></form:input></td></tr>
<tr><td><input type="submit" value="save"></td></tr>
</table>

</form:form>
</body>
</html>