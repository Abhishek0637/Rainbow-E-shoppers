package com.iiitv.multivendor.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.service.impl.AdminServiceImpl;
import com.iiitv.multivendor.service.impl.UserServiceImpl;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Map<String,String> responseMap=new HashMap<String,String>();
		try 
		{
			
			String email = request.getParameter("email").toString();
			String password = request.getParameter("password").toString();


			SignUp dto = new SignUp();
			
			dto.setEmail(email);
			dto.setPassword(password);


			AdminServiceImpl admin = new AdminServiceImpl();
		    int output = admin.adminLogin(dto);
			if (output==1) 
			{
				HttpSession session=request.getSession();  
		        session.setAttribute("email",email);  
				responseMap.put("status", "success");
				responseMap.put("message", "Registration Successfully");
			}
			else
			{
				responseMap.put("status", "failed");
				responseMap.put("message", "This Email Already Registerd");
			}
		} catch (Exception e) {

			responseMap.put("status", "failed");
			responseMap.put("message", "This Email Already Registerd");
		}
		
		
		response.getWriter().write(new Gson().toJson(responseMap));
		
	}

}
