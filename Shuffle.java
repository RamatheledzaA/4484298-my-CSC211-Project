<<<<<<< HEAD
//Ramatheledza Adzisani 4484298
// CSC211 PRACTICAL 1 - 9 FEB 2026

import java.util.Random;
import java.util.Random;
public class Shuffle {

    static Random rand = new Random();
    public static void main (String[] args){
        System.out.println("slowshuffle: ");
        printArray(slowshuffle(10));

        System.out.println("baisedshuffle: ");
        printArray(baisedshuffle(11));

        System.out.println("shuffle: ");
        printArray(shuffle(10));

    }
    static void printArray(int[] A){
        for(int x : A){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // -----MY METHODS------
    static int[] slowshuffle(int N){
        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N+1];

        // all numbers are not present
        for(int i =1; i<= N ; i++){
            isNotPresent[i] = true;
        }

        int i = 0;
        while(i <N -1){
            int r= rand.nextInt(N) + 1;

            if (isNotPresent[r]){
                shuffled[i] = r;
                isNotPresent[r] = false;
                i++;
            }
        }

        // filling the last missing number
        for (int r = 1 ; r <= N ;r++){
            if (isNotPresent[r]){
                shuffled[N -1] = 1;
                break;
            }
        }
        return shuffled;
    }

    // working on the baised shuffle now

    static int[] baisedshuffle(int N){
        int[] shuffled = new int[N];

        // all numbers are not present
        for(int i =1; i < N ; i++){
            shuffled[i]= i + 1;

        }

        for(int i = 0 ; i < N; i++){
            int r = rand.nextInt(N);
            int temp = shuffled[i];
            shuffled[i]= shuffled[r];
            shuffled[r] = temp;

        }

        return shuffled;
    }
    static int[] shuffle(int N){
        int[] B = new int[N];

        for( int i = 0 ; i < N ;i ++){
            B[i]= i + 1;

        }

        int b = 0;
        while( b < N){
            int r = b + rand.nextInt(N - b);
            int temp =B[b];
            B[b] = B[b];
            B[r] = temp;
            b++;

        }

        return B;
    }

}
=======
//Ramatheledza Adzisani 4484298
// CSC211 PRACTICAL 1 - 9 FEB 2026

import java.util.Random;
import java.util.Random;
public class Shuffle {

    static Random rand = new Random();
    public static void main (String[] args){
        System.out.println("slowshuffle: ");
        printArray(slowshuffle(10));

        System.out.println("baisedshuffle: ");
        printArray(baisedshuffle(11));

        System.out.println("shuffle: ");
        printArray(shuffle(10));

    }
    static void printArray(int[] A){
        for(int x : A){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // -----MY METHODS------
    static int[] slowshuffle(int N){
        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N+1];

        // all numbers are not present
        for(int i =1; i<= N ; i++){
            isNotPresent[i] = true;
        }

        int i = 0;
        while(i <N -1){
            int r= rand.nextInt(N) + 1;

            if (isNotPresent[r]){
                shuffled[i] = r;
                isNotPresent[r] = false;
                i++;
            }
        }

        // filling the last missing number
        for (int r = 1 ; r <= N ;r++){
            if (isNotPresent[r]){
                shuffled[N -1] = 1;
                break;
            }
        }
        return shuffled;
    }

    // working on the baised shuffle now

    static int[] baisedshuffle(int N){
        int[] shuffled = new int[N];

        // all numbers are not present
        for(int i =1; i < N ; i++){
            shuffled[i]= i + 1;

        }

        for(int i = 0 ; i < N; i++){
            int r = rand.nextInt(N);
            int temp = shuffled[i];
            shuffled[i]= shuffled[r];
            shuffled[r] = temp;

        }

        return shuffled;
    }
    static int[] shuffle(int N){
        int[] B = new int[N];

        for( int i = 0 ; i < N ;i ++){
            B[i]= i + 1;

        }

        int b = 0;
        while( b < N){
            int r = b + rand.nextInt(N - b);
            int temp =B[b];
            B[b] = B[b];
            B[r] = temp;
            b++;

        }

        return B;
    }

}
>>>>>>> 9db83e6 (let's start the prac)
