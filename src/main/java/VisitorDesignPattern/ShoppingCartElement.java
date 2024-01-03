package VisitorDesignPattern;

public interface ShoppingCartElement {
    double accept(ShoppingCartVisitor visitor);
}
