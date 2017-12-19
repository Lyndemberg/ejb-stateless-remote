package com.ifpb.jsp.client;


import com.ifpb.shared.Calculadora;
import com.ifpb.shared.ServiceLocator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CalculadoraServlet extends HttpServlet {
    private Calculadora calculadora = new ServiceLocator().lookup("host-core","3700","java:global/core/CalculadoraSimples");            
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int resultado = calculadora.somar(a, b);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Servlet CalculadoraServlet</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h3>Resultado:" + resultado + "</h3>");
        pw.println("</body>");
        pw.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
