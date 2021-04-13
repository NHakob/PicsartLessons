package NPCTypes;

import Hero.Hero;

public class Soldiers extends NPC implements NPCFunctionality.Soldiers {

    public Soldiers(Integer x, Integer y) {
        super("Soldier", x, y);
    }

    @Override
    public void attack(Hero hero) {

    }
}
