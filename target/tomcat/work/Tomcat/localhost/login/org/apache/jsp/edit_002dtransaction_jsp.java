/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-22 09:13:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import users.User;

public final class edit_002dtransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <script src=\"assets/js/color-modes.js\"></script>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("    <!-- Enlace a Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/dashboard/\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@docsearch/css@3\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("     body{\r\n");
      out.write("        background-image: url(\"./assets/img/background.png\") !important;\r\n");
      out.write("       }\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-divider {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 3rem;\r\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("        border-width: 1px 0;\r\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-vr {\r\n");
      out.write("        flex-shrink: 0;\r\n");
      out.write("        width: 1.5rem;\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bi {\r\n");
      out.write("        vertical-align: -.125em;\r\n");
      out.write("        fill: currentColor;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        z-index: 2;\r\n");
      out.write("        height: 2.75rem;\r\n");
      out.write("        overflow-y: hidden;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller .nav {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: nowrap;\r\n");
      out.write("        padding-bottom: 1rem;\r\n");
      out.write("        margin-top: -1px;\r\n");
      out.write("        overflow-x: auto;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        white-space: nowrap;\r\n");
      out.write("        -webkit-overflow-scrolling: touch;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .btn-bd-primary {\r\n");
      out.write("        --bd-violet-bg: #712cf9;\r\n");
      out.write("        --bd-violet-rgb: 112.520718, 44.062154, 249.437846;\r\n");
      out.write("\r\n");
      out.write("        --bs-btn-font-weight: 600;\r\n");
      out.write("        --bs-btn-color: var(--bs-white);\r\n");
      out.write("        --bs-btn-bg: var(--bd-violet-bg);\r\n");
      out.write("        --bs-btn-border-color: var(--bd-violet-bg);\r\n");
      out.write("        --bs-btn-hover-color: var(--bs-white);\r\n");
      out.write("        --bs-btn-hover-bg: #6528e0;\r\n");
      out.write("        --bs-btn-hover-border-color: #6528e0;\r\n");
      out.write("        --bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);\r\n");
      out.write("        --bs-btn-active-color: var(--bs-btn-hover-color);\r\n");
      out.write("        --bs-btn-active-bg: #5a23c8;\r\n");
      out.write("        --bs-btn-active-border-color: #5a23c8;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bd-mode-toggle {\r\n");
      out.write("        z-index: 1500;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bd-mode-toggle .dropdown-menu .active .bi {\r\n");
      out.write("        display: block !important;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"assets/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = (User)session.getAttribute("user");
        String name = null;
        String surname = null;
        String error = request.getParameter("error");
        String idCuenta = request.getParameter("idCuenta");
        String id = request.getParameter("id");
        String tipo = request.getParameter("tipo");
        String cantidad = request.getParameter("cantidad");


        if(user==null){
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0); // Proxies.
            response.sendRedirect("login.jsp");
        }
        else{
          name = user.getName();
          surname = user.getSurname();
        }
        
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"d-none\">\r\n");
      out.write("  <symbol id=\"calendar3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M14 0H2a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2zM1 3.857C1 3.384 1.448 3 2 3h12c.552 0 1 .384 1 .857v10.286c0 .473-.448.857-1 .857H2c-.552 0-1-.384-1-.857V3.857z\"/>\r\n");
      out.write("    <path d=\"M6.5 7a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm-9 3a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm-9 3a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"cart\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"chevron-right\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"door-closed\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0z\"/>\r\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"file-earmark\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M14 4.5V14a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2a2 2 0 0 1 2-2h5.5L14 4.5zm-3 0A1.5 1.5 0 0 1 9.5 3V1H4a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V4.5h-2z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"file-earmark-text\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M5.5 7a.5.5 0 0 0 0 1h5a.5.5 0 0 0 0-1h-5zM5 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5z\"/>\r\n");
      out.write("    <path d=\"M9.5 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.5L9.5 0zm0 1v2A1.5 1.5 0 0 0 11 4.5h2V14a1 1 0 0 1-1 1H4a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h5.5z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"gear-wide-connected\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6m2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0m4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4m-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10s-3.516.68-4.168 1.332c-.678.678-.83 1.418-.832 1.664z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"graph-up\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M0 0h1v15h15v1H0V0Zm14.817 3.113a.5.5 0 0 1 .07.704l-4.5 5.5a.5.5 0 0 1-.74.037L7.06 6.767l-3.656 5.027a.5.5 0 0 1-.808-.588l4-5.5a.5.5 0 0 1 .758-.06l2.609 2.61 4.15-5.073a.5.5 0 0 1 .704-.07Z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"house-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M4 10.781c.148 1.667 1.513 2.85 3.591 3.003V15h1.043v-1.216c2.27-.179 3.678-1.438 3.678-3.3 0-1.59-.947-2.51-2.956-3.028l-.722-.187V3.467c1.122.11 1.879.714 2.07 1.616h1.47c-.166-1.6-1.54-2.748-3.54-2.875V1H7.591v1.233c-1.939.23-3.27 1.472-3.27 3.156 0 1.454.966 2.483 2.661 2.917l.61.162v4.031c-1.149-.17-1.94-.8-2.131-1.718zm3.391-3.836c-1.043-.263-1.6-.825-1.6-1.616 0-.944.704-1.641 1.8-1.828v3.495l-.2-.05zm1.591 1.872c1.287.323 1.852.859 1.852 1.769 0 1.097-.826 1.828-2.2 1.939V8.73z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"list\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"people\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M15 14s1 0 1-1-1-4-5-4-5 3-5 4 1 1 1 1h8Zm-7.978-1A.261.261 0 0 1 7 12.996c.001-.264.167-1.03.76-1.72C8.312 10.629 9.282 10 11 10c1.717 0 2.687.63 3.24 1.276.593.69.758 1.457.76 1.72l-.008.002a.274.274 0 0 1-.014.002H7.022ZM11 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4Zm3-2a3 3 0 1 1-6 0 3 3 0 0 1 6 0ZM6.936 9.28a5.88 5.88 0 0 0-1.23-.247A7.35 7.35 0 0 0 5 9c-4 0-5 3-5 4 0 .667.333 1 1 1h4.216A2.238 2.238 0 0 1 5 13c0-1.01.377-2.042 1.09-2.904.243-.294.526-.569.846-.816ZM4.92 10A5.493 5.493 0 0 0 4 13H1c0-.26.164-1.03.76-1.724.545-.636 1.492-1.256 3.16-1.275ZM1.5 5.5a3 3 0 1 1 6 0 3 3 0 0 1-6 0Zm3-2a2 2 0 1 0 0 4 2 2 0 0 0 0-4Z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"plus-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z\"/>\r\n");
      out.write("    <path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"puzzle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M3.112 3.645A1.5 1.5 0 0 1 4.605 2H7a.5.5 0 0 1 .5.5v.382c0 .696-.497 1.182-.872 1.469a.459.459 0 0 0-.115.118.113.113 0 0 0-.012.025L6.5 4.5v.003l.003.01c.004.01.014.028.036.053a.86.86 0 0 0 .27.194C7.09 4.9 7.51 5 8 5c.492 0 .912-.1 1.19-.24a.86.86 0 0 0 .271-.194.213.213 0 0 0 .039-.063v-.009a.112.112 0 0 0-.012-.025.459.459 0 0 0-.115-.118c-.375-.287-.872-.773-.872-1.469V2.5A.5.5 0 0 1 9 2h2.395a1.5 1.5 0 0 1 1.493 1.645L12.645 6.5h.237c.195 0 .42-.147.675-.48.21-.274.528-.52.943-.52.568 0 .947.447 1.154.862C15.877 6.807 16 7.387 16 8s-.123 1.193-.346 1.638c-.207.415-.586.862-1.154.862-.415 0-.733-.246-.943-.52-.255-.333-.48-.48-.675-.48h-.237l.243 2.855A1.5 1.5 0 0 1 11.395 14H9a.5.5 0 0 1-.5-.5v-.382c0-.696.497-1.182.872-1.469a.459.459 0 0 0 .115-.118.113.113 0 0 0 .012-.025L9.5 11.5v-.003a.214.214 0 0 0-.039-.064.859.859 0 0 0-.27-.193C8.91 11.1 8.49 11 8 11c-.491 0-.912.1-1.19.24a.859.859 0 0 0-.271.194.214.214 0 0 0-.039.063v.003l.001.006a.113.113 0 0 0 .012.025c.016.027.05.068.115.118.375.287.872.773.872 1.469v.382a.5.5 0 0 1-.5.5H4.605a1.5 1.5 0 0 1-1.493-1.645L3.356 9.5h-.238c-.195 0-.42.147-.675.48-.21.274-.528.52-.943.52-.568 0-.947-.447-1.154-.862C.123 9.193 0 8.613 0 8s.123-1.193.346-1.638C.553 5.947.932 5.5 1.5 5.5c.415 0 .733.246.943.52.255.333.48.48.675.48h.238l-.244-2.855zM4.605 3a.5.5 0 0 0-.498.55l.001.007.29 3.4A.5.5 0 0 1 3.9 7.5h-.782c-.696 0-1.182-.497-1.469-.872a.459.459 0 0 0-.118-.115.112.112 0 0 0-.025-.012L1.5 6.5h-.003a.213.213 0 0 0-.064.039.86.86 0 0 0-.193.27C1.1 7.09 1 7.51 1 8c0 .491.1.912.24 1.19.07.14.14.225.194.271a.213.213 0 0 0 .063.039H1.5l.006-.001a.112.112 0 0 0 .025-.012.459.459 0 0 0 .118-.115c.287-.375.773-.872 1.469-.872H3.9a.5.5 0 0 1 .498.542l-.29 3.408a.5.5 0 0 0 .497.55h1.878c-.048-.166-.195-.352-.463-.557-.274-.21-.52-.528-.52-.943 0-.568.447-.947.862-1.154C6.807 10.123 7.387 10 8 10s1.193.123 1.638.346c.415.207.862.586.862 1.154 0 .415-.246.733-.52.943-.268.205-.415.39-.463.557h1.878a.5.5 0 0 0 .498-.55l-.001-.007-.29-3.4A.5.5 0 0 1 12.1 8.5h.782c.696 0 1.182.497 1.469.872.05.065.091.099.118.115.013.008.021.01.025.012a.02.02 0 0 0 .006.001h.003a.214.214 0 0 0 .064-.039.86.86 0 0 0 .193-.27c.14-.28.24-.7.24-1.191 0-.492-.1-.912-.24-1.19a.86.86 0 0 0-.194-.271.215.215 0 0 0-.063-.039H14.5l-.006.001a.113.113 0 0 0-.025.012.459.459 0 0 0-.118.115c-.287.375-.773.872-1.469.872H12.1a.5.5 0 0 1-.498-.543l.29-3.407a.5.5 0 0 0-.497-.55H9.517c.048.166.195.352.463.557.274.21.52.528.52.943 0 .568-.447.947-.862 1.154C9.193 5.877 8.613 6 8 6s-1.193-.123-1.638-.346C5.947 5.447 5.5 5.068 5.5 4.5c0-.415.246-.733.52-.943.268-.205.415-.39.463-.557H4.605z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("  <symbol id=\"search\" viewBox=\"0 0 16 16\">\r\n");
      out.write("    <path d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z\"/>\r\n");
      out.write("  </symbol>\r\n");
      out.write("</svg>\r\n");
      out.write("\r\n");
      out.write("<header class=\"navbar sticky-top bg-dark flex-md-nowrap p-0 shadow\" data-bs-theme=\"dark\">\r\n");
      out.write("  <a class=\"navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6 text-white\" href=\"#\">Banco</a>\r\n");
      out.write("\r\n");
      out.write("  <ul class=\"navbar-nav flex-row\">\r\n");
      out.write("    <li class=\"nav-item text-nowrap\">\r\n");
      out.write("      <p class=\"nav-link px-3 text-white\">");
 if(user!=null) out.print(user.getUsername());
      out.write("</p>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"navbar-nav flex-row d-md-none\">\r\n");
      out.write("    <li class=\"nav-item text-nowrap\">\r\n");
      out.write("      <button class=\"nav-link px-3 text-white\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <svg class=\"bi\"><use xlink:href=\"#list\"/></svg>\r\n");
      out.write("      </button>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"sidebar border border-right col-md-3 col-lg-2 p-0 bg-body-tertiary\">\r\n");
      out.write("      <div class=\"offcanvas-md offcanvas-end bg-body-tertiary\" tabindex=\"-1\" id=\"sidebarMenu\" aria-labelledby=\"sidebarMenuLabel\">\r\n");
      out.write("        <div class=\"offcanvas-header\">\r\n");
      out.write("          <h5 class=\"offcanvas-title\" id=\"sidebarMenuLabel\">Company name</h5>\r\n");
      out.write("          <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" data-bs-target=\"#sidebarMenu\" aria-label=\"Close\"></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"offcanvas-body d-md-flex flex-column p-0 pt-lg-3 overflow-y-auto\">\r\n");
      out.write("          <ul class=\"nav flex-column\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link d-flex align-items-center gap-2 active\" aria-current=\"page\" href=\"home.jsp\">\r\n");
      out.write("                <svg class=\"bi\"><use xlink:href=\"#house-fill\"/></svg>\r\n");
      out.write("                Transacciones\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <hr class=\"my-3\">\r\n");
      out.write("          <ul class=\"nav flex-column mb-auto\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link d-flex align-items-center gap-2\" href=\"profile.jsp\">\r\n");
      out.write("                <svg class=\"bi\"><use xlink:href=\"#gear-wide-connected\"/></svg>\r\n");
      out.write("                Mi perfil\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link d-flex align-items-center gap-2\" href=\"logout.jsp\">\r\n");
      out.write("                <svg class=\"bi\"><use xlink:href=\"#door-closed\"/></svg>\r\n");
      out.write("                Cerrar sesión\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">\r\n");
      out.write("    <br>\r\n");
      out.write("      <form method=\"POST\" action=\"update-transaction.jsp\" class=\"p-3 border rounded shadow-sm\">\r\n");
      out.write("        <h4> Modificar transacción</h4>\r\n");
      out.write("        <div class=\"form-floating mb-3\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"idTransaccion\" id=\"floatingInput\" value=\"");
 out.print(id); 
      out.write("\" placeholder=\"Your name\">\r\n");
      out.write("          <label for=\"floatingInput\">Transacción</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-floating mb-3\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"idCuenta\" id=\"floatingInput\" value=\"");
 out.print(idCuenta); 
      out.write("\" placeholder=\"Your name\">\r\n");
      out.write("          <label for=\"floatingInput\">Cuenta</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-floating mb-3\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"movimiento\" id=\"floatingPassword\" value=\"");
 out.print(tipo); 
      out.write("\" placeholder=\"Your surname\">\r\n");
      out.write("          <label for=\"floatingPassword\">Movimiento</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-floating mb-3\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"cantidad\" id=\"floatingPassword\" value=\"");
 out.print(cantidad); 
      out.write("\" placeholder=\"Your surname\">\r\n");
      out.write("          <label for=\"floatingPassword\">cantidad</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

        if (error != null && !error.isEmpty()) {
        
      out.write("\r\n");
      out.write("            <h6 class=\"text-danger\">");
      out.print( error );
      out.write("</h6>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("       <div class=\"text-end\">\r\n");
      out.write("          <button class=\"btn btn-primary\" type=\"submit\">Cambiar</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </main>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <!-- Bootstrap JavaScript y dependencias -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js@4.3.2/dist/chart.umd.js\" integrity=\"sha384-eI7PSr3L1XLISH8JdDII5YN/njoSsxfbrkCTnJrzXt+ENP5MOVBxD+l6sEG4zoLp\" crossorigin=\"anonymous\"></script><script src=\"dashboard.js\"></script></body>\r\n");
      out.write("     <script>\r\n");
      out.write("        window.addEventListener(\"pageshow\", function (event) {\r\n");
      out.write("            if (event.persisted) {\r\n");
      out.write("                window.location.reload();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
