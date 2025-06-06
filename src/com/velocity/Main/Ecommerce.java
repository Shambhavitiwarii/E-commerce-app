package com.velocity.Main;

import java.util.List;

import com.velocity.Entity.Product;
import com.velocity.Services.ProductService;

public class Ecommerce {
	public static void main(String[] args) {
		ProductService product = new ProductService();
	List<Product> listOfProduct = product.getAllProducts();
	System.out.println( listOfProduct);
	}

}
