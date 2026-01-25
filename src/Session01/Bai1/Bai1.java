package Session01.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine().toUpperCase();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã sách: " + bookID);
        System.out.println("Năm xuất bản: " + publishYear);
        System.out.printf("Giá bán: %.2f\n", price);
        System.out.println("Tình trạng: " + status);
    }
}
