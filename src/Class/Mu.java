package Class;

import Abstract.Character;
import Interface.*;

public class Mu extends Character implements Do, See, Be, Eat, Laugh, Swallow {

    public Mu(String name){
        setName(name);
    }

    Food current;


    public String food(){
        if (Math.random() >= 0.5) {
            current = Food.COFFEE;
        } else {
            current = Food.PEAS;
        }

        return switch (current) {
            case PEAS -> "четыре горошины";
            case COFFEE -> "две чайных ложечки кофе";
        };
    }

    @Override
    public String toDo() {
        return "оказались";
    }

    @Override
    public String see() {
        return "таращилась на ";
    }

    @Override
    public String toBe() {
        return "была такой маленькой";
    }

    @Override
    public String laugh() {
        return "презрительно засмеялась";
    }

    @Override
    public String eat() {
        return "съела";
    }

    @Override
    public String swallow() {
        return "проглотила";
    }
}