
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Customer Confirmation</title>
</head>
<body>
	Registered Customer Info:<br>
	Name : ${customer.firstName} ${customer.lastName}<br>
	Free Passes : ${customer.freePasses}<br>
</body>
</html>