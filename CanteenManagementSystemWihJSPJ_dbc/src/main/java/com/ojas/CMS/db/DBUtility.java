package com.ojas.CMS.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtility {

	public static Connection getConnection() {
		Connection con = null;
		try {
			File path = new File(
					"E:\\SringBootPractice\\Spring Boot MVC\\CanteenManagementSystemWihJSPJ_dbc\\src\\main\\resorces\\db.properties");
			FileInputStream fis = new FileInputStream(path);
			Properties p = new Properties();
			p.load(fis);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
