package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class New_Servlet
 */
@WebServlet("/New_Servlet")
public class New_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public New_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String user=request.getParameter("u1");
		String pass=request.getParameter("p1");
		String gen1=request.getParameter("r1");		
		out.println("<h1>Username:"+user+ "Password:"+pass+""+"Gender:"+gen1);
		String[] lang1=request.getParameterValues("c1");
		for(int i=0;i<lang1.length;i++){
			out.println("<h1>Language:" +lang1[i]);
			
		}
		String[] qual1=request.getParameterValues("s1");
		for(int i=0;i<qual1.length;i++){
			out.println("<h1>Qualification:" +qual1[i]);
		
	}
	}

}
