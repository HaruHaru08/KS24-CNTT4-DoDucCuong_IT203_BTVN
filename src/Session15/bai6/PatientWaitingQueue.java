package Session15.bai6;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (waitingQueue.isEmpty()) return null;
        totalPatients--;
        return waitingQueue.poll();
    }

    public void displayQueue() {
        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
        System.out.println("Tổng bệnh nhân đang chờ: " + totalPatients);
    }
}
// [CHỌN]: Queue (LinkedList)
// [LÝ DO]: Đảm bảo tính công bằng "Ai đến trước được khám trước" (FIFO).