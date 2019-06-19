package Stalls;

import ThemePark.IReviewed;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class IceCreamStall extends Stall implements ITicketed, IReviewed {

    public IceCreamStall(String name, String ownerName, String parkingSpace, int rating){
        super(name, ownerName, parkingSpace, rating);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        return 2.80;
    }
}
