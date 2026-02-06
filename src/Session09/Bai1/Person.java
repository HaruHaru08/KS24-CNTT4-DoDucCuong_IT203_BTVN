package Session09.Bai1;

public class Person {
    protected String hoTen;
    protected int tuoi;
    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    public void display() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}

