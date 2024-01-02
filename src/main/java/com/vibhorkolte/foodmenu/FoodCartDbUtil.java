package com.vibhorkolte.foodmenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FoodCartDbUtil {
	
	public static List<Food> getFoodList() {
		String url = "jdbc:mysql//localhost:3306/Product?useSSL=false";
		String username = "root";
		String password = "root";
		ArrayList<Food> food = new ArrayList<>();
		
		
		try {
			// load my-sql driver
			Class.forName("com.mysql.jdbc.Driver");
			// get connection
			Connection con = DriverManager.getConnection(url, username, password);
			// create a statement
			Statement stmt = con.createStatement();
			// execute the statement and loop over the result set
			ResultSet rs = stmt.executeQuery("select * from foodcart");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String item = rs.getString(2);
				float price = rs.getFloat(3);
				
				Food f = new Food(id, item, price);
				food.add(f);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return food;
	}

}
