package Session15.bai2;

public class Bai2 {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "Nguyen Van A", 30));
        pq.addPatient(new Patient("P02", "Tran Thi B", 25));
        pq.addPatient(new Patient("P03", "Le Van C", 40));

        System.out.println("Bệnh nhân tiếp theo: " + pq.peekNextPatient());

        pq.callNextPatient();
        pq.callNextPatient();
        pq.callNextPatient();
        pq.callNextPatient(); // test khi rỗng
    }
}
