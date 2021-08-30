import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> facilities;
    private String name;

    public ThemePark(String name){
        this.facilities = new ArrayList<IReviewed>();
        this.name = name;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return facilities;
    }
}
