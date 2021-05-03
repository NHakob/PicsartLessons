package HeroModels;

import Items.Item;
import Items.Reward;

import java.util.Scanner;

public class PlayerHero extends Hero {
    Hero hero;
    private Integer exp;
    private Integer gold;
    private Item[] items;
    private static Integer itemCount = 0;

    public PlayerHero(String name) {
        super(name);
        this.exp = 0;
        this.gold = 0;
        this.items = new Item[50];
    }

    public void heroLevelUp() {
        hero.setLevel(this.hero.getLevel() + 1);
        this.exp -= 1000;
        this.hero.setHp(100);
        this.hero.setAttack(10 + this.hero.getLevel() * 2);
        this.hero.setDefense(5 + this.hero.getLevel());
    }

    public void getReward(Reward reward) {
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
    public void walk() {
        Scanner in = new Scanner(System.in);
        catched:
        try {
            boolean exit = false;
            do {
                System.out.println("Please choose to which direction you want to walk");
                System.out.println("1. Up");
                System.out.println("2. Right");
                System.out.println("3. Down");
                System.out.println("4. Left");
                Byte choice = in.nextByte();
                switch (choice) {
                    case 1:
                        if (this.getY() == 10) {
                            throw new Exception();
                        }
                        this.walkUp();
                        exit = true;
                        break;
                    case 2:
                        if (this.getX() == 10) {
                            throw new Exception();
                        }
                        this.walkRight();
                        exit = true;
                        break;
                    case 3:
                        if (this.getY() == 0) {
                            throw new Exception();
                        }
                        this.walkDown();
                        exit = true;
                        break;
                    case 4:
                        if (this.getX() == 0) {
                            throw new Exception();
                        }
                        this.walkLeft();
                        exit = true;
                        break;
                    default:
                        System.out.println("Please enter right option");
                }
            } while(!exit);
        } catch (Exception e) {
            break catched;
        }
    }

    public void talk(String msg) {
        System.out.println(this.hero.getName() + " said:\n\t" + msg);
    }

    public Integer getExp() {
        return exp;
    }

    public Integer getGold() {
        return gold;
    }

    public Item[] getItems() {
        return items;
    }

    public static Integer getItemCount() {
        return itemCount;
    }
}
