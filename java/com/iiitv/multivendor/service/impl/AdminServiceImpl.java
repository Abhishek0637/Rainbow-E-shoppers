package com.iiitv.multivendor.service.impl;

import java.sql.Connection;


import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;

public class AdminServiceImpl 
{
	public boolean adminSignUp(SignUp dto) throws Exception
	{
		String sql="insert into admin_management(admin_name,admin_password,admin_mobileNO,admin_aadhar_card,admin_pan_card,admin_email) value('"+dto.getName()+"','"+dto.getPassword()+"', '"+dto.getMobile()+"', '"+dto.getAadhar()+"',"+dto.getPan()+"','"+dto.getEmail()+"')";
		System.out.println(sql);
		Connection con=DBConnection.getConnection();
		boolean output=DBUtil.executInsertUpdateDelete(con, sql);
		return output;
		
	}
	
	public int  adminLogin(SignUp dto) throws Exception
	{
		String sql="select count(*) as count from admin_management where admin_email='"+dto.getEmail()+"' and admin_password='"+dto.getPassword()+"'";
		Connection con=DBConnection.getConnection();
		int output=DBUtil.getresultSetCount(con, sql);		
		return output;
	
	}
	
	
}

