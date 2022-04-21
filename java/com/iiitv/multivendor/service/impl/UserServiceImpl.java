package com.iiitv.multivendor.service.impl;


import java.sql.Connection;


import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;

public class UserServiceImpl {	
	public boolean  userSignUp(SignUp dto) throws Exception
	{
		String sql="insert into user_management(user_name, user_MobileNo,user_Email,user_Password) value('"+dto.getName()+"', '"+dto.getMobile()+"', '"+dto.getEmail()+"','"+dto.getPassword()+"')";
		Connection con=DBConnection.getConnection();
		boolean output=DBUtil.executInsertUpdateDelete(con, sql);		
		return output;
	
	}
	
	public int  userLogin(SignUp dto) throws Exception
	{
		String sql="select count(*) as count from user_management where user_Email='"+dto.getEmail()+"' and user_Password='"+dto.getPassword()+"'";
		Connection con=DBConnection.getConnection();
		int output=DBUtil.getresultSetCount(con, sql);		
		return output;
	
	}
	
	
}

