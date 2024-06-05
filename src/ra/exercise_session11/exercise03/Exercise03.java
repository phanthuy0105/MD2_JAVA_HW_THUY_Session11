package ra.exercise_session11.exercise03;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(5);
        arrInt.add(7);
        arrInt.add(17);
        arrInt.add(11);
        arrInt.add(19);

        int total = arrInt.stream().map(number -> number.intValue()).reduce(0, (sum, element) -> sum + element);
        System.out.println("Tổng các phần tử: " + total);
    }
}
