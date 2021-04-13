package Hero;

import Items.Item;
import Items.Reward;
import NPCTypes.NPC;
import NPCFunctionality.Soldiers;

public class Hero implements Soldiers {
    NPC hero;
    private Integer hp;
    private Integer exp;
    private Integer gold;
    private Integer attack;
    private Integer defense;
    private Integer level;
    private Item[] items;
    private static Integer itemCount = 0;

    public Hero(String name) {
        this.hero = new NPC(name, 0, 0);
        this.hp = 100;
        this.exp = 0;
        this.gold = 0;
        this.level = 1;
        this.attack = 10 + this.level * 2;
        this.defense = 5 + this.level;
        this.items = new Item[50];
    }

    private void heroLevelUp() {
        this.level++;
        this.exp -= 1000;
        this.hp = 100;
        this.attack = 10 + this.level * 2;
        this.defense = 5 + this.level;
    }

    private void getReward(Reward reward) {
        this.gold += reward.getGold();
        if (reward.getItem() != null && itemCount <= items.length) {
            this.items[itemCount] = reward.getItem();
            itemCount++;
        }
        this.exp += reward.getExp();
        if (this.exp >= 1000) {
            heroLevelUp();
        }
    }

    @Override
    public void walk(Integer x, Integer y) {
        this.hero.setX(this.hero.getX() + x);
        this.hero.setY(this.hero.getY() + y);
    }

    @Override
    public void talk(String msg) {
        System.out.println(this.hero.getName() + " said:\n\t" + msg);
    }

    @Override
    public void attack(Hero hero) {
        hero.hp -= (this.attack - hero.defense);
        if(hero.hp <= 0) {
            this.getReward(new Reward(hero.level * 5, 100));
        }
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getExp() {
        return exp;
    }

    public Integer getGold() {
        return gold;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getLevel() {
        return level;
    }

    public Item[] getItems() {
        return items;
    }

    public static Integer getItemCount() {
        return itemCount;
    }
}
