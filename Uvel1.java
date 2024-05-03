import java.util.ArrayList;
import java.util.List;

public class Uvel1 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(List.of("1", "2", "3", "4"));
//        for (String str: list) {
//            System.out.println(str);
//            list.add(str);
//        }
        int[] array = {9};
        increment(array);
        System.out.println(1);
    }

    public static int[] increment(int[] orig) {
        System.out.println();
        // Проходим по массиву с конца
        for (int i = orig.length - 1; i >= 0; i--) {
            // Увеличиваем текущий элемент на 1
            orig[i]++;
            // Если текущий элемент не равен 10, выходим из цикла
            if (orig[i] != 10) {
                break;
            }
            // Если текущий элемент равен 10 и это не первый элемент массива, устанавливаем его равным 0
            if (i != 0) {
                orig[i] = 0;
            }
        }
        // Если первый элемент массива также равен 10, увеличиваем его на 1 и создаем новый массив с длиной на 1 больше
        if (orig[0] == 10) {
            int[] result = new int[orig.length + 1];
            result[0] = 1;
            return result;
        }
        // Иначе возвращаем исходный массив
        return orig;
    }
}
