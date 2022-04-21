package com.iiitv.multivendor.service.impl;

import java.sql.Connection;


import java.util.List;
import java.util.Map;

import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;



public class ManagementServiceImpl {
	public List<Map<String, Object>> userDepartment() throws Exception 
	{
		String sql = "select * from user_management";
		Connection con = DBConnection.getConnection();
		List<Map<String, Object>> result1 = DBUtil.executeSelectQuery(con, sql);
		return result1;

	}
	public List<Map<String, Object>> sellerDepartment() throws Exception 
	{
		String sql = "select * from seller_management";
		Connection con = DBConnection.getConnection();
		List<Map<String, Object>> result2 = DBUtil.executeSelectQuery(con, sql);
		return result2;

	}
	public List<Map<String, Object>> logisticDepartment() throws Exception 
	{
		String sql = "select * from logistic_management";
		Connection con = DBConnection.getConnection();
		List<Map<String, Object>> result3 = DBUtil.executeSelectQuery(con, sql);
		return result3;

	}
	
	public List<Map<String, Object>> adminDepartment() throws Exception 
	{
		String sql = "select * from admin_management";
		Connection con = DBConnection.getConnection();
		List<Map<String, Object>> result4 = DBUtil.executeSelectQuery(con, sql);
		return result4;

	}

}
