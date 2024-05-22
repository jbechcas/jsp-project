<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="transactions.TransactionService" %>
<%@page import="transactions.Transaction"%>
<%@page import="connectionpool.ConnectionPool"%>
<%
    ConnectionPool pool = null;
    try {
        String idTransaccion = request.getParameter("idTransaccion");
        //Usuario y contraseña de la base de datos
        String dbuser = "jorge";
        String dbpassword = "12345678";
        //Creación del pool de conexiones
        pool = new ConnectionPool("jdbc:mysql://localhost:3306/banco", dbuser, dbpassword);
        
        TransactionService transactions = new TransactionService(pool.getConnection());
        long id = Long.parseLong(idTransaccion);
        transactions.delete(id);
        response.sendRedirect("home.jsp");
        
    } catch (Exception e) {
        
    }
%>
