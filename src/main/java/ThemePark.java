import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark{

    private String name;
    private Visitor visitor;

    private ArrayList<IReviewed> stallsAndAttractionList;

    public ThemePark(String name, Visitor visitor){
        this.name = name;
        this.visitor = visitor;
        this.stallsAndAttractionList = new ArrayList<>();
    }

    public int getStallAndAttractionList(){
        return stallsAndAttractionList.size();
    }

    public void addStallsAndAttractions(IReviewed review){
        this.stallsAndAttractionList.add(review);
    }


    public ArrayList<IReviewed> getAllReviewed() {
        return this.stallsAndAttractionList;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visited(attraction);
        attraction.addVisitCount();
    }
}
