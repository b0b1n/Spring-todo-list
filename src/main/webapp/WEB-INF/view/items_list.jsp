<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WELCOME</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Todo items</h2></caption>
        <tr>
            <th>Title</th>
            <th>Deadline</th>
        </tr>
        <c:forEach var="item" items="${todoData.items}">
            <tr>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.deadLine}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
