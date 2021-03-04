package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/* Handles requests sent to the /custom-servlet URL. */
@WebServlet("/custom-servlet")
public class CustomServlet extends HttpServlet {

  ArrayList<String> messages; 

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    messages.add("Hello");
    messages.add("from");
    messages.add("Nokia Phone");
    
    response.setContentType("text/html;");
    response.getWriter().println("<h1>This is my custom servlet.</h1>");
  }
}