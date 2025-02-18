package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveNomeServlet
 */
@WebServlet("/removeNome")
public class RemoveNomeServlet extends HttpServlet {
    private ArrayList<String> nomes = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        nomes.remove(nome);
        response.setContentType("text/html");
        response.getWriter().write("Nomes restantes: " + nomes);
    }
}