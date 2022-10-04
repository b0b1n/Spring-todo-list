<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page import="maven.util.AttributeNames" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add items</title>
</head>
<body>
<div align="center">
    <form:form method="POST" modelAttribute="${AttributeNames.TODO_ITEM}">

    </form:form>
</div>
</body>
</html>
