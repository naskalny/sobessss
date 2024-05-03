import java.util.*;
import java.util.stream.Stream;

public class Sobes {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 9, -1, 0, 6, 7, 4, 5, -1, 0};
//        boolean isDuplicate = false;
//        for (int i = 0; i < arr.length; i++) {
//            isDuplicate = false;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j] && (i != j)){
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate){
//                System.out.println(arr[i]);
//                break;
//            }
    //}
        Map<Integer, Integer> countMap = new HashMap<>();
        // Заполняем хэш-таблицу
            for (int num : arr) {
                if (countMap.containsKey(num)) {
                    countMap.put(num, countMap.get(num) + 1);
                } else {
                    countMap.put(num, 1);
                }
            }
        int uniqueNumber = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumber = entry.getKey();
                break;
            }
        }
        System.out.println(1);
    }
}
