package Session02.Bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int uyTin = 100;
        int soNgayTre;

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            soNgayTre = sc.nextInt();

            if (soNgayTre == 999) {
                break;
            }

            if (soNgayTre <= 0) {
                uyTin += 5;
                System.out.println("-> Tra dung/som han: +5 diem.");
            }
            else {
                int diemTru = soNgayTre * 2;
                uyTin -= diemTru;
                System.out.println("-> Tra tre " + soNgayTre + " ngay: -" + diemTru + " diem.");
            }

            System.out.println();
        }

        System.out.println("Tong diem uy tin: " + uyTin);

        if (uyTin > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (uyTin >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
    }
}
