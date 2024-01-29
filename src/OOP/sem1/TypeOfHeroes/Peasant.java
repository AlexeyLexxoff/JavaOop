package OOP.sem1.TypeOfHeroes;

import OOP.sem1.Hero;
import OOP.sem1.Interfaces.GameI;
import OOP.sem1.Vector2;

import java.util.ArrayList;
import java.util.Collections;


public class Peasant extends Hero {

    public Peasant(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{0, 0}, nameHero, posX, posY, 0);
    }

    protected Vector2 position;

    @Override
    public String toString() {
        return ("Крестьянин: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }


    public void getArrow(Hero target) {
        if (target == null){
            return;
        }
        if (((RangeHero) target).quantityShots < ((RangeHero) target).quantityShotsMax) {
            ((RangeHero) target).quantityShots++;
        }
    }

    public Hero findMoreEmptyRDD(ArrayList<Hero> allies) {
        ArrayList<RangeHero> rdd = new ArrayList<>();
        for (Hero hero : allies) {
            if (hero instanceof RangeHero && hero.health > 0) {
                rdd.add((RangeHero) hero);
            }
        }
        RangeHero rddTMP = null;
        if (!rdd.isEmpty()) {
            rddTMP = rdd.get(0);
            for (RangeHero hero : rdd) {
                if (rddTMP.quantityShots > hero.quantityShots) {
                    rddTMP = hero;
                }
            }
        }
        return rddTMP;
    }

    @Override
    public String getType() {
        return "Крестьянин";
    }

    @Override
    public void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllies) {
        if (this.health > 0) {
            getArrow(findMoreEmptyRDD(teamAllies));
        }
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }
}

