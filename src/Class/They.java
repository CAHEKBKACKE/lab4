package Class;

import Abstract.Character;
import Interface.Do;
import Interface.See;
import Interface.Sit;

public class They extends Character implements See, Sit, Do {
    private boolean isEnd;
    public static class Friends extends Character {
        public Friends(String name){
            setName(name);
        }
        public String happend(){
            return "";
        }
    }

    public They(String name){
        setName(name);
        isEnd = false;
    }
    @Override
    public String see() {
        return "смотрели ";
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public String sit() {
        return "сидят";
    }

    @Override
    public String toDo() {
        return "празднуют ";
    }



    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

}
