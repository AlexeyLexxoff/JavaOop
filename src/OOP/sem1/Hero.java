package OOP.sem1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class  Hero {

    protected int  health, healthMax,armor;

    protected int[] damage;

    protected String  nameHero;

    protected Vector2 position;

    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero,int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX,posY);

    }
    public void printEnemysDistance(ArrayList<Hero> enemys){

        enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position)+", "));
        System.out.println();


    }

    public float findMinDistance(ArrayList<Hero> enemys){
        ArrayList<Float> distances = new ArrayList<>();
        enemys.forEach(n-> distances.add(position.rangeEnemy(n.position)));
        float minDistance = Collections.min(distances);
        return minDistance;
    }





}


