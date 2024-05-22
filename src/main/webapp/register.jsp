<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="users.User"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insercción</title>
    <link rel="stylesheet" href="./assets/css/inserccion-modifiacion.css">
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
                <div id="title"><h1 class="opacity">REGISTRAR</h1></div>
                <form id="myForm" method="POST" action="doregistration.jsp">
                    <input type="text" name="name" placeholder="NOMBRE" >
                    <div> <span id="insert-user-error" class="error-message"></span> </div>

                    <input type="text" name="surname" placeholder="APELLIDOS" >
                    <div class="form-group"> <span id="insert-password-error" class="error-message"></span> </div>

                    <input type="text" name="username" placeholder="USUARIO" >
                    <div class="form-group"> <span id="insert-name-error" class="error-message"></span> </div>

                    <input type="text" name="password" placeholder="PASSWORD" >
                    <div class="form-group"> <span id="insert-last-names-error" class="error-message"> </span></div>
                    <div class="form-group">
                        <span id="insert-info-error" class="error-message">
                            <% String errorMessage = (String) request.getAttribute("errorMessage");
                                if(errorMessage != null && !errorMessage.isEmpty()) {
                                    out.println(errorMessage);
                                } 
                            %>
                        </span>
                    </div>
                    <br>
                    <div class="form-group"><span id="insert-info-error" class="error-message"></span></div>
                    <button type="submit" name="submit-register" id="submit-register"  class="opacity">SUBMIT</button>
                    <div>
                        <a href="login.jsp" id="login">
                          Quiero iniciar sesión
                        </a>
                      </div>
                </form>
            </div>
        </div>
        
    </section>
</body>
</html>