package Session13.bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(36.5);
        temperatures.add(40.2);
        temperatures.add(37.0);
        temperatures.add(12.5);
        temperatures.add(39.8);
        temperatures.add(99.9);
        temperatures.add(36.8);

        System.out.println("Danh sách ban đầu: " + temperatures);

        Iterator<Double> iterator = temperatures.iterator();

        while (iterator.hasNext()) {
            double temp = iterator.next();

            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Sau khi lọc: " + temperatures);

        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }

        double average = 0;
        if (!temperatures.isEmpty()) {
            average = sum / temperatures.size();
        }

        System.out.println("Nhiệt độ trung bình: " + average);
    }
}
