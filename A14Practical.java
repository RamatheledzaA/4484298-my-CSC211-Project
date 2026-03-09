// Ramatheledza Adzisani 4484298
// practical 4 - hash tables
// copy the code for the previous prac and edit it

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Random;

public class A14Practical {
    public class timeMethods{

    }
    public static int N = 20;
    public static void main(String [] args) {
        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat(" 0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0;
        double runTime2 = 0;
        double time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;

        int[] array = new int[32654];
        Random rand = new Random();

        for (int i = 0; i < 32654; i++) {
            array[i] = i + 1;
        }

        runTime = 0;

        // this is for the open hash section
        // we first have to initialis the linked lists
        for (int i = 1 ; i <= N ; i++){
            table[i] = new LinkedList<>();
        }



    }
    //Implement a method for an open hash table.
    //public static int N = 20 ;

    static LinkedList < String>[] table = new LinkedList[N]; // IN OPEN HASH WE USE LINKED LISTS



}
