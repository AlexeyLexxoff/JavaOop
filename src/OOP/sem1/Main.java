package OOP.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//
//
//        Hero hero1 = new Crossbower("Dimon");
//        Hero hero2 = new Monk("Sanek");
//        Hero hero3 = new Rogue("Slavik");
//        Hero hero4 = new Peasant("Romich");
//        Hero hero5 = new Pikeman("Ivan");
//        Hero hero6 = new Wizard("Gendlf");
//        Hero hero7 = new Sniper("Volodya");

        heroesWhite = generateCommand(0);
        heroesBlack = generateCommand(3);
        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("****************************");
        heroesBlack.forEach(n -> System.out.println(n.toString()));


    }

    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5)+n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName()));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName()));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName()));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName()));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName()));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName()));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName()));
                    break;
            }

        }


        return commandHeroes;
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }


}
