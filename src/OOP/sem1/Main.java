package OOP.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        heroesWhite = generateCommand(0,0);
        heroesBlack = generateCommand(3,9);
        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("****************************");
        heroesBlack.forEach(n -> n.printEnemysDistance(heroesWhite));


    }

    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;

        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5)+n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName(),i,y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(),i,y));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(),i,y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(),i,y));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName(),i,y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(),i,y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(),i,y));
                    break;
            }

        }


        return commandHeroes;

    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();

    }


}
