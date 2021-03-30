import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ThemeParkTest {

    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    Playground playground;

    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    ThemePark themePark;

    Visitor visitor;



    @Before
    public void before(){

        visitor = new Visitor(24, 188.00, 50.00);

        dodgems = new Dodgems("Bumper Cars", 5, visitor);
        playground = new Playground("Fun Zone", 7, visitor);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, visitor);

        candyflossStall = new CandyflossStall("Candy Land", "David", ParkingSpot.A4);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, visitor);

        themePark = new ThemePark("TaylorPark", visitor);
    }

    @Test
    public void hasAttractionList(){
        themePark.addStallsAndAttractions(dodgems);
        themePark.addStallsAndAttractions(playground);
        themePark.addStallsAndAttractions(rollerCoaster);

        assertEquals(3, themePark.getStallAndAttractionList());
    }

    @Test
    public void hasStallList(){
        themePark.addStallsAndAttractions(candyflossStall);
        themePark.addStallsAndAttractions(iceCreamStall);
        themePark.addStallsAndAttractions(tobaccoStall);
        assertEquals(3, themePark.getStallAndAttractionList());

    }

    @Test
    public void canGetAllReviews(){
        themePark.addStallsAndAttractions(dodgems);
        themePark.addStallsAndAttractions(playground);
        themePark.addStallsAndAttractions(rollerCoaster);
        themePark.addStallsAndAttractions(candyflossStall);
        themePark.addStallsAndAttractions(iceCreamStall);
        themePark.addStallsAndAttractions(tobaccoStall);

        ArrayList<IReviewed> addToReview = new ArrayList<>();
        addToReview.add(dodgems);
        addToReview.add(playground);
        addToReview.add(rollerCoaster);
        addToReview.add(candyflossStall);
        addToReview.add(iceCreamStall);
        addToReview.add(tobaccoStall);

        assertEquals(themePark.getAllReviewed(), addToReview);

    }

    @Test
    public void canCountTheVisited(){
        themePark.addStallsAndAttractions(dodgems);
        themePark.addStallsAndAttractions(tobaccoStall);
        themePark.addStallsAndAttractions(rollerCoaster);

        themePark.visit(visitor, dodgems);

        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor.getNumberOfVisited());

    }

    @Te

}