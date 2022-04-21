package com.iiitv.multivendor.service.impl;

import java.sql.Connection;



import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;

public class LogisticServiceImpl 
{
	public boolean logisticSignUp(SignUp dto) throws Exception
	{
		String sql="insert into logistic_management(name,mobile_no,email,password,aadhar_card,pan_card,address) value('"+dto.getName()+"', '"+dto.getMobile()+"', '"+dto.getEmail()+"','"+dto.getPassword()+"', '"+dto.getAadhar()+"', '"+dto.getPan()+"','"+dto.getAddress()+"')";
		System.out.println(sql);
		Connection con=DBConnection.getConnection();
		boolean output=DBUtil.executInsertUpdateDelete(con, sql);
		return output;
		
	}
	
	
	public int  logisticLogin(SignUp dto) throws Exception
	{
		String sql="select count(*) as count from logistic_management where email ='"+dto.getEmail()+"' and password ='"+dto.getPassword()+"'";
		Connection con=DBConnection.getConnection();
		int output=DBUtil.getresultSetCount(con, sql);		
		return output;
	
	}
	
	
}

