package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufacture;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public LocalDate getManufacture() {
        return manufacture;
    }

    public void setManufacture(LocalDate manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + "(Manufacture Date: " + manufacture + ")";
    }
}
