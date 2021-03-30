package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    private Visitor visitor;



    public Playground(String name, int rating, Visitor visitor) {
        super(name, rating);
        this.visitor = visitor;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(this.visitor.getAge() < 15){
            return true;
        }
        return false;
    }
}
