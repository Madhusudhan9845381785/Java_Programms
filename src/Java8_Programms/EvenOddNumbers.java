package Java8_Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11,2,3,45,67,9,90,87,8,2,0);

        List<Integer> evenNumbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers in the given array " + evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers in the given array " + oddNumbers);
    }
}
