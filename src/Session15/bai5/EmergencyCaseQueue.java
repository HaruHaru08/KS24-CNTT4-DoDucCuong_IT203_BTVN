package Session15.bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận: " + c.getPatient().getName());
    }
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu!");
            return null;
        }

        EmergencyCase next = cases.poll();
        System.out.println("Đang xử lý bệnh nhân: " + next.getPatient().getName());
        return next;
    }
}
