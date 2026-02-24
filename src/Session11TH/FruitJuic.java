package Session11TH;

public class FruitJuic extends Drink implements IMixable{
    int discountPerce;

    public FruitJuic() {
    }

    public FruitJuic(int discountPerce) {
        this.discountPerce = discountPerce;
    }

    public FruitJuic(String id, String name, double price, int discountPerce) {
        super(id, name, price);
        this.discountPerce = discountPerce;
    }

    @Override
    double calculatePrice() {
        price=price - (price*discountPerce/100);
        return price;
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi");
    }
}
