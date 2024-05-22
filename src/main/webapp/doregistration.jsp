<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.User"%>
<%@page import="java.util.*"%>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    
    // Verificar si algún campo está vacío
    if (username == null || username.isEmpty() || 
        password == null || password.isEmpty() || 
        name == null || name.isEmpty() || 
        surname == null || surname.isEmpty()) {
        
        // Establecer el mensaje de error en el formulario actual
        request.setAttribute("errorMessage", "No dejes los campos vacíos");
        // Incluir la vista del formulario de registro para mostrar el mensaje de error
        request.getRequestDispatcher("register.jsp").forward(request, response);
        return; // Detener la ejecución del código restante
    }

    //Usuario de la base de datos
    String dbuser = "jorge";
    //Contraseña de la base de datos
    String dbpassword = "12345678";
    //Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/banco", dbuser, dbpassword);
    AuthService auth = new AuthService(pool.getConnection());
    
    try {
        User user = auth.register(username, name, surname, password);
        response.sendRedirect("login.jsp");
    } catch (Exception e) {  
        request.setAttribute("errorMessage", "Ese usuario ya existe");
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
%>
