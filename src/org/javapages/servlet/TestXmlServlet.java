package org.javapages.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestXmlServlet
 */
public class TestXmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestXmlServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userId");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		ServletContext servletContext = request.getServletContext();
		if (userName != "" && userName != null) {
			session.setAttribute("userId", userName);
			servletContext.setAttribute("userId", userName);
		}
		response.getWriter().append(request.getMethod()).append("\nServed at: ").append(servletContext.getContextPath())
				.append("\nRequest...User Name: ").append(userName).append("\nSession...User Name: ")
				.append((String) session.getAttribute("userId")).append("\nContext...User Name: ")
				.append((String) servletContext.getAttribute("userId")).append("\nServletConfig...User Name: ")
				.append((String) getServletConfig().getInitParameter("DefaultUser"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userId");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		ServletContext servletContext = request.getServletContext();
		if (userName != "" && userName != null) {
			session.setAttribute("userId", userName);
			servletContext.setAttribute("userId", userName);
		}
		response.getWriter().append(request.getMethod()).append("\nServed at: ").append(servletContext.getContextPath())
				.append("\nRequest...User Name: ").append(userName).append("\nSession...User Name: ")
				.append((String) session.getAttribute("userId")).append("\nContext...User Name: ")
				.append((String) servletContext.getAttribute("userId")).append("\nServletConfig...User Name: ")
				.append((String) getServletConfig().getInitParameter("DefaultUser"));
	}

}
