package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcessoUsuarioServlet
 */

@WebServlet("/acesso")
public class AcessoUsuarioServlet extends HttpServlet {
    private HashMap<String, Integer> contadorAcessos = new HashMap<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        contadorAcessos.put(nome, contadorAcessos.getOrDefault(nome, 0) + 1);
        response.setContentType("text/html");
        response.getWriter().write("Acesso de " + nome + ": " + contadorAcessos.get(nome));
    }
}