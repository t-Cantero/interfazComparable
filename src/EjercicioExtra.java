import java.util.*;
import java.util.stream.Collectors;

public class EjercicioExtra {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));

    }
}
