<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="maven.util.Mappings" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Todo List application</title>
</head>
<body>
<div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo items</a></h2>
</div>
</body>
</html>
