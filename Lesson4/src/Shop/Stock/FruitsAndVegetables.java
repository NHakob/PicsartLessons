package Shop.Stock;

public class FruitsAndVegetables {
    private String name;
    private String expirationDate;
    private Double price;

    public FruitsAndVegetables(String name, String expirationDate, Double price) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
