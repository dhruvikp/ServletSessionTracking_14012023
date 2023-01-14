package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginHiddenFormServlet
 */
@WebServlet("/loginHiddenForm")
public class LoginHiddenFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHiddenFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		
		String userId = request.getParameter("userid");
		pw.println("<form action='dashboardHidden' method='post'> ");
		pw.println("<input type='hidden' name='userid' id='userid' value='"+userId+"' /> ");
		pw.println("<input type='submit' value='submit' />");
		pw.println("</form>");
		
		pw.println("<script>document.forms[0].submit();</script>");
		pw.println("</body></html>");
	}

}
