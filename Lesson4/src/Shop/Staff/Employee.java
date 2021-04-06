package Shop.Staff;

enum Position {
    Cashier,
    Stocker,
    Manager,
    Security
}

public class Employee {
   private Human human;
   private Double salary;
   private String position;

    public Employee(Human human, Double salary, String position) {
        this.human = human;
        this.salary = salary;
        this.position = position;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
