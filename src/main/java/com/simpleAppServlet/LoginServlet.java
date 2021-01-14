package com.simpleAppServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	private UserValidationService service = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		
		System.out.println("----->"+ nombre);
		
		request.setAttribute("nombre", nombre);

		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(
			request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

			String nombre = (String) request.getParameter("nombre");

			boolean isValid = service.isValidUser(nombre);
			
			if(isValid) {
				System.out.println("nombre doPost--->"+ nombre);
				request.setAttribute("nombre", nombre);
				request.getRequestDispatcher("/WEB-INF/vistas/welcome.jsp").forward(
					request, response);
			}else {
				request.setAttribute("error", "Error de credenciales");
				request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(
					request, response);
			}


		}
}
