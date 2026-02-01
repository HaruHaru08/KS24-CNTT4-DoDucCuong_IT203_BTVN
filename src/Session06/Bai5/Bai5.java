package Session06.Bai5;

public class Bai5 {
    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lập trình Java", 2024);
        b1.hienThiThongTin();
    }
}

class Book {
    // Biến instance (thuộc tính)
    private String maSach;
    private String tenSach;
    private int namXuatBan;
    public Book(String maSach, String tenSach, int namXuatBan) {
        // this dùng để phân biệt biến instance với biến tham số
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
    }
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Năm xuất bản: " + namXuatBan);
    }
}

