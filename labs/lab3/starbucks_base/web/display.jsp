<%--
  Created by IntelliJ IDEA.
  User: ezesubu
  Date: 2/17/19
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
Starbuck's ${roast} Roast Coffees:

<table>
<c:forEach items="${advices}" var="advice">
    <c:choose>
        <c:when (advice.index%2 = 0)>
            <tr style="background-color:cyan">
        </c:when>

        <c:otherwise>
             <tr style=\"background-color:yellow\">"
        </c:otherwise>
    </c:choose>
</c:forEach>
</table>
</body>
</html>
