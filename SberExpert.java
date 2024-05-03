import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SberExpert {
    public static void main(String[] args) {
        List<String> list = List.of("Привет #Москва",
                "Привет! #Питер У нас хорошая #Погода",
                "Привет! #москва Хорошая #Погода идем гулять!",
                "Привет всем!!!");

        System.out.println(getUniqueSortedHashtag(list));
        System.out.println();
        System.out.println(getSortedByPopularity(list));
    }

    /**
     * Выбираем из строк слова, перед которыми стоит #,
     * удаляем дубликаты и сортируем по алфавиту:
     */

    public static List<String> getUniqueSortedHashtag(List<String> inputList) {
        return inputList.stream()
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(s -> s.startsWith("#"))
                .map(f -> "#" + Character.toUpperCase(f.charAt(1)) + f.substring(2))
                .distinct()
                .sorted()
                .toList();
    }

    /**
     * Сортируем слова с # по популярности
     * (которые чаще встречаются, будут идти первыми):
     */

    public static List<String> getSortedByPopularity(List<String> inputList) {
        return inputList.stream()
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(s -> s.startsWith("#"))
                .map(f -> "#" + Character.toUpperCase(f.charAt(1)) + f.substring(2))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .toList();
    }
}
