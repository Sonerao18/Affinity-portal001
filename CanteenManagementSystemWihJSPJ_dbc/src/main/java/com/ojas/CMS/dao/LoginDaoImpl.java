package com.ojas.CMS.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ojas.CMS.db.DBUtility;
import com.ojas.CMS.query.query;

public class LoginDaoImpl implements LoginDAO {

	
	public String login(String uname, String password) {
		
		String userRole = null;
		Connection con=null;
	     System.out.println("hello ");
		try {
			System.out.println("whats is problem?");
			Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("show driver "+Class.forName("com.mysql.jdbc.Driver").getName());
			 
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
		System.out.println("con"+con.getSchema());
		System.out.println(con+"con");
		PreparedStatement ps = con.prepareStatement(query.LOGINUSE);
		ps.setString(1, uname);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		rs.next();
		userRole = rs.getString("rname");
		} catch (Exception e) {
	
		e.printStackTrace();
		}
		return userRole;
	}

	@Override
	public String forgotPassword(String uname,String type) {
		String password=null;
		Connection con=null;
		try {
		PreparedStatement ps = con.prepareStatement(query.FORGOTUSER);
				ps.setString(1,uname );
				ps.setString(2, type);
				ResultSet rs = ps.executeQuery();
				rs.next();
				password = rs.getString(1);
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				return password;
	}
	
	

	
}
