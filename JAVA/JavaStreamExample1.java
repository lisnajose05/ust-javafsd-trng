package stream.ust;

import java.util.ArrayList;
import java.util.List;

class Product_1{
	int id;
	String name;
	float price;
	public Product_1(int id,String name,Float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample1 {
	public static void main(String[] args) {
		List<Product_1>productsList=new ArrayList<Product_1>();
		productsList.add(new Product_1(1,"HP Laptop",25000f));
		productsList.add(new Product_1(2,"Dell Laptop",30000f));
		productsList.add(new Product_1(3,"Lenevo Laptop",28000f));
		productsList.add(new Product_1(4,"Sony Laptop",28000f));
		productsList.add(new Product_1(5,"Apple Laptop",90000f));
		Float totalPrice=productsList.stream().map(product->product.price).reduce(0.0f, (sum,price)->sum+price);
		System.out.println(totalPrice);
		float totalPrice2=productsList.stream().map(product->product.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
}}
