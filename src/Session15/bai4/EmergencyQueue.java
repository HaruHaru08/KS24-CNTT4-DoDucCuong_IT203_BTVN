package Session15.bai4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyQueue {
    private long sequence = 0;
    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                @Override
                public int compare(EmergencyPatient p1, EmergencyPatient p2) {

                    // So sánh theo mức ưu tiên trước
                    if (p1.getPriority() != p2.getPriority()) {
                        return Integer.compare(p1.getPriority(), p2.getPriority());
                    }

                    // Nếu cùng mức độ → so sánh theo thứ tự đến
                    return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
                }
            });
    public void addPatient(EmergencyPatient p) {
        p.setArrivalOrder(sequence++);
        queue.offer(p);
        System.out.println("Đã thêm: " + p);
    }
    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân!");
            return null;
        }

        EmergencyPatient next = queue.poll();
        System.out.println("Đang khám: " + next);
        return next;
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        System.out.println("=== Danh sách chờ (theo thứ tự ưu tiên) ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------------");
    }
}
