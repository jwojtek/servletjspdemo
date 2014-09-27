package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Demo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {

		String param = request.getParameter("name");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext ctx = request.getServletContext();
		int licznik=0;
		
		if(param!=null&&param!="")		
		{
			    ctx.setAttribute("name", param);
				session.setAttribute("name", param);
				licznik++;
		
				
		}
				out.println("<h1>Wejsc na strone "+licznik+" </h1>");
				out.println("<h1>Hello from context "+ctx.getAttribute("name")+" </h1>");
				out.println("<h1>Hello from session "+session.getAttribute("name")+" </h1>");
				out.println("<h1>Hello from request "+param+" </h1>");
	}

}
