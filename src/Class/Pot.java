package Class;

import Abstract.Dish;
import Interface.Sit;

public class Pot extends Dish implements Sit {


    public Pot(String title){setTitle(title);}
    Food current;


    public String content(){
        if (Math.random() >= 0.5) {
            current = Food.COFFEE;
        } else {
            current = Food.PEAS;
        }

        return switch (current) {
            case PEAS -> "с горошком";
            case COFFEE -> "с горячим кофе";
        };
    }

    @Override
    public String sit() {
        return "стояла";
    }
}