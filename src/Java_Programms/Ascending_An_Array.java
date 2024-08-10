package Java_Programms;

import java.sql.SQLOutput;

public class Ascending_An_Array {

    public static void main(String[] args) {

        int[] array = {1,4,5,6, 12,14};
        int num = 1;

        for(int i=0; i<array.length; i++)   {

            if(i >= num){

                System.out.println(i);
            }
        }
    }
}
