package OOP.sem1;

public class Crossbower extends Hero{
    public Crossbower(String nameHero) {
        super(75,
                75,
                2,
                new int[]{10, 15},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Арбалетчик:  " + nameHero + "здоровте: " + health + "/" + healthMax + "броня: " + armor);
    }


}
