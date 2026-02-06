package Session09.Bai1;

public class Student extends Person {
    private String maSV;
    private double diemTB;
    public Student(String hoTen, int tuoi, String maSV, double diemTB) {
        super(hoTen, tuoi); // gọi constructor lớp cha
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    @Override
    public void display() {
        super.display(); // dùng lại code của Person
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}

