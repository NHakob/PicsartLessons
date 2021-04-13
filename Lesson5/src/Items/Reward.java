package Items;

public class Reward {
    private Integer exp;
    private Integer gold;
    private Item item;

    public Reward(Integer exp, Integer gold) {
        this.exp = exp;
        this.gold = gold;
    }

    public Reward(Integer exp, Integer gold, Item item) {
        this.exp = exp;
        this.gold = gold;
        this.item = item;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
