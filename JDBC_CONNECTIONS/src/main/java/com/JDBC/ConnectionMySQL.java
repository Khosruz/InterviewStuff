package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;
 

public class ConnectionMySQL {

	@Test(priority = 1, groups = "Customers")
	public void customers_Table() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root","ABcd**12");
	System.out.println("Connected to mysql db");
	Statement st = con.createStatement();
	System.err.println("\nData from Customers Table\n");
	ResultSet rSet =st.executeQuery("select * from customers where NOT (customer_id> 5 OR points > 1000)");
	System.err.println("Customer_id "+"\t"+"First Name "+"\t"+"Last Name "+"\t"+"Birth_Date"+"\t"+"Poients"); 
	// +"\t"+"Phone "+"\t"+"Address"+"\t"+"City"+"\t"+" State "+"\t"+" Poients");
	
	while(rSet.next()) {
		System.out.println(rSet.getString("customer_id")+"\t\t"+rSet.getString("first_name")+"\t\t"+rSet.getString("last_name")+"\t"+
		rSet.getString("birth_date")+" \t"+rSet.getString("points"));
		// +"\t"+rSet.getString("phone")+"\t"+rSet.getString("address")+"\t"+rSet.getString("city")+"\t"+rSet.getString("state")+"\t"+rSet.getString("points"));

	}
	

	}
	@Test(priority = 2, groups = "Orders")
	public void order_Items_Table() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "ABcd**12");
		System.out.println("Connected to mysql db");
		Statement st = con.createStatement();
		System.err.println("\nData from Order Items Table\n");
		ResultSet rSet = st.executeQuery("SELECT * FROM order_items WHERE product_id = 3 or order_id = 6");
		System.err.println("Order_ID " + "\t" + "Product_ID " + "\t" + "Quantity " + "\t" + "Unit_Price ");
		// +"\t"+"Phone "+"\t"+"Address"+"\t"+"City"+"\t"+" State "+"\t"+" Poients");
		while (rSet.next()) {

			System.out.println(rSet.getString("order_id") + "\t\t" + rSet.getString("product_id") + "\t\t"
					+ rSet.getString("quantity") + "\t\t" + rSet.getString("unit_price"));

		}

	}

	@Test(priority = 3, groups = "Products")
	public void products_Table() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "ABcd**12");
		System.out.println("Connected to mysql db");
		Statement st = con.createStatement();
		System.err.println("\nData from Products Table\n");
		ResultSet rSet = st.executeQuery("SELECT * FROM products WHERE product_id >1 and product_id < 5");
		System.err.println("Product_ID " + "\t" + "Name " + "\t" + "Quantity_In_Stock"+ "\t" + "Unit_Price ");
		// +"\t"+"Phone "+"\t"+"Address"+"\t"+"City"+"\t"+" State "+"\t"+" Poients");
		while (rSet.next()) {

			System.out.println(rSet.getString("product_id") + "\t\t" + rSet.getString("name") + "\t\t"
					+ rSet.getString("quantity_in_stock") + "\t\t" + rSet.getString("unit_price"));

		}

	}
	@Test(priority = 4, groups = "Shipper")
	public void shipper_Table() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "ABcd**12");
		System.out.println("Connected to mysql db");
		Statement st = con.createStatement();
		System.err.println("\nData from Shipper Table\n");
		ResultSet rSet = st.executeQuery("\n"+"SELECT * FROM shippers");
		System.err.println("Shipper_ID " + "\t" + "Name ");
		while (rSet.next()) {

			System.out.println(rSet.getString("shipper_id") + "\t\t" + rSet.getString("name"));

		}

	}
}
