public class Plane {
    private String model;
    private String country;
    private short year;
    private short hours;
    private boolean military;
    private int weight;
    private short topSpeed;
    private short seats;
    private float cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getHours() {
        return hours;
    }

    public void setHours(short hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public short getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(short topSpeed) {
        this.topSpeed = topSpeed;
    }

    public short getSeats() {
        return seats;
    }

    public void setSeats(short seats) {
        this.seats = seats;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", hours=" + hours + " hours" +
                ", military=" + military +
                ", weight=" + weight + "kg" +
                ", topSpeed=" + topSpeed + "km/h" +
                ", seats=" + seats +
                ", cost=" + cost + "$" +
                '}';
    }
}
