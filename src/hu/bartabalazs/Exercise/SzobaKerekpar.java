package hu.bartabalazs.Exercise;

import hu.bartabalazs.set.Set;

public class SzobaKerekpar {
    private static Set<Integer> feleseg;
    private static Set<Integer> ferj;

    public static void run(){
        feleseg = new Set<>();
        feleseg.add(1);
        feleseg.add(3);
        feleseg.add(4);
        feleseg.add(5);
        feleseg.add(7);
        feleseg.add(8);
        feleseg.add(9);
        feleseg.add(10);
        feleseg.add(14);
        feleseg.add(17);
        feleseg.add(18);
        feleseg.add(19);
        feleseg.add(20);
        feleseg.add(24);
        feleseg.add(27);

        ferj = new Set<>();
        ferj.add(7);
        ferj.add(13);
        ferj.add(14);
        ferj.add(15);
        ferj.add(20);
        ferj.add(21);
        ferj.add(23);
        ferj.add(24);
        ferj.add(25);
        ferj.add(29);
        ferj.add(30);
        Set<Integer> unio = feleseg.unio(ferj);
        System.out.println(String.format("%d napon használják a biciklit!", unio.getSize()));
        System.out.println(String.format("%f a szobakerékpár hisználtsága.",unio.getSize()/31.0));
    }
}
