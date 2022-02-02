package com.web.postgres.webpost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchPostgre {


	@GetMapping("/fetchpo")
	@ResponseBody 
	public String welcome() {

		
	
	
		System.out.print("Display the Record");
		System.out.print("<table border='1'><tr><th>Id</th><th>Name</th><th>add1</th></tr>");
		
	try {
		Class.forName("org.postgresql.Driver"); // step - loading driver
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/HR_Management","postgres","admin"); //step 2 creating connection
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from user1");
		while(rs.next()) {
			System.out.print("<tr><td>");
			System.out.print(rs.getString(1));
			System.out.print("</td>");
			System.out.print("<td>");
			System.out.print(rs.getString(2));
			System.out.print("</td>");
			System.out.print("<td>");
			System.out.print(rs.getString(3));
			System.out.print("</td>");
			System.out.print("</tr>");
		}
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.print("</table>");
	return "Display records";
}
}
	

