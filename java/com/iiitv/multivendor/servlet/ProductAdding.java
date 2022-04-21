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
import com.iiitv.multivendor.service.impl.ProductServiceImp;
import com.iiitv.multivendor.service.impl.UserServiceImpl;

/**
 * Servlet implementation class ProductAdding
 */
public class ProductAdding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAdding() {
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
			String productname = request.getParameter("productname").toString();
			String productcat = request.getParameter("productcat").toString();
			String quantity = request.getParameter("quantity").toString();
			String warrenty = request.getParameter("warrenty").toString();
			String prize = request.getParameter("prize").toString();
			String disctiption = request.getParameter("disctiption").toString();


			SignUp dto = new SignUp();
			dto.setProductname(productname);
			dto.setProductcat(productcat);
			dto.setQuantity(quantity);
			dto.setWarrenty(warrenty);
			dto.setPrize(prize);
			dto.setDiscription(disctiption);

			ProductServiceImp addingProduct = new ProductServiceImp();
			HttpSession session = request.getSession();
			String email = (String)session.getAttribute("email");
		    boolean output = addingProduct.addingProduct(dto,email);
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
