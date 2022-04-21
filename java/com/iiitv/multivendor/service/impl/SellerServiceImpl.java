package com.iiitv.multivendor.service.impl;

import java.sql.Connection;




import com.iiitv.multivendor.DTO.SignUp;
import com.iiitv.multivendor.util.DBConnection;
import com.iiitv.multivendor.util.DBUtil;

public class SellerServiceImpl 
{
	public boolean sellerSignUp(SignUp dto) throws Exception
	{
		String sql="insert into seller_management(seller_name,seller_password,seller_Email,seller_pancard,seller_AadharCard,seller_GSTIN_No,seller_Address,seller_MobileNo,account_number,ifsc_code) value('"+dto.getName()+"', '"+dto.getPassword()+"','"+dto.getEmail()+"', '"+dto.getPan()+"','"+dto.getAadhar()+"', '"+dto.getGstin()+"','"+dto.getAddress()+"','"+dto.getMobile()+"', '"+dto.getAccountnumber()+"','"+dto.getGstin()+"')";
		System.out.print(sql);
		Connection con=DBConnection.getConnection();
		boolean output=DBUtil.executInsertUpdateDelete(con, sql);
		return output;
		
	}
	
	
	public int  sellerLogin(SignUp dto) throws Exception
	{
		String sql="select count(*) as count from seller_management where seller_Email ='"+dto.getEmail()+"' and seller_password ='"+dto.getPassword()+"'";
		Connection con=DBConnection.getConnection();
		int output=DBUtil.getresultSetCount(con, sql);		
		return output;
	
	}
	
	
	
}

