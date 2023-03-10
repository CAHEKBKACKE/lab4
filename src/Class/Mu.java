package Class;



import Abstract.Character;
import Interface.Do;
import Interface.Be;
import Interface.See;

public class Mu extends Character implements Do, See, Be{


    @Override
    public String toDo() {
        return "стоял";
    }

    @Override
    public String see() {
        return "таращился на ";
    }

    @Override
    public String toBe() {
        return "была такой маленькой";
    }
}