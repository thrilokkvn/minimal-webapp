package com.example.webapp.servlet;

import com.example.webapp.service.GreetingService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

    private final GreetingService greetingService = new GreetingService();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        String greeting = greetingService.generateGreeting(name);

        request.setAttribute("greeting", greeting);

        request.getRequestDispatcher("index.jsp")
                .forward(request, response);
    }
}