
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.UsersService"%>
<%@page import="users.User"%>
<%@page import="transactions.Transaction"%>
<%@page import="transactions.TransactionService"%>
<%@ page import="java.sql.SQLException" %>
    <%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ConnectionPool pool = null;
    try {
        //Usuario y contraseña de la base de datos
        String dbuser = "jorge";
        String dbpassword = "12345678";
        //Creación del pool de conexiones
        pool = new ConnectionPool("jdbc:mysql://localhost:3306/banco", dbuser, dbpassword);
        
        TransactionService transactions = new TransactionService(pool.getConnection());
        String StringCuenta = request.getParameter("account");
        String movimiento = request.getParameter("movement");
        String StringCantidad = request.getParameter("amount");
        long cuenta = Long.parseLong(StringCuenta);
        double cantidad = Double.parseDouble(StringCantidad);
        Transaction transaction = new Transaction(cuenta, movimiento, cantidad);
        if(transactions.create(transaction) > 0){
            response.sendRedirect("home.jsp");
        }
    } catch (Exception e) {
        // Manejo de excepciones genéricas
        e.printStackTrace(); // Opcional: imprime el rastro de la excepción para fines de depuración
        // Envío de mensaje de error al formulario
        String error = "Ha ocurrido un error al procesar la transacción. Por favor, inténtalo de nuevo más tarde.";
        out.print(String.format("<h4 class=\"error\">%s</h4>", error));
    } finally {
        // Cierre del pool de conexiones en el bloque finally para asegurar que se cierre adecuadamente
        if (pool != null) {
            pool.closeAll();
        }
    }
%>

