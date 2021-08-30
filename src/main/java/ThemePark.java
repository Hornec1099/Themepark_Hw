import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> facilities;
    private String name;

    public ThemePark(String name){
        this.facilities = new ArrayList<IReviewed>();
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public ArrayList<IReviewed> getFacilities() {
        return facilities;
    }

    public void addFacility(IReviewed reviewed){
        facilities.add(reviewed);
    }


    public void addVisitToAttraction(Visitor visitor, Attraction attraction) {
        visitor.addVisitedAttraction(attraction);
        attraction.addVisitCount();
    }
}
