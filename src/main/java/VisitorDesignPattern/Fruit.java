package VisitorDesignPattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fruit implements ShoppingCartElement {
    private String name;
    private double pricePerKg;
    private double weight;

    public Fruit(String name, double pricePerKg, double weight) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
