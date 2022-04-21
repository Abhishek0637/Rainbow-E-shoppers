package com.iiitv.multivendor.service.impl;

import java.awt.List;
import java.sql.Connection;
import java.util.Map;

import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;
public class UpdateServiceImpl {

	public boolean userDepartment(SignUp dto) throws Exception {
		
		String sql = "update user_management set status=" + dto.getStatus() + " where user_id="
				+ dto.getUser_id();

		Connection con = DBConnection.getConnection();
		boolean result1 = DBUtil.executInsertUpdateDelete(con, sql);
		return result1;

	}

	public boolean sellerDepartment(SignUp dto) throws Exception {
		String sql = "update seller_management set status=" + dto.getStatus() + " where seller_id="
				+ dto.getSeller_id();
		Connection con = DBConnection.getConnection();
		boolean result2 = DBUtil.executInsertUpdateDelete(con, sql);
		return result2;

	}

	public boolean logisticDepartment(SignUp dto) throws Exception {
		String sql = "update logistic_management set status=" + dto.getStatus() + " where logistic_id="
				+ dto.getLogistic_id();
		Connection con = DBConnection.getConnection();
		boolean result3 = DBUtil.executInsertUpdateDelete(con, sql);
		return result3;

	}

	public boolean adminDepartment(SignUp dto) throws Exception {
		String sql = "update admin_management set status=" + dto.getStatus() + " where admin_id="
				+ dto.getAdmin_id();
		Connection con = DBConnection.getConnection();
		boolean result4 = DBUtil.executInsertUpdateDelete(con, sql);
		return result4;

	}
	public boolean UpdatePictureStatus(String email) throws Exception {
		String sql="select seller_id from seller_management where seller_Email ='"+email+"'";
		Connection con=DBConnection.getConnection();
		List output= (List) DBUtil.executeSelectQuery(con, sql);
		String seller_id = ((java.util.List<Map<String, Object>>) output).get(0).get("seller_id").toString();
		
		
	
		String sql1 = "update product_info set status='0' where seller_id='"+seller_id+"'";
				
		Connection con1 = DBConnection.getConnection();
		boolean result6 = DBUtil.executInsertUpdateDelete(con1, sql1);
		return result6;

	}
}
