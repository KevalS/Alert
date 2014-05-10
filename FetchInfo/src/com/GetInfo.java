package com;

import javax.servlet.http.*;

public class GetInfo extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("Lat : "+req.getParameter("lat"));
		System.out.println("Code : "+req.getParameter("code"));
	}
	
}
