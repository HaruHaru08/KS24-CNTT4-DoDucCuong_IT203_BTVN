package Session09.Bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("Nguyễn Văn A", 8000000));
        employees.add(new ProductionEmployee("Trần Thị B", 120, 50000));
        employees.add(new OfficeEmployee("Lê Văn C", 10000000));
        double totalSalary = 0;
        for (Employee e : employees) {
            System.out.println("Tên nhân viên: " + e.name);
            System.out.println("Lương: " + e.calculateSalary());
            System.out.println("----------------------");

            totalSalary += e.calculateSalary();
        }
        System.out.println("Tổng lương công ty phải trả: " + totalSalary);
    }
}


