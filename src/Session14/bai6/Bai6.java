package Session14.bai6;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {

        List<Patient> patientList = Arrays.asList(
                new Patient("Lan", 45, "Tim mạch"),
                new Patient("Hùng", 50, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {

            String dept = p.getDepartment();

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }

            departmentMap.get(dept).add(p);
        }
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }
        String searchDept = "Tim mạch";
        System.out.println("\nDanh sách khoa " + searchDept + ":");
        if (departmentMap.containsKey(searchDept)) {
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.println(p.getName());
            }
        }
        String busiestDept = null;
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                busiestDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + busiestDept + " đang đông nhất (" + max + " bệnh nhân).");
    }
}
