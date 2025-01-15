import java.util.*;
import java.util.stream.Collectors;

public class EjercicioExtra {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        List<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .collect(Collectors.toList());

        System.out.println(values);

    }
}
