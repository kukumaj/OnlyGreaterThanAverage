import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Srednia2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);
        double average = ((double) sum) / numbers.size();
        System.out.println(average);
        System.out.println(numbers.stream().filter(x -> x > average).collect(Collectors.toList()));
    }
}