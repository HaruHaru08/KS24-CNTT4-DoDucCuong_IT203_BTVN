package Session02.Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId;

        do {
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            bookId = sc.nextInt();

            if (bookId <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }

        } while (bookId <= 0);

        System.out.println("Xac nhan: Ma sach " + bookId + " da duoc ghi nhan.");
    }
}
