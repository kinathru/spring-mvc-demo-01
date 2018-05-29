
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation</title>
</head>
<body>
	Registered Student Info:<br>
	${student.firstName} ${student.lastName}<br>
	${student.country}<br>
	${student.favouriteLanguage}<br/>
	${student.operatingSystems}<br>

	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>