package Classes;



import Abstract.Character;
import Interface.Do;
import Interface.Be;
import Interface.See;

public class Mu extends Character implements Do, See, Be{


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
}