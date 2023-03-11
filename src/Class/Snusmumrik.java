package Class;

import Abstract.Character;
import Interface.Do;
import Interface.See;

public class Snusmumrik extends Character implements Do, See {
    Circumstances current;
    @Override
    public String toDo() {
        return "стоял";
    }

    @Override
    public String see() {
        return "таращился на ";
    }
    public String circumstance(int i){
        switch (i) {
            case 1 -> {
                this.current = Circumstances.SHORE;
                return "на берегу";
            }
            case 2 -> {
                this.current = Circumstances.EVENING;
                return "в самый вечер летнего солнцестояния";
            }
            case 3 -> {
                this.current = Circumstances.BAY;
                return "в одном и том же заливе";
            }
            case 4 -> {
                this.current = Circumstances.HAT;
                return "В старой зеленой шляпе";
            }
        }

        return "";
    }
}