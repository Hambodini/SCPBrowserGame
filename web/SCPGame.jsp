<%-- 
    Document   : scpMainMenu
    Created on : Apr 14, 2022, 9:40:25 PM
    Author     : hambo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wanna Play A Game ${sessionScope.loggedInUser}?</title>
        <link rel="stylesheet" href="Game.css">
    </head>

    <body class="flex-container">

        <span id="absContainer">
            <form>
                <label>Energy:</label><span id="currentE">0</span>/<span id="maxE"></span>
            </form>

        </span>

        <span id="empContainer">
            <input id="1" type="button" value="add 1 Energy">
        </span>

        <script src="gameMain.js"></script> 
    </body>
</html>
