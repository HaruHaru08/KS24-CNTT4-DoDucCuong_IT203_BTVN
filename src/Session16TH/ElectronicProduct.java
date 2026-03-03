package Session16TH;

public class ElectronicProduct extends Product{
    int warrantyMonths;

    public ElectronicProduct(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if (warrantyMonths > 12){
            return price+1000000;
        }else {
            return price;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty Months: " + warrantyMonths);
    }
}
