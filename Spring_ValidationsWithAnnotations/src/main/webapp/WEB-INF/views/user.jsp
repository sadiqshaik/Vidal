<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Create Uesr</title></head>
<body>
<center>
<pre>
<form:form action="createUser" method ="post" commandName ="user" >
	ENTER USER NAME: <form:input path="name"/>
<font color="red"><form:errors path = "name"></form:errors></font><br>
	ENTER AGE	:<form:input path="age"/>
<font color="red"><form:errors path = "age"></form:errors></font><br>
	ENTER LOCATION:<form:input path="location"/>
<font color="red"><form:errors path = "location"></form:errors></font><br>
<input type="submit"> 
</pre>
</center>
</form:form>
</body>
</html>