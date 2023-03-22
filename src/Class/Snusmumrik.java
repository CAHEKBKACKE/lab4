package Class;

import Abstract.Character;
import Interface.*;

public class Snusmumrik extends Character implements Do, See, Go, Know, Think, Show, Breath {

    private class Hat{
        public String inHat(){
            return " в старой зеленой шляпе";
        }
    }
    public Snusmumrik(String name){
        setName(name);
    }
    Circumstances current;
    @Override
    public String toDo() {
        Hat hat = new Hat();
        if (Math.random() <= 0.3) {
            return "стоял" + hat.inHat();
        } else {
            return "стоял";
        }
    }


    @Override
    public String see() {
        try {
            if (Math.random() <= 0.5)
                return "таращился на ";
            else
                throw new NullPointerException();
        } catch (NullPointerException e) {
            return "любовался";
        }
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
                this.current = Circumstances.FIELDS;
                return "по прибрежныи лугам";
            }
        }

        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String go() {
        return "отправился";
    }

    @Override
    public String know() {
        return "не имел представления о том,что ";
    }

    @Override
    public String think() {
        return "полагал";
    }

    @Override
    public String show() {
        return "показал на";
    }
    @Override
    public String breath() {
        return "вздохнул";
    }


}