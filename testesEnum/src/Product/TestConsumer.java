package Product;

import java.util.ArrayList;
import java.util.List;

public class TestConsumer {
	
	public static void test(Product p){
		p.setPrice(p.getPrice() * 1.1);
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("PHONE", 40.00));
		list.add(new Product("IPHONE", 5200.00));
		list.add(new Product("CELPHONE", 100.00));
		list.add(new Product("SMARTPHONE", 200.00));
		list.add(new Product("SMARTPHONE", 50.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		//list.forEach(TestConsumer::test);
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
	}
}
