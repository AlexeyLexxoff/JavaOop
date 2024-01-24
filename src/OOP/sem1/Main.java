package OOP.sem1;

import OOP.sem1.Heroes.*;
import OOP.sem1.TypeOfHeroes.HealerHero;
import OOP.sem1.TypeOfHeroes.MeleeHero;
import OOP.sem1.TypeOfHeroes.Peasant;
import OOP.sem1.TypeOfHeroes.RangeHero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        heroesWhite = generateCommand(0,1);
        heroesBlack = generateCommand(3,10);
        twoCommands.addAll(heroesBlack);
        twoCommands.addAll(heroesWhite);
        twoCommands.sort(((o1, o2) -> o2.getInitiative()- o1.getInitiative())); //сортировка лямбдой
        twoCommands.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o2.getInitiative() - o1.getInitiative();
            }
        });
        Scanner scanner = new Scanner(System.in);
        while (true){
            View.view();
            for (Hero h: twoCommands) {
                if (heroesBlack.contains(h)){
                    h.gameStep(heroesWhite, heroesBlack);
                } else {
                    h.gameStep(heroesBlack, heroesWhite);
                }
            }
            scanner.nextLine();
        }

//        twoCommands.forEach(n-> System.out.println(n.getInitiative())); // Печать инициативы
//
//        heroesWhite.forEach(n -> System.out.println(n.toString())); // Печать команды
//        System.out.println("**************************");
//        heroesBlack.forEach(n -> n.printEnemysDistance(heroesWhite)); // Печать расстояния до противника
//
//
//        Peasant village = new Peasant("Василий", 0, 0);
//        RangeHero hunter1 = new Sniper("Димон", 2,0);
//        RangeHero hunter2 = new Sniper("Мишка", 4, 0);
//        MeleeHero enemy = new Rogue("Николай", 9, 9);
//        HealerHero enemy2 = new Wizard("Владимир",7,9);
//        MeleeHero war1 = new Pikeman("Витёк", 5, 0);
//        MeleeHero war2 = new Pikeman("Лёха", 9, 8);
//        RangeHero hunter3 = new Sniper("Санек", 9,7);
//        System.out.println("Созданы персонажи");
//        System.out.println(village);
//        System.out.println(hunter1);
//        System.out.println(hunter2);
//        System.out.println(war1);
//        System.out.println(war2);
//        System.out.println(enemy);
//        System.out.println(enemy2);
//        System.out.println(hunter3);
//        System.out.println(">>>>>>>>><<<<<<<<<<");
//        hunter1.getShoot(enemy);
//        System.out.println(">>>Выстрел!");
//        System.out.println(hunter1);
//        System.out.println(enemy);
//        hunter1.getShoot(enemy);
//        System.out.println(">>>Выстрел!");
//        System.out.println(hunter1);
//        System.out.println(enemy);
//        hunter2.getShoot(enemy);
//        System.out.println(">>>Выстрел!");
//        System.out.println(hunter2);
//        System.out.println(enemy);
//        hunter3.getShoot(enemy);
//        System.out.println(">>>Выстрел!");
//        System.out.println(hunter3);
//        System.out.println(enemy);
//        village.getArrow(hunter1);
//        System.out.println(">>>Припасы!!!");
//        System.out.println(hunter1);
//        village.getArrow(hunter1);
//        System.out.println(">>>Припасы!!!");
//        System.out.println(hunter1);
//        village.getArrow(hunter1);
//        System.out.println(">>>Припасы!!!");
//        System.out.println(hunter1);
//        enemy2.getHealing(enemy);
//        System.out.println(enemy);
//        war1.getDamage(enemy);
//        System.out.println("Пехота в атаку!!!");
//        System.out.println(enemy);
//        war2.getDamage(enemy);
//        System.out.println("Пехота в атаку!!!");
//        System.out.println(enemy);

    }

    public static ArrayList<Hero> heroesWhite = new ArrayList<>();
    public static ArrayList<Hero> heroesBlack = new ArrayList<>();
    public static ArrayList<Hero> twoCommands = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;


        for (int i = 1; i < 11; i++) {
            rand = random.nextInt(1, 5) + n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName(), i, y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(), i, y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(), i, y));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(), i, y));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName(), i, y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(), i, y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(), i, y));
                    break;

            }
        }
        return commandHeroes;
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }
}