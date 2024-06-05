package ra.exercise_session11.exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise02 {
    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(5);
        arrInt.add(7);
        arrInt.add(18);
        arrInt.add(11);
        arrInt.add(20);

        System.out.println("Các số chẵn là: ");
        arrInt.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
