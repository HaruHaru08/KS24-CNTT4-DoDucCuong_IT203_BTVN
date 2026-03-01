package Session14.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, String> drugMap = new HashMap<>();

        // 2. Thêm dữ liệu
        drugMap.put("T01", "Paracetamol");
        drugMap.put("T02", "Ibuprofen");
        drugMap.put("T03", "Amoxicillin");
        drugMap.put("T04", "Aspirin");
        drugMap.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String inputCode = sc.nextLine();

        if (drugMap.containsKey(inputCode)) {
            System.out.println("Tên thuốc: " + drugMap.get(inputCode));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }
    }
}