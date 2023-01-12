<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Input Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
     First Name: <form:input path="firstName" />
		<%--firstName id the property of student class  --%>
		<br>
		<br>	
	 Last Name: <form:input path="lastName" />

		<br>
		<br>

		<form:select path="country">

			<form:option value ="India" label ="India" />
			<form:option value ="Australia" label ="Australia" />
			<form:option value ="Germany" label ="Germany" />
			<form:option value ="Iceland" label ="Iceland" />

		</form:select>

		<br>
		<br>
		
		Favorite Language: 
			
			Java <form:radiobutton path = "favoriteLanguage" value = "Java" />
			C# <form:radiobutton path = "favoriteLanguage" value = "C#" />
			Ruby <form:radiobutton path = "favoriteLanguage" value = "Ruby" />
			PHP <form:radiobutton path = "favoriteLanguage" value = "PHP" />
			
			<br><br>
			
			Operating Systems:
			
			Linux <form:checkbox path = "operatingSystems" value = "Linux" />
			Mac OS <form:checkbox path = "operatingSystems" value = "Mac OS" />
			MS Windows <form:checkbox path = "operatingSystems" value = "MS Windows" />
			
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>