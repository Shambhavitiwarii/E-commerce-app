package com.Main;

import java.util.List;

import com.Entity.Product;
import com.Services.ProductService;

public class Ecommerce {
	public static void main(String[] args) {
		ProductService product = new ProductService();
	List<Product> listOfProduct = product.getAllProducts();
	System.out.println( listOfProduct);
	}

}
