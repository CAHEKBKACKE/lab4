

import Class.Snus;
import Class.Mu;

public class Main {

    public static void main(String[] args) {

        Snus snus = new Snus();
        snus.setName("Снусмурик");

        Mu mu = new Mu();
        mu.setName("Мю");


        System.out.println(snus + " " + snus.see() + mu);
        System.out.println(mu + " " + mu.toBe());
    }


}