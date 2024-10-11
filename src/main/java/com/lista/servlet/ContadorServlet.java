package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContadorServlet
 */
@WebServlet("/contador")
public class ContadorServlet extends HttpServlet {
    private int contador = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        contador++;
        response.setContentType("text/html");
        response.getWriter().write("Número de acessos: " + contador);
    }
}
