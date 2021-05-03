package HeroModels;

public class EnvironmentHero extends Hero {
    Hero hero;

    public EnvironmentHero(String name) {
        super(name);
    }

    @Override
    public void walk() {
        if (x < 5) {
            this.hero.setX(this.hero.getX() + 1);
        } else if (x > 5) {
            this.hero.setX(this.hero.getX() - 1);
        } else {
            this.hero.setX(this.hero.getX() + 1);
        }
    }

    public void talk(String msg) {
        System.out.println(this.hero.getName() + " said:\n\t" + msg);
    }
}
