package com.zensar;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.bean.Student;
import com.zensar.utility.DButil;

public class LoginRepository {
	
	public void addStudent(Student student ) {
		Connection con = DButil.getMysqldbConnection();
		String sql = "insert into student1 values (?,?,?)";
		try {
	    PreparedStatement pst = con.prepareStatement(sql);
	    pst.setInt(1, student.getId());
	    pst.setString(2, student.getName());
	    pst.setString(3, student.getCourse());
	    int result = pst.executeUpdate();
	    if(result ==0) {
	    	System.out.println("database Operation failed");
	    }else
	    {
	    	System.out.println("Database operation succesful");
	    }
		}catch(Exception e){
			System.out.println("Exception Occured");
		}
	    
		
	}
	
	public boolean checklogin(String username,String password) {
		boolean result= false;
		Connection con = DButil.getMysqldbConnection();
		String sql = "select * from logindetails where username=?";
		PreparedStatement pst;
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String passwordfromdb = rs.getString("password");
				if(passwordfromdb.equals(password))
					result=true;
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occured"+ e);
		}
		return result;
		
	}

}
