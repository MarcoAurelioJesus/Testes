package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	
	
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

		//list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		
		list.removeIf(p -> p.getPrice().equals(900.0));
		
		list.removeIf(Product::testPredicate);
		
		list.removeIf(Product::testPredicateStatic);
		
		Predicate<Product> pred = p -> p.getPrice().equals(50.0);
		
		list.removeIf(pred);
		

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
