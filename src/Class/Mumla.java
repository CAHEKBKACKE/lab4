package Class;

import Abstract.Character;
import Interface.Be;
import Interface.Do;
import Interface.See;

public class Mumla extends Character implements Do {


    public Mumla(String name){
        setName(name);
    }
    @Override
    public String toDo() {
        return "посадила";
    }


}