package com.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Product;
import com.Repository.DatabaseConnection;

public class ProductService {
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products");
				ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				products.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("description"),
						rs.getString("price"), rs.getInt("quantity")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
}
