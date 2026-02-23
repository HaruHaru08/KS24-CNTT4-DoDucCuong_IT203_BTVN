package Session10.Bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1200));
        products.add(new Product("Headphone", 300));

        //1. SẮP XẾP THEO GIÁ (Anonymous Class)

        Collections.sort(products, new Comparator<Product>() {
            // GHI CHÚ QUAN TRỌNG:
            // Trường hợp BẮT BUỘC dùng Anonymous Class thay vì Lambda:
            // - Khi cần thêm thuộc tính nội bộ
            // - Khi cần constructor
            // - Khi cần override nhiều method
            // - Khi code phức tạp, nhiều logic trạng thái

            // Ví dụ thuộc tính nội bộ
            double exchangeRate = 1.0;

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(
                        p1.getPrice() * exchangeRate,
                        p2.getPrice() * exchangeRate
                );
            }
        });

        System.out.println("Danh sách sản phẩm (Theo giá tăng dần):");
        for (Product p : products) {
            System.out.println(p);
        }

        //2. SẮP XẾP THEO TÊN (Lambda Expression)
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\nDanh sách sản phẩm (Theo tên A-Z):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

