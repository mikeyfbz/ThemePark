package Attractions;

import ThemePark.IReviewed;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        double halfPrice = 0;
        if(visitor.getAge() < 12) {
            return defaultPrice() / 2;
        }
        return halfPrice;
    }
}
