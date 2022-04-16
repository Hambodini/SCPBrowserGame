<%-- 
    Document   : scpMainMenu
    Created on : Apr 14, 2022, 9:40:25 PM
    Author     : hambo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wanna Play A Game ${sessionScope.loggedInUser}?</title>
        <link rel="stylesheet" href="Game.css">
    </head>
    <body>
        <div>
            <h2>SCP Game - Settings</h2>
            <form action="SCPController" method="post">
                <input type="hidden" name="action" value="deleteGame">
                <input type="submit" value="Delete progress">
            </form>
        </div>
    </body>
</html>
