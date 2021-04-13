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
   private Position position;

    public Employee(Human human, Double salary, Position position) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
