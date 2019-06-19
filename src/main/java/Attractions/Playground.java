package Attractions;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating){
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        boolean allowedIn = false;
        if(visitor.getAge() < 16){
            allowedIn = true;
        }
        return allowedIn;
    }
}
