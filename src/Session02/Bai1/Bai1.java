package Session02.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        int age=sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        int numberBook=sc.nextInt();
        if(age>=18&&numberBook<3){
            System.out.println("Ket qua: Ban du dieu kien muon sach quy hiem.");
        }else if(age>=18&&numberBook>3){
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("- Ly do: Ban da muon toi da 3 cuon");
        }else if(age<18&&numberBook<3) {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("- Ly do: Ban phai tu 18 tuoi tro len");
        }
    }
}
