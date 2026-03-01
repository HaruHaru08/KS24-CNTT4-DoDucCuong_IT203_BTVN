package Session14.bai3;

import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");

        Set<String> allergyList = new HashSet<>();
        allergyList.add("Penicillin");
        allergyList.add("Aspirin");

        Set<String> intersection = new HashSet<>(drugComponents);
        intersection.retainAll(allergyList);

        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergyList);

        System.out.println("Cảnh báo dị ứng: " + intersection);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}
