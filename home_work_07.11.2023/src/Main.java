import auto.Auto;
import math.MyMath;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("addAll = " + MyMath.addAll(1, 2, 3, 5));
        System.out.println("minusAll = " + MyMath.minusAll(10, 2, 3));
        System.out.println("multAll = " + MyMath.mutAll(10, 2, 3));
        System.out.println("powAll = " + MyMath.powAll(10, 2, 3));

        Auto auto = new Auto("Sharan", 2.0, "Automatik", "Diesel");
        Auto auto2 = new Auto("Touran", 1.9, "Automatik", "Diesel");
        Auto auto3 = new Auto("Tiguan", 1.8, "Automatik", "Diesel");
        Auto[] autos = {auto, auto2, auto3};
        System.out.println(Arrays.toString(autos));

    }
}