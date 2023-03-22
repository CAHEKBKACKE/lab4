import Class.*;
import Exceptions.IsEndException;

public class Main {

    public static void main(String[] args) {

        Snusmumrik snusmumrik = new Snusmumrik("Снусмумрик");

        Mu mu = new Mu("Мю");

        mu.setName("Мю");

        They they = new They("Они");

        MumiTrolls mumiTrolls = new MumiTrolls("семейство муми-троллей");

        Pot pot = new Pot("кастрюля");

        They.Friends friends = new They.Friends("друзьями"){
            @Override
            public String happend(){
                return "случилось";
            }
        };

        System.out.println(snusmumrik + " и " + mumiTrolls + " " + mumiTrolls.toDo() + " " + snusmumrik.circumstance(3) + " " + snusmumrik.circumstance(2));
        System.out.println(snusmumrik + " " + snusmumrik.toDo() + " " + snusmumrik.circumstance(1));
        System.out.println(snusmumrik.circumstance(4)+ " " + snusmumrik + " " + snusmumrik.toDo() + " и "  + snusmumrik.see() + " " + mu);
        System.out.println(mu + " " + mu.toBe());
        System.out.println(snusmumrik + " " + snusmumrik.breath());
        System.out.println(snusmumrik + " " + snusmumrik.show() + " " + pot + " " + pot.content());
        System.out.println(pot + " " + pot.content() +  " " + pot.sit());
        System.out.println(mu + " " + mu.laugh());
        System.out.println(mu +  " " + mu.swallow() +  " " + mu.food() +  " и " + mu +  " " + mu.eat() +  " " + mu.food());
        System.out.println(snusmumrik +  " " + snusmumrik.go() +  " " + snusmumrik.circumstance(4));
        System.out.println(snusmumrik +  " " + snusmumrik.know() +  " " + friends.happend() +  " c " + friends +  " и " + snusmumrik.think() +  " " + they +  " " + they.sit() +  " и " + they.toDo() + "день летнего солнцестояния");


        they.setEnd(true);

        try {
            if (endOfTheDay(they)) {
                System.out.println("Конец дня солцнестояния");
            }
        } catch (IsEndException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean endOfTheDay(They they) throws IsEndException {
        if (they.isEnd()) {
            return true;
        } else {
            throw new IsEndException();
        }
    }


}