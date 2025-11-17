package controller;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  private final String JSP = "/WEB-INF/jsp/Hello.jsp";

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    var dispatcher = request.getRequestDispatcher(JSP);
    dispatcher.forward(request, response);
  }
}
