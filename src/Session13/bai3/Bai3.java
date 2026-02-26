package Session13.bai3;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> result = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> khoaNoiID = new ArrayList<>();
        khoaNoiID.add(101);
        khoaNoiID.add(102);
        khoaNoiID.add(105);

        List<Integer> khoaNgoaiID = new ArrayList<>();
        khoaNgoaiID.add(102);
        khoaNgoaiID.add(105);
        khoaNgoaiID.add(108);

        List<Integer> commonID = findCommonPatients(khoaNoiID, khoaNgoaiID);

        System.out.println("Bệnh nhân khám cả 2 khoa (ID): " + commonID);

        List<String> bhytNoi = new ArrayList<>();
        bhytNoi.add("DN01");
        bhytNoi.add("DN02");
        bhytNoi.add("DN03");

        List<String> bhytNgoai = new ArrayList<>();
        bhytNgoai.add("DN02");
        bhytNgoai.add("DN04");

        List<String> commonBHYT = findCommonPatients(bhytNoi, bhytNgoai);

        System.out.println("Bệnh nhân khám cả 2 khoa (BHYT): " + commonBHYT);
    }
}
