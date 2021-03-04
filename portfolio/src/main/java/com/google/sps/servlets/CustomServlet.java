package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.GsonBuilder;

/* Handles requests sent to the /custom-servlet URL. */
@WebServlet("/custom-servlet")
public class CustomServlet extends HttpServlet {


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> messages = new ArrayList<String>();  
    messages.add("Hello");
    messages.add("from");
    messages.add("Nokia Phone");

    GsonBuilder gsonBuilder = new GsonBuilder();

    Gson gson = gsonBuilder.create();

    String JSONString = gson.toJson(messages);

    response.setContentType("text/html;");
    response.getWriter().println(JSONString);
  }
}