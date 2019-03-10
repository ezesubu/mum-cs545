<%--
  Created by IntelliJ IDEA.
  User: ezesubu
  Date: 2/17/19
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Color</title>
</head>
<body>
<h2>Ask for advise about your favorite roast</h2>
<form action="../action/advice" method="get">
    <select name="roast">
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select><br/><br/>
    <input type="submit" value="Submit"/><br/><br/>
</form>
</body>
</html>
