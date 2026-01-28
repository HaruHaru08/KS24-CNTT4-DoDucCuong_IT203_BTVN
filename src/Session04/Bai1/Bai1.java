package Session04.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();

        tenSach = tenSach.trim().replaceAll("\\s+", " ");
        tacGia = tacGia.trim().replaceAll("\\s+", " ");

        tenSach = tenSach.toUpperCase();
        tacGia = vietHoaChuCaiDau(tacGia);

        System.out.println("[" + tenSach + "] - Tác giả: [" + tacGia + "]");
    }

    public static String vietHoaChuCaiDau(String s) {
        String[] words = s.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }
}
