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
import com.iiitv.multivendor.service.impl.UpdateServiceImpl;

/**
 * Servlet implementation class UpdateLogisticStatus
 */
public class UpdateLogisticStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLogisticStatus() {
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
			String logistic_id = request.getParameter("logistic_id").toString();
			String status = request.getParameter("status").toString();
			


			SignUp dto = new SignUp();
			dto.setLogistic_id(logistic_id);
			dto.setStatus(status);


			UpdateServiceImpl logisticupdate = new UpdateServiceImpl();
		    boolean output = logisticupdate.logisticDepartment(dto);
		    if(output)
		    {
		    	responseMap.put("status", "true");
		    }
		    else
		    {
		    	responseMap.put("status", "false");
		    }
			
		} catch (Exception e) {

			responseMap.put("status", "false");
		}
		
		response.getWriter().write(new Gson().toJson(responseMap));
	
	}

}
