package net.kau.diyscheduler.home;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml"); 

		DataSource bean = ctx.getBean("dataSource", DataSource.class);
		Connection conn = null;
		String str = null;
		try {
			System.out.println("getConnection() start");

			conn = bean.getConnection(); // connection �뼸湲�

			CallableStatement ss = conn.prepareCall("{call jaeshim2()}");

			ResultSet r = ss.executeQuery();

			
			while (r.next()) {
				System.out.println(r.getString(1));
				str +=r.getString(1)+"\n";
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
		model.addAttribute("str",str);
		return "home/home";
	}
}
