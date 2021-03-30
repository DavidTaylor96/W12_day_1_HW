package behaviours;

import org.omg.CORBA.portable.ValueInputStream;
import people.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}
