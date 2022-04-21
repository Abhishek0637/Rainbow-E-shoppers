package com.iiitv.multivendor.servlet;

import java.io.*;
import java.util.*;
 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.iiitv.multivendor.service.impl.UpdateServiceImpl;




 public class UploadServlet extends HttpServlet {

	
		private final String UPLOAD_DIRECTORY = "E:/img";
	    
	     @Override
	     protected void doPost(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, IOException {
	        
	         //process only if its multipart content
	         if(ServletFileUpload.isMultipartContent(request)){
	             try {
	                 List<FileItem> multiparts = new ServletFileUpload( new DiskFileItemFactory()).parseRequest(request);
	                
	                 for(FileItem item : multiparts){
	                     if(!item.isFormField()){
	                         String name = new File(item.getName()).getName();
	                         item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
	                     }
	                 }
	             
	                //File uploaded successfully
	                request.setAttribute("message", "File Uploaded Successfully");
	                HttpSession session = request.getSession();
	    			String email = (String)session.getAttribute("email");
	                UpdateServiceImpl updatepicturesStatus = new UpdateServiceImpl();
	                boolean status = updatepicturesStatus.UpdatePictureStatus(email);
	             } catch (Exception ex) {
	                request.setAttribute("message", "File Upload Failed due to " + ex);
	             }          
	           
	         }else{
	             request.setAttribute("message",
	                                  "Sorry this Servlet only handles file upload request");
	         }
	      
	         request.getRequestDispatcher("/seller/result.jsp").forward(request, response);
	       
	     }
	    
	 }






