package Class;

import Interface.Do;
import Abstract.Character;

public class MumiTrolls extends Character implements Do {

    @Override
    public String toDo() {
        return "оказались";
    }
}
