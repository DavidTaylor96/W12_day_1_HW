package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private Visitor visitor;

    public Dodgems(String name, int rating, Visitor visitor) {
        super(name, rating);
        this.visitor = visitor;
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        if (this.visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else if (this.visitor.getAge() < 12) {
            return defaultPrice() / 2;
        } else {
            return defaultPrice();
        }
    }
}
