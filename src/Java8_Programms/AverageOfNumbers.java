package Java8_Programms;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of given numbers is " + average);
    }
}
