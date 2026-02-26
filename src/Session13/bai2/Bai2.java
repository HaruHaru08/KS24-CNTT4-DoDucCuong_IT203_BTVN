package Session13.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {

    public static List<String> removeDuplicateAndSort(List<String> inputList) {

        List<String> uniqueList = new ArrayList<>();

        for (String drug : inputList) {
            if (!uniqueList.contains(drug)) {
                uniqueList.add(drug);
            }
        }

        Collections.sort(uniqueList);

        return uniqueList;
    }

    public static void main(String[] args) {

        List<String> drugs = new ArrayList<>();
        drugs.add("Paracetamol");
        drugs.add("Ibuprofen");
        drugs.add("Panadol");
        drugs.add("Paracetamol");
        drugs.add("Aspirin");
        drugs.add("Ibuprofen");

        List<String> result = removeDuplicateAndSort(drugs);

        System.out.println("Input:  " + drugs);
        System.out.println("Output: " + result);
    }
}
