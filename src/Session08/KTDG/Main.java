package Session08.KTDG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] student=new Student[100];
        int index=0;
        int choice;
        do{
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Hiện thị danh sách sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo Học Lực");
            System.out.println("4.Sắp xếp theo học lực giảm dần");
            System.out.println("5.Thoát");
            System.out.print("Chọn chức năng: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu " + (index + 1));
                        String id;
                        while (true) {
                            System.out.print("Nhap ma SV: ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5) {
                                break;
                            }
                            System.out.println("Ma SV khong hop le!");
                        }

                        System.out.print("Nhap ho ten: ");
                        String name = sc.nextLine();

                        System.out.print("Nhap diem trung binh: ");
                        double avg = sc.nextDouble();
                        sc.nextLine();

                        student[index] = new Student(id, name, avg);
                        index++;
                    }
                    break;
                case 2:
                    System.out.println("===== DANH SACH SINH VIEN =====");
                    for (int i = 0; i < index; i++) {
                        System.out.println(student[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh/Yeu): ");
                    String rank = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < index; i++) {
                        if (student[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(student[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;
                case 4:
                    for (int i = 0; i < index; i++) {
                        for (int j = i+1; j < index; j++) {
                            if (student[i].getAverage() < student[j].getAverage()) {
                                Student temp = student[i];
                                student[i] = student[j];
                                student[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ");
                    break;
            }
        }while (choice!=5);
    }
}
