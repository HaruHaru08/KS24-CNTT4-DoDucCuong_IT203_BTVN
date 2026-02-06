package Session09.Bai5;

public abstract class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();
    public void display() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương: " + calculateSalary());
    }
}
