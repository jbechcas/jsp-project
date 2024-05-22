/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-22 10:32:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connectionpool.ConnectionPool;
import users.UsersService;
import users.User;
import transactions.Transaction;
import transactions.TransactionService;
import java.sql.SQLException;

public final class insert_002dtransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

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

      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
