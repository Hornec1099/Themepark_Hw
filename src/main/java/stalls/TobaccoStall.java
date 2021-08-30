package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot,rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 145 && visitor.getAge() > 12;
    }
}
