<%--
  Created by IntelliJ IDEA.
  User: ezesubu
  Date: 2/17/19
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action='calc' method='post'>
        <input type = 'text' size = '2' name = 'add1' required/>+
        <input type = 'text' size = '2' name = 'add2' required/><br/>
        <input type = 'text' size = '2' name = 'mult1' required/>*
        <input type = 'text' size = '2' name = 'mult2' required/><br>
        <input type = 'submit' value = 'Submit'/>
    </form>
</body>
</html>
