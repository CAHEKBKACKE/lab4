

import Class.Snusmumrik;
import Class.Mu;

public class Main {

    public static void main(String[] args) {

        Snusmumrik snusmumrik = new Snusmumrik();
        snusmumrik.setName("Снусмумрик");

        Mu mu = new Mu();
        mu.setName("Мю");

        System.out.println(mu + " и " + snusmumrik + " " + mu.toDo() + " " + snusmumrik.circumstance(2) + " " + snusmumrik.circumstance(3));
        System.out.println(snusmumrik + " " + snusmumrik.toDo() + " " + snusmumrik.circumstance(1));
        System.out.println(snusmumrik.circumstance(4)+ " " + snusmumrik + " " + snusmumrik.toDo() + " и "  + snusmumrik.see() + " " + mu);
        System.out.println(mu + " " + mu.toBe());
    }


}