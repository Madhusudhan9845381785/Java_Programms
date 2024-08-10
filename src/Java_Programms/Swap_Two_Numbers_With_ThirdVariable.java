package Java_Programms;

public class Swap_Two_Numbers_With_ThirdVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before swalp: a=" + a +" b="+ b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swalp: a=" + a +" b="+ b);

    }
}
