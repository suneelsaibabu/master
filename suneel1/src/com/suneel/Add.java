package com.suneel;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Add extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
	int i=Integer.parseInt(req.getParameter("t1"));
	int y=Integer.parseInt(req.getParameter("t2"));
	int k= i + y;
	
	req.setAttribute("k", k);
	
	RequestDispatcher ds=req.getRequestDispatcher("rq");
	ds.forward(req,res);
	}

}

