import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.RollerCoaster;
import Stalls.AlcoholStall;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import ThemePark.ThemePark;
import org.junit.Before;
import ThemePark.Visitor;
import org.junit.Test;
import ThemePark.IReviewed;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Park park;
    Playground playground;
    IceCreamStall iceCreamStall;
    CandyFlossStall candyFlossStall;
    AlcoholStall alcoholStall;
    Visitor visitor;
    ArrayList<IReviewed> allReviewed;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Big Dipper", 4);
        dodgems = new Dodgems("Bumpers", 3);
        park = new Park("Fun Land", 1);
        playground = new Playground("Adventure Land", 2);
        candyFlossStall = new CandyFlossStall("Sticky Fingers", "Mrs Floss", "A5", 3);
        iceCreamStall = new IceCreamStall("Sticky Fingers", "Mrs Floss", "A6", 4);
        alcoholStall = new AlcoholStall("Boozy Cow", "Barney", "Z2", 4);
        visitor = new Visitor(20, 160, 50);
        allReviewed = new ArrayList<IReviewed>();

    }

    @Test
    public void canGetAllReviewed(){
        allReviewed.add(rollerCoaster);
        allReviewed.add(dodgems);
        allReviewed.add(park);
        allReviewed.add(playground);
        allReviewed.add(candyFlossStall);
        allReviewed.add(iceCreamStall);
        allReviewed.add(alcoholStall);
        themePark.addReview(rollerCoaster);
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(playground);
        themePark.addReview(candyFlossStall);
        themePark.addReview(iceCreamStall);
        themePark.addReview(alcoholStall);
        assertEquals(allReviewed, themePark.getAllReviewed());
    }

    @Test
    public void canGetListOfAllRatings(){
        allReviewed.add(rollerCoaster);
        allReviewed.add(dodgems);
        allReviewed.add(park);
        allReviewed.add(playground);
        allReviewed.add(candyFlossStall);
        allReviewed.add(iceCreamStall);
        allReviewed.add(alcoholStall);
        themePark.addReview(rollerCoaster);
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(playground);
        themePark.addReview(candyFlossStall);
        themePark.addReview(iceCreamStall);
        themePark.addReview(alcoholStall);
        assertEquals("{Big Dipper=4, Bumpers=3, Sticky Fingers=4, Adventure Land=2, Fun Land=1, Boozy Cow=4}", themePark.listAllReviews());
    }

    @Test
    public void canGetListOfAllAttractionsForAVisitor(){
        Visitor visitor = new Visitor(10, 120, 50);
        allReviewed.add(park);
        allReviewed.add(playground);
        allReviewed.add(candyFlossStall);
        allReviewed.add(iceCreamStall);
        themePark.addReview(rollerCoaster);
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(playground);
        themePark.addReview(candyFlossStall);
        themePark.addReview(iceCreamStall);
        themePark.addReview(alcoholStall);
        assertEquals(allReviewed, themePark.getAllAllowedFor(visitor));
    }

}
