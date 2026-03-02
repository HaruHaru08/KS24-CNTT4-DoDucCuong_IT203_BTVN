package Session15.bai3;

public class Bai3 {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();
        // Trường hợp hợp lệ
        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("=== Test Case 1 ===");
        checker.checkProcess(case1);
        System.out.println();
        // Trường hợp POP khi rỗng
        String[] case2 = {"POP", "PUSH"};
        System.out.println("=== Test Case 2 ===");
        checker.checkProcess(case2);
        System.out.println();
        // Trường hợp còn thuốc chưa hoàn tất
        String[] case3 = {"PUSH", "PUSH", "POP"};
        System.out.println("=== Test Case 3 ===");
        checker.checkProcess(case3);
    }
}
