package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComentariosServlet
 */

@WebServlet("/comentarios")
public class ComentariosServlet extends HttpServlet {
    private ArrayList<String> comentarios = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String comentario = request.getParameter("comentario");
        if (comentario != null) {
            comentarios.add(comentario);
        }
        response.setContentType("text/html");
        response.getWriter().write("Comentários: " + comentarios);
    }
}