package HeroModels;

import java.util.Random;

public class Hero {
    public Integer x;
    public Integer y;
    public String name;
    public Integer hp;
    public Integer attack;
    public Integer defense;
    public Integer level;

    public Hero(String name) {
        setX(new Random().nextInt(10));
        setY(new Random().nextInt(10));
        setName(name);
        setHp(100);
        setLevel(1);
        setAttack(10 + getLevel() * 2);
        setDefense(5 + getLevel());
    }

    public void walk() {

    };

    public void attack(Hero hero) {
        if (Math.abs(this.getX() - hero.getX()) > 1 || Math.abs(this.getY() - hero.getY()) > 1) {
            System.out.println("You should be close for attack");
            this.walk();
        } else {
            hero.setHp(hero.getHp() - attack + hero.getDefense());
        }
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void walkRight() {
        this.setY(this.getX() + 1);
    }

    protected void walkLeft() {
        this.setY(this.getX() - 1);
    }

    protected void walkUp() {
        this.setY(this.getY() + 1);
    }

    protected void walkDown() {
        this.setY(this.getY() - 1);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", level=" + level +
                '}';
    }
}
