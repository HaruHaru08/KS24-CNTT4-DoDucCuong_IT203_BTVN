package Session01.Bai3;

public class Bai3 {
    public static void main(String[] args) {
        // Hai biến book1 và book2 được lưu trên STACK
        // Chúng không chứa nội dung chuỗi, mà chỉ chứa THAM CHIẾU
        // trỏ tới các đối tượng String trong HEAP
        String book1 = "Java Basic"; // HEAP: tạo String "Java Basic"
        String book2 = "Python Intro"; // HEAP: tạo String "Python Intro"

        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);

        // temp là biến trên STACK
        // temp trỏ tới cùng đối tượng String mà book1 đang trỏ tới ("Java Basic")
        String temp = book1;

        // book1 đổi tham chiếu, trỏ sang đối tượng String "Python Intro" trong HEAP
        book1 = book2;
        // book2 đổi tham chiếu, trỏ sang đối tượng String "Java Basic" trong HEAP
        // (thông qua biến temp)
        book2 = temp;

        System.out.println("Sau khi hoán đổi:  Book1 = " + book1 + ", Book2 = " + book2);
    }
}
