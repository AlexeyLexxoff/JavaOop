package OOP.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Hero> heroesWhite = new ArrayList<>();
        ArrayList<Hero> heroesBlack = new ArrayList<>();


        Hero hero1 = new Crossbower("Dimon");
        Hero hero2 = new Monk("Sanek");
        Hero hero3 = new Rogue("Slavik");
        Hero hero4 = new Peasant("Romich");
        Hero hero5 = new Pikeman("Ivan");
        Hero hero6 = new Wizard("Gendlf");
        Hero hero7 = new Sniper("Volodya");

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        heroesBlack.forEach(n -> System.out.println(n.toString()));
    }


}
