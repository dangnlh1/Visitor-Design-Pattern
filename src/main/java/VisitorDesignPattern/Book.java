package VisitorDesignPattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book implements ShoppingCartElement {
    private String title;
    private double price;
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
