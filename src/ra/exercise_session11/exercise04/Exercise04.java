package ra.exercise_session11.exercise04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise04 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("An");
        listString.add("Bích");
        listString.add("Thủy");
        listString.add("Cúc");
        listString.add("Hoa");

        System.out.println("SẮP XẾP TÊN THEO BẢNG CHỮ CÁI:");
        listString.stream().sorted(Comparator.comparing(String::toString)).forEach(System.out::println);
    }
}
