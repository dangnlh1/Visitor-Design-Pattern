package VisitorDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ShoppingCartElement[] items = new ShoppingCartElement[]{
				new Item("Pen", 2.5),
				new Book("Java Design Patterns", 60.0),
				new Fruit("Apple", 1.5, 2.0)
		};
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		double totalCost = 0;
		for (ShoppingCartElement item : items) {
			totalCost += item.accept(visitor);
		}
		System.out.println("Total cost: $" + totalCost);
		SpringApplication.run(Application.class, args);
	}

}
