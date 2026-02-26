package Session13.bai4;

import java.util.LinkedList;

public class Bai4 {

    private LinkedList<String> waitingList;

    public Bai4() {
        waitingList = new LinkedList<>();
    }

    public void patientCheckIn(String name) {
        waitingList.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    public void emergencyCheckIn(String name) {
        waitingList.addFirst(name);
        System.out.println(name + " vào cấp cứu khẩn cấp!");
    }
    public void treatPatient() {
        if (waitingList.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }

        String name = waitingList.removeFirst();
        if (waitingList.contains(name)) {
            System.out.println("Đang khám: " + name);
        } else {
            System.out.println("Đang khám: " + name);
        }
    }

    public static void main(String[] args) {

        Bai4 er = new Bai4();
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}