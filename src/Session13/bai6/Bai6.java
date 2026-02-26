package Session13.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {

    private static List<Medicine> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }
    private static void addMedicine() {

        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Medicine existing = findById(id);

        if (existing != null) {
            System.out.print("Nhập số lượng thêm: ");
            int qty = Integer.parseInt(sc.nextLine());
            existing.setQuantity(existing.getQuantity() + qty);
            System.out.println("Đã cộng dồn số lượng.");
            return;
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công.");
    }
    private static void updateQuantity() {

        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if (m == null) {
            System.out.println("Thuốc không tồn tại.");
            return;
        }

        System.out.print("Nhập số lượng mới: ");
        int newQty = Integer.parseInt(sc.nextLine());

        if (newQty == 0) {
            cart.remove(m);
            System.out.println("Đã xóa thuốc khỏi đơn.");
        } else {
            m.setQuantity(newQty);
            System.out.println("Cập nhật thành công.");
        }
    }
    private static void removeMedicine() {

        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if (m == null) {
            System.out.println("Id thuốc không tồn tại.");
            return;
        }

        cart.remove(m);
        System.out.println("Xóa thuốc thành công.");
    }
    private static void printInvoice() {

        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng trống.");
            return;
        }

        double total = 0;

        System.out.printf("%-10s %-25s %-12s %-10s %-12s\n",
                "Mã", "Tên Thuốc", "Đơn Giá", "Số Lượng", "Thành Tiền");

        for (Medicine m : cart) {
            double itemTotal = m.getTotalPrice();
            total += itemTotal;

            System.out.printf("%-10s %-25s %-12.2f %-10d %-12.2f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    itemTotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Tổng tiền: %.2f VNĐ\n", total);
        cart.clear();
    }
    private static void findCheapMedicine() {

        boolean found = false;

        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%s - %s - %.2f VNĐ\n",
                        m.getDrugId(),
                        m.getDrugName(),
                        m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá dưới 50.000 VNĐ.");
        }
    }
    private static Medicine findById(String id) {
        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                return m;
            }
        }
        return null;
    }
}
