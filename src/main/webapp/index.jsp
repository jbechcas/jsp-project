<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="users.User"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="./assets/css/login.css">
    <link rel="icon" type="image/x-icon" href="./img/favicon.png">
    
    <style>
        .error-message {
            color: red;
            margin-top: 5px;
        }
    </style>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = (User)session.getAttribute("user");
        if(user!=null)
            response.sendRedirect("home.jsp");
        else{
            String error = request.getParameter("error");
            
        }
        
    %>
<section class="container">
        <div class="login-container">
            <div class="circle circle-one"></div>
            <div class="form-container">
                <div id="title"><h1 class="opacity">LOGIN</h1></div>
                <form id="login-form" action="login.jsp">
                    <input type="text" name="username" id="login-user" placeholder="USER">
                    <span id="user-error" class="error-message"></span>
                    <input type="password" name="password" id="login-password" placeholder="PASSWORD">
                    <span id="password-error" class="error-message"></span>
                    <button type="submit" name="submit-login" id="submit-login"  class="opacity">SUBMIT</button>
                        <div id="register">
                            <a href="register.jsp">
                                Quiero registrarme
                            </a>
                        </div>
                        
                    </div>
                        

                </form>
            </div>
        </div>
    </section>
</html>