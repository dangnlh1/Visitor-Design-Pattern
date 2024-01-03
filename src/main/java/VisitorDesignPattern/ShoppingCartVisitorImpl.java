package VisitorDesignPattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor  {
    @Override
    public double visit(Item item) {
        return item.getPrice();
    }

    @Override
    public double visit(Book book) {
        double cost = book.getPrice();
        if (book.getPrice() > 50) {
            cost -= 5; // Apply discount for expensive books
        }
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        return fruit.getPricePerKg() * fruit.getWeight();
    }
}
