package OOP.sem1;

public class Wizard extends Hero{

    public Wizard(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-30, -35}, nameHero, posX, posY);


    }

    protected Vector2 position;

    @Override
    public String toString() {
        return ("Колдун:  " + nameHero + " здоровте: " + health + "/" + healthMax + " броня: " + armor);
    }
}
