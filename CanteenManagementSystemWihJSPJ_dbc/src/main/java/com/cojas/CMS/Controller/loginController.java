package com.cojas.CMS.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.CMS.dao.LoginDaoImpl;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   PrintWriter out=response.getWriter();
		   response.setContentType("text/html");
		   String uname=request.getParameter("uname");
		   String pass=request.getParameter("password");
		   
		   LoginDaoImpl dao=new LoginDaoImpl();
		  String type = dao.login(uname, pass);
		   
		  if(type.equals("admin")) {
				RequestDispatcher rd = request.getRequestDispatcher("./admin.html");
				rd.include(request, response);
			}else if(type.equals("vendor")){
				RequestDispatcher rd = request.getRequestDispatcher("./vendor.html");
				rd.include(request, response);
			}else if(type.equals("customer")){
				RequestDispatcher rd = request.getRequestDispatcher("./customer.html");
				rd.include(request, response);
			}else if(type.equals("")) {
				out.println("Invalid Username/password . please try again");
				RequestDispatcher rd = request.getRequestDispatcher("./signin.html");
				rd.include(request, response);
			}
	}

}
