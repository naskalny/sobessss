import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeliveryOrderStream {

    public static DeliveryOrder findFirstOrder(List<DeliveryOrder> orders) {
//        Optional<DeliveryOrder> str = orders.stream()
//                .min((order1, order2) -> order1.getDate().compareTo(order2.getDate()));
//        return str.orElse(null);
        Stream<DeliveryOrder> orderStream = orders.stream();

        return orderStream.min(Comparator.comparing(DeliveryOrder::getDate))
                .orElse(null);
    }

    public static Collection<DeliveryOrder> printAddressesToDeliver(Collection<DeliveryOrder> orders) {
//        Stream<DeliveryOrder> orderStream = orders.stream();
//        return orderStream
//                .sorted(Comparator.comparing(DeliveryOrder::getDate))
//                .distinct()
//                .collect(Collectors.toList());
//        Stream<DeliveryOrder> orderStream = orders.stream();
//        Map<String, DeliveryOrder> uniqueOrders = orderStream
//                .collect(Collectors.toMap(
//                        order -> order.getAddress() + order.getDate(), // ключ - адрес + дата
//                        Function.identity(), // значение - объект DeliveryOrder
//                        (existing, replacement) -> existing // если встречается дубликат, оставляем первый
//                ));
//
//        // Возвращаем значения из карты, чтобы получить список уникальных объектов DeliveryOrder
//        return uniqueOrders.values();

        return orders.stream()
                // Группируем заказы по адресу и дате
                .collect(Collectors.groupingBy(order -> order.getAddress() + order.getDate()))
                // Получаем значения группировки (т.е. уникальные заказы)
                .values()
                // Преобразуем карту в список
                .stream()
                // Выравниваем списки заказов в один поток
                .flatMap(List::stream)
                // Собираем уникальные заказы в список
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<DeliveryOrder> orders = List.of(
                new DeliveryOrder(1L, "112 Mammoth Street, Colorado Springs, CO 80911", LocalDate.of(2021, 9, 3)),
                new DeliveryOrder(2L, "369 Woodside Court, Troy, NY 12180", LocalDate.of(2021, 9, 5)),
                new DeliveryOrder(3L, "837 Bowman Street, Helena, MT 59601", LocalDate.of(2021, 9, 2)),
                new DeliveryOrder(4L, "112 Mammoth Street, Colorado Springs, CO 80911", LocalDate.of(2021, 9, 3)),
                new DeliveryOrder(5L, "112 Mammoth Street, Colorado Springs, CO 80911", LocalDate.of(2021, 10, 3)),
                new DeliveryOrder(6L, "112 Mammoth Street, Colorado Springs, CO 80911", LocalDate.of(2021, 8, 3)),
                new DeliveryOrder(6L, "112 Mammoth Street, Colorado Springs, CO 80911", LocalDate.of(2021, 8, 3)));

        //System.out.println(findFirstOrder(orders)); // Выводим первый заказ
        printAddressesToDeliver(orders).forEach(System.out::println); // Выводим уникальные адреса
    }

}