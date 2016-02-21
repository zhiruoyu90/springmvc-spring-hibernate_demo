<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 4/24/15
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
${subject}
<br>
<c:forEach items="${userList}" var="user">
    ${user.username}
    <br>
</c:forEach>

</body>
</html>
