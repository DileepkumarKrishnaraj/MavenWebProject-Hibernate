package com.samco.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samco.dao.TraineeDaoImplementation;
import com.samco.model.SamcoTrainee;


public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TraineeDaoImplementation traineedaoimpl = new TraineeDaoImplementation();
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dob = request.getParameter("dob");
		
		SamcoTrainee samcoTrainee = new SamcoTrainee();
		samcoTrainee.setName(name);
		samcoTrainee.setEmail(email);
		samcoTrainee.setPhoneNum(phone);
		samcoTrainee.setDob(dob);
		
		traineedaoimpl.createTrainee(samcoTrainee);
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}
