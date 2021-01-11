package com.zensar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bean.Student;

public class LoginController extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) {
		
		String requestAction = request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			LoginRepository loginRepository  =new LoginRepository();
			boolean loginresults = loginRepository.checklogin(username, password);
			if(loginresults) {
    			try {
					response.sendRedirect("index.jsp");
				} catch (Exception e) {
	                 System.out.println("Exception Occured:" + e);
	             }
    			
    		}else
    		{
    			System.out.println("Login Failed");
    			try {
					response.sendRedirect("login.jsp");
				} catch (Exception e) {
	                 System.out.println("Exception Occured:" + e);
	             }
    		}
    		 
    	 }else if(requestAction.equalsIgnoreCase("add")) {
    		 int id = Integer.parseInt(request.getParameter("id"));
    		 String name = request.getParameter("name");
    		 String course = request.getParameter("course");
    		 
    		 System.out.println("id" + id);
    		 
    		 LoginRepository loginRepository=new LoginRepository();
    		 Student student =new Student(id, name, course);
    		 loginRepository.addStudent(student);
    		 
    		 try {
    			 response.sendRedirect("index.jsp");
    		 }catch (Exception e) {
                 System.out.println("Exception Occured:" + e);
             } 
    	 }	
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request, response);
	}

}
