import java.util.ArrayList;
import java.util.List;

public class Srednia {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);

        double average = ((double) sum) / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average) {
                result.add(numbers.get(i));
            }
        }
        System.out.println(average);
        System.out.println(result);
    }
}


