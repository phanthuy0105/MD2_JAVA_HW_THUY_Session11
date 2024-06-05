package ra.exercise_session11.exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise06 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("An");
        listString.add("Bích");
        listString.add("Thủy");
        listString.add("Cúc");
        listString.add("Hoa");

        System.out.println("IN HOA:");
        listString.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
    }
}
