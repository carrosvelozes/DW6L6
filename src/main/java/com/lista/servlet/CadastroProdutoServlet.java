package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroProdutoServlet
 */
@WebServlet("/cadastroProduto")
public class CadastroProdutoServlet extends HttpServlet {
    private ArrayList<String> produtos = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String produto = request.getParameter("produto");
        String preco = request.getParameter("preco");
        if (produto != null && preco != null) {
            produtos.add(produto + " - " + preco);
        }
        response.setContentType("text/html");
        response.getWriter().write("Produtos cadastrados: " + produtos);
    }
}