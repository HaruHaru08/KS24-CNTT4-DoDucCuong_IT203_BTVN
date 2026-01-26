package Session02.Bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int soNgayMoCua = 0;

        for (int i = 2; i <= 8; i++) {
            String ngay;

            if (i == 8) {
                ngay = "Chu Nhat";
            } else {
                ngay = "Thu " + i;
            }

            System.out.print("Nhap luot muon ngay " + ngay + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (luotMuon > max) {
                max = luotMuon;
            }

            if (luotMuon < min) {
                min = luotMuon;
            }

            tong += luotMuon;
            soNgayMoCua++;
        }

        System.out.println("\n--- KET QUA THONG KE ---");

        if (soNgayMoCua > 0) {
            double trungBinh = (double) tong / soNgayMoCua;

            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon/ngay: " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua.");
        }
    }
}
