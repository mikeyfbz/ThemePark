package Stalls;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class AlcoholStall extends Stall implements ITicketed, ISecurity, IReviewed {

    public AlcoholStall(String name, String ownerName, String parkingSpace, int rating){
        super(name, ownerName, parkingSpace, rating);
    }

    public double defaultPrice() {
        return 12.50;
    }

    public double priceFor(Visitor visitor) {
        return 12.50;
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean allowedIn = false;
        if(visitor.getAge() > 17){
            allowedIn = true;
        }
        return allowedIn;
    }
}
