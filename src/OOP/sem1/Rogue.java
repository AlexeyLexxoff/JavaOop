package OOP.sem1;

public class Rogue extends Hero {


    public Rogue(String nameHero) {
        super(100,
                100,
                5,
                new int[]{20, 30},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Разбойник:  " + nameHero + "здоровте: " + health + "/" + healthMax + "броня: " + armor);
    }
}
