import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Discord {
    public static void main(String[] args) {
        Stream.of("C", "A", "B")
                .sorted(Comparator.naturalOrder())
                .filter(l->{
                    System.out.println(l);
                    return true;
                })
                .forEach(System.out::println);
    }
    public static void test() {
        List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);

        Map<String, Long> counts = integers.stream()
                .filter(n -> n != 4 && n != 6)
                .collect(
                        Collectors.groupingBy(
                                n -> n + "-Hello",
                                Collectors.counting()
                        )
                );

        System.out.println(counts);

    }
}
