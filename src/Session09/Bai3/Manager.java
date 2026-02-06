package Session09.Bai3;

public class Manager extends Employee {
    private String phongBan;
    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan); // khởi tạo thuộc tính lớp cha
        this.phongBan = phongBan;
    }
    @Override
    public void display() {
        super.display(); // dùng lại code của Employee
        System.out.println("Phòng ban: " + phongBan);
    }
}

