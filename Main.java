import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
        String[] messages = {"Сегодня в #ПИТЕР идет #ДОЖДЬ", "Вчера в #москве был #дождь",
                "Сегодня в #МОСКВЕ хорошая погода", "Завтра приеду в #Москва"};
        System.out.println(sber(messages));
    }

    public static List<String> sber(String[] messages){
        List<String> answer = new ArrayList<>();
        for (String elem : messages) {
            if (elem.contains("#")){
                String[] kek = elem.split(" ");
                for (String lll: kek){
                    if (lll.startsWith("#")){
                        answer.add(lll.toLowerCase());
                    }
                }
            }
        }
        return answer.stream().distinct().sorted(Comparator.comparing(s -> s.charAt(1)))
                .collect(Collectors.toList());
    }
    public static String longestCommonPrefix(String[] strs) {
        String answer = "";
        List<String> words = Arrays.asList("hello", "world");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        List<String> myList = Stream.of("hello", "world")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(1);
//        String shortest = strs[0];
//        for (String str : strs) {
//            if (str.length() < shortest.length()) {
//                shortest = str;
//            }
//        }
//        for (int i = 0; i < shortest.length(); i++) {
//            char currentChar = shortest.charAt(i);
//            System.out.println("Текущий символ: " + currentChar);
//        }


//        for (String word : strs) {
//            System.out.println(word);
//        }
        return answer;
    }

    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        String reversedX = new StringBuilder(strX).reverse().toString();
        if (strX.equals(reversedX)){
            return true;
        }
        return false;
    }



}
