package Stalls;

import ThemePark.IReviewed;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class CandyFlossStall extends Stall implements ITicketed, IReviewed {

    public CandyFlossStall(String name, String ownerName, String parkingSpace, int rating){
        super(name, ownerName, parkingSpace, rating);
    }

    public double defaultPrice() {
        return 4.20;
    }

    public double priceFor(Visitor visitor) {
        return 4.20;
    }
}
