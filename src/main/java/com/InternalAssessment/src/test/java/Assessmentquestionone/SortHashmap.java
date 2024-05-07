package Assessmentquestionone;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 20);
        hashMap.put("Diana", 35);
        Map<String, Integer> sortedMap = sortByKey(hashMap);
        // Print the sorted HashMap
        System.out.println("Sorted HashMap by keys:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<String, Integer> sortByKey(HashMap<String, Integer> hashMap) {
        // Convert HashMap to TreeMap to automatically sort by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);
        return sortedMap;
    }

}
