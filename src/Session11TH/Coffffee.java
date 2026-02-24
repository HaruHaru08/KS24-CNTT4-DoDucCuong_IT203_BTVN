package Session11TH;

public class Coffffee extends Drink{
    boolean hasMilk;

    public Coffffee() {
    }

    public Coffffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public Coffffee(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        if (hasMilk==true){
            price=price+5000;
            return price;
        }else {
            return price;
        }
    };

    @Override
    void displayInfofo() {
        super.displayInfofo();
        if (hasMilk==true){
            System.out.println("Có sữa");
        }else{
            System.out.println("Đen đá");
        }
    }
}
