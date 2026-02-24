package Session11TH;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffffee("CF01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuic("FJ01", "Nước cam", 40000, 10);
        drinks[2] = null;
        for (Drink d : drinks) {

            if (d != null) {
                System.out.println("===== HÓA ĐƠN =====");
                d.displayInfofo();
                System.out.println("Thành tiền: " + d.calculatePrice());
                if (d instanceof IMixable) {
                    IMixable mixable = (IMixable) d;
                    mixable.mix();
                }
                System.out.println();
            }
        }
    }
}
