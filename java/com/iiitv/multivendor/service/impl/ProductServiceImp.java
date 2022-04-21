package com.iiitv.multivendor.service.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;

public class ProductServiceImp {
	
	public List<Map<String, Object>> productList(String email) throws Exception 
	{
		
		String sql="select seller_id from seller_management where seller_Email ='"+email+"'";
		Connection con=DBConnection.getConnection();
		List<Map<String, Object>> output=DBUtil.executeSelectQuery(con, sql);
		String seller_id = output.get(0).get("seller_id").toString();
		
		
		String sql1 = "select * from product_info where seller_id='"+seller_id+"'";
		Connection con1 = DBConnection.getConnection();
		List<Map<String, Object>> result1 = DBUtil.executeSelectQuery(con1, sql1);
		return result1;

	}
	
	public boolean  addingProduct(SignUp dto,String email) throws Exception
	{
		String sql="select seller_id from seller_management where seller_Email ='"+email+"'";
		Connection con=DBConnection.getConnection();
		List<Map<String, Object>> output=DBUtil.executeSelectQuery(con, sql);
		String seller_id = output.get(0).get("seller_id").toString();
		
		String sql3="INSERT INTO `product_info`(`brand_id`, `seller_id`, `product_name`, `product_warrenty`, `product_prize`, `product_qty`, `product_cat`, `discription`) VALUES ('1','"+seller_id+"','"+dto.getProductname()+"','"+dto.getWarrenty()+"','"+dto.getPrize()+"','"+dto.getQuantity()+"','"+dto.getProductcat()+"','"+dto.getDiscription()+"')";
		Connection con3=DBConnection.getConnection();
		boolean output3=DBUtil.executInsertUpdateDelete(con3, sql3);		
		return output3;
	
	}
	

}
