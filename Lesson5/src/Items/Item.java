package Items;

public class Item {
    private Integer price;
    private Integer count;
    private ItemType type;

    public Item(ItemType type, Integer count) {
        this.price = 0;
        this.count = count;
        this.type = type;
    }

    public Item(ItemType type, Integer price, Integer count) {
        this.price = price;
        this.count = count;
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
