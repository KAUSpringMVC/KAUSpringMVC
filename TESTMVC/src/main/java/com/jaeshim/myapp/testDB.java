package com.jaeshim.myapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.GenericXmlApplicationContext;

public class testDB {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml");

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource(classpath));

		DataSource bean = ctx.getBean("dataSource", DataSource.class);

		Connection conn = null;

		try {

			System.out.println("getConnection() start");

			conn = bean.getConnection();

			String sql = "select * from student";

			// PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = null;

			CallableStatement ss = conn.prepareCall("{call jaeshim2()}");
					

			ResultSet r = ss.executeQuery();
			
			while(r.next()){		
			
				System.out.println(r.getString(1));
			}
			

			System.out.println("getConnection() end");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}
			;

		}

	}

}
