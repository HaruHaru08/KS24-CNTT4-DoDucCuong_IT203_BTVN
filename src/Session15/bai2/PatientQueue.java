package Session15.bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
        displayQueue();
    }
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân trong hàng đợi!");
            return null;
        }

        Patient next = queue.poll();
        System.out.println("Đang khám: " + next);
        displayQueue();
        return next;
    }
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return null;
        }
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ đang trống.");
            return;
        }

        System.out.println("=== Danh sách bệnh nhân đang chờ (Front -> Rear) ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------");
    }
}
