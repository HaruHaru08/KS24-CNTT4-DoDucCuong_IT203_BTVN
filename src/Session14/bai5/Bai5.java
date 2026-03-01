package Session14.bai5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Bai5 {
    public static void main(String[] args) {

        Comparator<Patient> priorityComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) {
                return p1.getSeverity() - p2.getSeverity();
            }
            return p1.getArrivalTime() - p2.getArrivalTime();
        };

        Set<Patient> emergencyQueue = new TreeSet<>(priorityComparator);

        emergencyQueue.add(new Patient("Bệnh nhân A", 3, 800));
        emergencyQueue.add(new Patient("Bệnh nhân B", 1, 815));
        emergencyQueue.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý cấp cứu:");

        for (Patient p : emergencyQueue) {
            System.out.println(p);
        }
    }
}
