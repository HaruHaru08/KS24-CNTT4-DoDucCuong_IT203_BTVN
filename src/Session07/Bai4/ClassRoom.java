package Session07.Bai4;

public class ClassRoom {
    private static double classFund = 0;
    private String studentName;
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void payFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount + " vào quỹ.");
        }
    }
    public static void showClassFund() {
        System.out.println(">> Tổng quỹ lớp hiện tại: " + classFund);
    }
}

