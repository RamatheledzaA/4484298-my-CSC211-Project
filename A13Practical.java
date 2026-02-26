// Ramatheledza Adzisani 4484298
// practical 3 : monday
import java.lang.Math;
import java.io.*;
import java.text.*;
import java.util.Random;

public class A13Practical {


    public class timeMethods{

    }
    public static int N = 30;
    public static void main(String [] args){
        DecimalFormat twoD =  new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat(" 0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start,finish;
        double runTime = 0;
        double runTime2 = 0;
        double  time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;

        int [] array = new int [32654];
        Random rand = new Random();

        for( int i = 0; i <32654 ; i++){
            array[i] = i + 1;
        }

        double [] linearTime = new double[repetitions];
        double [] BinaryTime = new double[repetitions];

        runTime = 0;
        for( repetition = 0 ; repetition< repetitions ; repetition++){
            int key = rand.nextInt(32654) + 1;
            start = System.currentTimeMillis();

            linearSearch (array, key);
            binarySearch(array, key);

            finish = System.currentTimeMillis();

            time = (double)(finish  - start);
            runTime += time;
            runTime2 += (time * time);

        }

        double aveLinear = average(linearTime);
        double stdLinear = stdev( linearTime, aveLinear);

        double aveBinary = average(BinaryTime);
        double stdDeviationBinary = stdev( BinaryTime, aveBinary);


        double aveRuntime = runTime/repetitions;
        double stdDeviation =  Math.sqrt(runTime2 - (repetitions * aveRuntime * aveRuntime))/(repetitions - 1);


        System.out.printf("\n\n\fStatistics\n");
        System.out.println("_______________________________________________");
        System.out.println("Total time = " + runTime/1000 + "s.");
        System.out.println("Total time\u00b2 = " + runTime2);
        System.out.println("Average time = " + fiveD.format(aveRuntime/1000)
                + "s. " + "\u00B1" +  " " + fourD.format(stdDeviation) + "ms.");
        System.out.println("Standard deviation = " + fourD.format(stdDeviation));
        System.out.println("n = " + n);
        System.out.println("Average time / run = " + fiveD.format(aveRuntime/n*1000)
                + "\u00B5" + "s. ");

        System.out.println("Repetitions = " + repetitions);
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println(); }



    // let work on the linearsearch
    public static int linearSearch (int [] array , int value ){
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == value) {
                return i;
            }
        }
        return -1 ;

    }
// now let's do the binaryasearh section
    public static int binarySearch( int [] array , int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {

            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
    // creating a method that will calculate the average and starndard deviation

    private  static double average( double [] values){
        double sum = 0;
        for ( double v : values) sum += v;
        return sum/ values.length;
    }

    private static double stdev (double [] vaules , double mean){
        double sum = 0;
        for (double v: vaules) sum += Math.pow(v - mean , 2);
        return Math.sqrt(sum/ vaules.length);
    }


}




