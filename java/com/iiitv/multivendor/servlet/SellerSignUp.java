package com.iiitv.multivendor.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.service.impl.SellerServiceImpl;
/**
 * Servlet implementation class SellerSignUp
 */
public class SellerSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerSignUp() {
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
			String name = request.getParameter("name").toString();
			String number = request.getParameter("number").toString();
			String email = request.getParameter("email").toString();
			String password = request.getParameter("password").toString();
			String adhar = request.getParameter("adhar").toString();
			String pan = request.getParameter("pan").toString();
			String gstin = request.getParameter("gstin").toString();
			String accountnumber = request.getParameter("accountnumber").toString();
			String ifsc = request.getParameter("ifsc").toString();
			String address = request.getParameter("address").toString();


			SignUp objDTo = new SignUp();
			objDTo.setName(name);
			objDTo.setMobile(number);
			objDTo.setEmail(email);
			objDTo.setPassword(password);
			objDTo.setAadhar(adhar);
			objDTo.setPan(pan);
			objDTo.setGstin(gstin);
			objDTo.setAccountnumber(accountnumber);
			objDTo.setIfsc(ifsc);
			objDTo.setAddress(address);
			

			SellerServiceImpl seller = new SellerServiceImpl();
		    boolean output = seller.sellerSignUp(objDTo);
			if (output) 
			{
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


