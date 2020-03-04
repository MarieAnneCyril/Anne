package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Html_Servlet
 */
@WebServlet("/Html_Servlet")
public class Html_Servlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Html_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

	}}
