<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.AuthService"%>
<%@page import="transactions.Transaction"%>
<%@page import="transactions.TransactionService"%>
<%@ page import="java.sql.SQLException" %>
<%
try {
    String stringCuenta = request.getParameter("idCuenta");
    String movimiento = request.getParameter("movimiento");
    String stringCantidad = request.getParameter("cantidad");
    String stringId = request.getParameter("idTransaccion");
    double cantidad = Double.parseDouble(stringCantidad);
    long cuenta = Long.parseLong(stringCuenta);
    long id = Long.parseLong(stringId);
    
    // Usuario de la base de datos
    String dbuser = "jorge";
    // Contraseña de la base de datos
    String dbpassword = "12345678";
    // Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/banco", dbuser, dbpassword);
    TransactionService transactions = new TransactionService(pool.getConnection());
    Transaction transaction = new Transaction(id,cuenta,movimiento,cantidad);
    transactions.update(transaction);
     response.sendRedirect("home.jsp");
} catch (Exception e) {
    String id = request.getParameter("idTransaccion");
    String cuenta = request.getParameter("idCuenta");
    String movimiento = request.getParameter("movimiento");
    String cantidad = request.getParameter("cantidad");

    // Construir los parámetros para la redirección
    String params = "id=" + id +
                    "&idCuenta=" + cuenta +
                    "&tipo=" + movimiento +
                    "&cantidad=" + cantidad;

    // Enviar mensaje de error y parámetros de transacción al formulario
    response.sendRedirect("edit-transaction.jsp?error=Ha+habido+un+problema+al+insertar+los+datos&" + params);
}
%>
