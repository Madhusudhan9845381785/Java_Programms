package Java_Programms;

public class Swap_Two_Numbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before swalp: a=" + a +" b="+ b);

        a = a+b; //10+20=30=a
        b = a-b; //30-20=10=b
        a = a-b; //30-10=20=a
        System.out.println("After swalp: a=" + a +" b="+ b);
    }
}
