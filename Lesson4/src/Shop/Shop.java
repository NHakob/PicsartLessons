package Shop;

import Shop.Staff.Employee;
import Shop.Stock.Stock;

public class Shop {
    Employee[] employees;
    Stock stock;

    public Shop(Employee[] employees, Stock stock) {
        this.employees = employees;
        this.stock = stock;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
