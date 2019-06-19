package ThemePark;

import Attractions.*;
import ThemePark.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;


    public ThemePark(){
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.allReviewed;
    }

    public void addReview(IReviewed item){
        this.allReviewed.add(item);
    }

    public String listAllReviews(){
        HashMap<String, Integer> reviewList = new HashMap<String, Integer>();
        for (IReviewed thing: this.allReviewed) {
            reviewList.put(thing.getName(), thing.getRating());
        }
        return String.valueOf(reviewList);
    }


    
}
