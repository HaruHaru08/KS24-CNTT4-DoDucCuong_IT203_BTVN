package Session03.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {
                "Java Basic",
                "Python Intro",
                "C Programming",
                "Data Structures",
                "Web Development"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách cần tìm: ");
        String searchName = sc.nextLine();

        int result = searchBooks(books, searchName);

        if (result != -1) {
            System.out.println("Tìm thấy sách "+"'"+searchName+"'"+" tại vị trí số: " + result);
        } else {
            System.out.println("Sách không tồn tại trong thư viện");
        }
    }
}

