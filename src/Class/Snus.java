package Class;



import Abstract.Character;
import Interface.Do;
import Interface.See;

public class Snus extends Character implements Do, See{


    @Override
    public String toDo() {
        return "стоял";
    }

    @Override
    public String see() {
        return "таращился на ";
    }
}