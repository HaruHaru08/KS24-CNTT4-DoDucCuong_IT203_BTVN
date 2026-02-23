package Session10.Bai5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new OfficeStaff("Nguyễn Văn A", 8_000_000),
                new Manager("Trần Thị B", 12_000_000, 5_000_000),
                new OfficeStaff("Lê Văn C", 7_500_000),
                new Manager("Phạm Văn D", 15_000_000, 7_000_000)
        };
        System.out.printf("%-15s %-12s %-12s %-12s%n","Tên", "Lương CB", "Thưởng", "Tổng lương");
        System.out.println("------------------------------------------------");

        for (Employee e : employees) {
            double bonus = 0;

            if (e instanceof BonusCalculator) {
                bonus = ((BonusCalculator) e).getBonus();
            }
            System.out.printf("%-15s %-12.0f %-12.0f %-12.0f%n",e.name,e.baseSalary,bonus,e.calculateSalary());
        }
    }
}
