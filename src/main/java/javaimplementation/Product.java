package javaimplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productname;
	private int price;

	public Product(String productname, int price) {

		this.productname = productname;
		this.price = price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//creating Array list methods to return the list of elements 
	public List<String> getProductList() {

		List<String> productlist = new ArrayList<>();

		productlist.add("Samsung Tablets");
		productlist.add("AppleMacbbok");
		productlist.add("Samsung Galaxy");
		productlist.add("Apple Iphone");

		return productlist;
	}
	
}
