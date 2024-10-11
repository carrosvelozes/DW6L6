package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNomeServlet
 */

@WebServlet("/addNome")
public class AddNomeServlet extends HttpServlet {
    private ArrayList<String> nomes = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        if (nome != null) {
            nomes.add(nome);
        }
        response.setContentType("text/html");
        response.getWriter().write("Nomes armazenados: " + nomes);
    }
}
