package Java_Programms;

public class PrimeNumber {

    public static void main(String[] args) {

        int no = 29;
        int count = 0;

        for(int i=1; i<=no; i++){

            if(no % i == 0){
                count++;
            }
        }
        if(count == 2) System.out.println("The given number " + no + " is Prime number");
        else System.out.println("The given number " + no + " is not a Prime number");
    }
}
