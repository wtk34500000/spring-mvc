<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	The customer is confirmed: ${customer.firstName} ${customer.firstName}
	<br><br>
	Free Passes: ${customer.freePasses}
	
	<br><br>
	Postal Code: ${customer.postalCode}
	
	<br><br>
	Course Code: ${customer.courseCode}
</body>
</html>