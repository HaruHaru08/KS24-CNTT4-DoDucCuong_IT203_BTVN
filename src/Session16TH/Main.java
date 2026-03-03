package Session16TH;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.add(new ElectronicProduct("E01","Laptop",20000,36));
        productRepository.add(new ElectronicProduct("E02","Iphone",30000,12));
        productRepository.add(new FoodProduct("F01","Milk",30,2));
        productRepository.add(new FoodProduct("F02","voka",25,1));

        System.out.println("--- DANH SÁCH SẢN PHẨM ---");
        for (Product p : productRepository.findAll()) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Thành tiền: " + p.calculateFinalPrice());
                System.out.println("-----------------------");
            }
        }

        System.out.println("--- TÌM SẢN PHẨM E01 ---");
        Product found = productRepository.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy");
        }

        System.out.println("--- SẮP XẾP GIÁ TĂNG DẦN ---");
        productRepository.sortByPriceAsc();
        for (Product p : productRepository.findAll()) {
            System.out.println(p.getId() + " - " + p.getPrice());
        }

    }
}
