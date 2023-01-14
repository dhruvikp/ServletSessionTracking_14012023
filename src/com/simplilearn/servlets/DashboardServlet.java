package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.crypto.CipherInputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet("/dashboardCookie")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		
		Cookie[] cookies = request.getCookies();
		boolean isCookieFound = false;
		
		if(cookies!=null && cookies.length>0) {
			for(Cookie cookie : cookies) {
				if( cookie.getName().equalsIgnoreCase("userid")) {
					isCookieFound = true;
					pw.println("Hello "+cookie.getValue());
				}
			}
		}
		
		if(!isCookieFound) {
			pw.println("Please login First !");
		}
		
		pw.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
