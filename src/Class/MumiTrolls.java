package Class;

import Abstract.Character;
import Interface.Do;

public class MumiTrolls extends Character implements Do {


    public MumiTrolls(String name){
        setName(name);
    }
    @Override
    public String toDo() {
        return "оказались";
    }
}
