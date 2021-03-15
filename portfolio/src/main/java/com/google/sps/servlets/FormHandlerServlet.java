package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.*; 

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String msgValue = request.getParameter("msg-input");

    // Print the value so you can see it in the server logs.
    System.out.println(nameValue + " submitted the following message: " + msgValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You have successfully submitted the following message: " + msgValue);

    response.sendRedirect("https://vvasquez-sps-spring21.appspot.com/");
  }
}