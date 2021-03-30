package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, Visitor visitor) {
        super(name, ownerName, parkingSpot);
        this.visitor = visitor;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(this.visitor.getAge() > 18){
            return true;
        }
        return false;
    }

    public int getRating() {
        return 0;
    }
}
