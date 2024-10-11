package com.lista.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TarefaServlet
 */
@WebServlet("/tarefa")
public class TarefaServlet extends HttpServlet {
    private ArrayList<String> tarefas = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tarefa = request.getParameter("tarefa");
        if (tarefa != null) {
            tarefas.add(tarefa);
        }
        response.setContentType("text/html");
        response.getWriter().write("Tarefas: " + tarefas);
    }
}