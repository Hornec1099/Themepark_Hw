package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;}

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){return 9.00;}
        else{return 4.50;}
    }

}
