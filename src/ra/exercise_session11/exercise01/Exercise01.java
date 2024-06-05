package ra.exercise_session11.exercise01;

import ra.learn_session11.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise01 {
    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(5);
        arrInt.add(7);
        arrInt.add(17);
        arrInt.add(11);
        arrInt.add(19);

        System.out.println("Số lớn nhất là: " + arrInt.stream().max(Comparator.comparingInt(Integer::intValue)).get());

//        Integer maxNumber = Stream.of(arrInt).max(Comparator.comparing(Integer::valueOf)).get();
    }
}
