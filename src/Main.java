import Class.*;

public class Main {

    public static void main(String[] args) {

        Snusmumrik snusmumrik = new Snusmumrik();
        snusmumrik.setName("Снусмумрик");

        Mu mu = new Mu();
        mu.setName("Мю");

        EachOther eachOther = new EachOther();
        eachOther.setName("друг на друга");

        MumiTrolls mumiTrolls = new MumiTrolls();
        mumiTrolls.setName("семейство муми-троллей");

        System.out.println(snusmumrik + " и " + mumiTrolls + " " + mumiTrolls.toDo() + " " + snusmumrik.circumstance(3) + " " + snusmumrik.circumstance(2));
        System.out.println(snusmumrik + " " + snusmumrik.toDo() + " " + snusmumrik.circumstance(1));
        System.out.println(snusmumrik.circumstance(4)+ " " + snusmumrik + " " + snusmumrik.toDo() + " и "  + snusmumrik.see() + " " + mu);
        System.out.println(mu + " " + mu.toBe());
        System.out.println(mu + " и " + snusmumrik + " " + eachOther.see() + " " + eachOther);
    }


}