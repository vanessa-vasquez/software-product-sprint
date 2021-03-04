package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
/* Handles requests sent to the /custom-servlet URL. */
=======
/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
>>>>>>> 2223be4fa3f5dc35ffc34ac5e815b016f31f3e86
@WebServlet("/custom-servlet")
public class CustomServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("<h1>This is my custom servlet.</h1>");
  }
}