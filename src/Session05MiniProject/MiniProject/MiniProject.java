package Session05MiniProject.MiniProject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[100];
        int currentSize=0;
        int choice;
        String regex="^[B]\\d{7}$";
        Pattern pattern=Pattern.compile(regex);
        do{
            System.out.println("------Menu------");
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Thoát");
            System.out.print("Nhập chức năng muốn dùng: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    if (currentSize==0){
                        System.out.println("Mảng chưa có phần tử nào");
                    }else{
                        System.out.println("Các phần tử trong mảng là: ");
                        for (int i = 0; i < currentSize; i++) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                case 2:
                    if (currentSize == 100) {
                        System.out.println("Mảng đã đầy");
                        break;
                    }
                    String newID;
                    while (true) {
                        System.out.print("Nhập MSSV: ");
                        newID = sc.nextLine();
                        Matcher matcher = pattern.matcher(newID);
                        if (matcher.matches()) {
                            arr[currentSize++] = newID;
                            System.out.println("Thêm thành công");
                            break;
                        } else {
                            System.out.println("Sai định dạng! Ví dụ: B2101234");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập index cần sửa: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index < 0 || index >= currentSize) {
                        System.out.println("Index không hợp lệ");
                        break;
                    }
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        String updateID = sc.nextLine();
                        Matcher matcher = pattern.matcher(updateID);
                        if (matcher.matches()) {
                            arr[index] = updateID;
                            System.out.println("Cập nhật thành công");
                            break;
                        } else {
                            System.out.println("Sai định dạng!");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập MSSV cần xóa: ");
                    String deleteID = sc.nextLine();
                    int pos = -1;
                    for (int i = 0; i < currentSize; i++) {
                        if (arr[i].equals(deleteID)) {
                            pos = i;
                            break;
                        }
                    }
                    if (pos == -1) {
                        System.out.println("Không tìm thấy MSSV");
                    } else {
                        for (int i = pos; i < currentSize - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        currentSize--;
                        System.out.println("Xóa thành công");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hẹn gặp bạn vào lần tiếp theo");
                    System.exit(choice);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (choice!=6);
    }
}
