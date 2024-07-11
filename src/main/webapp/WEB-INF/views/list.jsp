<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <h1>All Lists</h1>
</head>
<body>
<c:forEach items="${data}" var="Data">
    <p> ${Data.toString()} </p>
</c:forEach>
</body>
</html>