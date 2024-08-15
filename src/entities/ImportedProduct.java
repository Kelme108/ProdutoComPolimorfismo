package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice(Double price, Double customsFee){
        return price + customsFee;
    }

    @Override
    public String toString() {
        return getName() + "$" + totalPrice(getPrice(), customsFee) + "(Customs fee: $ " + customsFee;
    }
}
