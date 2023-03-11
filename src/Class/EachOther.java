package Class;

import Abstract.Character;
import Interface.See;

public class EachOther extends Character implements See {

    @Override
    public String see() {
        return "смотрели ";
    }
}
