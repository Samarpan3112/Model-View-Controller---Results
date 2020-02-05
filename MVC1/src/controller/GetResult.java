package controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;


public class GetResult extends HttpServlet 
{
		boolean value;
		private HttpSession session;
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			String usn=request.getParameter("usn");
			Model m = new Model();
			m.setUsn(usn);
			
			try 
			{
				value=m.fetchResult();
				if(value==true)
				{
					session = request.getSession(true);
					session.setAttribute("name", m.getName());
					session.setAttribute("usn", m.getUsn());
					session.setAttribute("marks1", m.getMarks1());
					session.setAttribute("marks2", m.getMarks2());
					session.setAttribute("marks3", m.getMarks3());
					response.sendRedirect("/MVC1/DisplayResuly.jsp");
				}
				else
				{
					response.sendRedirect("/MVC1/Error.html");
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		
		}

}
