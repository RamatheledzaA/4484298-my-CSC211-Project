<<<<<<< HEAD
// Ramatheledza Adzisani 4484298
// practical 2

import java.util.Random;

public class A12Practical {

    public static int mcsOn3(int[] X) {

        int n = X.length;
        int maxsofar = 0;
        for (int low = 0; low < n; low++) {

            for (int high = low; high < n; high++) {
                int sum = 0;
                for (int r = low; r < high; r++) {
                    sum += X[r];

                    if (sum > maxsofar) {
                        maxsofar = sum;
                    }
                }
            }

        }
        return maxsofar;

    }


    public static int mcsOn2A(int[] X) {

        int n = X.length;
        int maxsofar = 0;
        for (int low = 0; low < n; low++) {

            int sum = 0;
            for (int r = low; r < n; r++) {
                sum += X[r];
                if (sum > maxsofar) {
                    maxsofar = sum;
                }
            }
        }
        return maxsofar;
    }

    public static int mcsOn2B( int []X){


        int n = X.length;
        int [] sumTo = new int[n + 1];
        for( int i = 0 ; i < n ; i++) {

            sumTo[i] = sumTo[i - 1] + X[i];
        }
        int maxsofar = 0;

        for( int low = 0 ; low < n  ; low++  ){
            for ( int high =low ; high < n ; high++){
                int sum = sumTo[high] - sumTo[low -1];
                //  sum of all elements in X[low  high)
                if (sum > maxsofar){
                    maxsofar = sum;
                }

            }
        }
        return maxsofar;

    }

    public static int mcsOn( int [] X){

        int N = X.length;
        int maxSoFar = 0;
        int maxToHere = 0;
        for( int i =1 ; i < N ; i++){
            maxToHere = Math.max  (maxToHere + X[i] ,0);
            maxSoFar = Math.max (maxSoFar , maxToHere);

        }
        return maxSoFar;
    }

    public static void main(String[] args){
         int n = 20;
         int [] X = new int[n];

         Random rand = new Random();
         for(int k = 0 ; k < n ;k++) {
             int randomNumber = rand.nextInt(n) + 1;// from 1 to n
             int sign = (rand.nextInt(2) == 0) ? -1 : 1;
             X[k] = randomNumber * sign;

         }

         int countP = 0;
         int countM = 0;

         for ( int x : X ){
             if ( x < 0){
                 countM += 1;
             }else{
                 countP += 1;
             }
         }
         System.out.println(countM + " " + countP + " " + countM + " " + countP );
         System.out.println( mcsOn3(X) + "  " + mcsOn3(X) + " " + mcsOn3(X) + "  " + mcsOn3(X));
        System.out.println( mcsOn2A(X) + "  " + mcsOn2A(X) +" "  + mcsOn2A(X) + "  " + mcsOn2A(X));
        System.out.println( mcsOn2B(X) + "  " + mcsOn2B(X) + " " +mcsOn2B(X) + "  " + mcsOn2B(X));
        System.out.println( mcsOn(X) + "  " + mcsOn(X) + " " + mcsOn(X) + "  " + mcsOn(X));





    }

}
=======
// Ramatheledza Adzisani 4484298
// practical 2

import java.util.Random;

public class A12Practical {

    public static int mcsOn3(int[] X) {

        int n = X.length;
        int maxsofar = 0;
        for (int low = 0; low < n; low++) {

            for (int high = low; high < n; high++) {
                int sum = 0;
                for (int r = low; r < high; r++) {
                    sum += X[r];

                    if (sum > maxsofar) {
                        maxsofar = sum;
                    }
                }
            }

        }
        return maxsofar;

    }


    public static int mcsOn2A(int[] X) {

        int n = X.length;
        int maxsofar = 0;
        for (int low = 0; low < n; low++) {

            int sum = 0;
            for (int r = low; r < n; r++) {
                sum += X[r];
                if (sum > maxsofar) {
                    maxsofar = sum;
                }
            }
        }
        return maxsofar;
    }

    public static int mcsOn2B( int []X){


        int n = X.length;
        int [] sumTo = new int[n + 1];
        for( int i = 0 ; i < n ; i++) {

            sumTo[i] = sumTo[i - 1] + X[i];
        }
        int maxsofar = 0;

        for( int low = 0 ; low < n  ; low++  ){
            for ( int high =low ; high < n ; high++){
                int sum = sumTo[high] - sumTo[low -1];
                //  sum of all elements in X[low  high)
                if (sum > maxsofar){
                    maxsofar = sum;
                }

            }
        }
        return maxsofar;

    }

    public static int mcsOn( int [] X){

        int N = X.length;
        int maxSoFar = 0;
        int maxToHere = 0;
        for( int i =1 ; i < N ; i++){
            maxToHere = Math.max  (maxToHere + X[i] ,0);
            maxSoFar = Math.max (maxSoFar , maxToHere);

        }
        return maxSoFar;
    }

    public static void main(String[] args){
         int n = 20;
         int [] X = new int[n];

         Random rand = new Random();
         for(int k = 0 ; k < n ;k++) {
             int randomNumber = rand.nextInt(n) + 1;// from 1 to n
             int sign = (rand.nextInt(2) == 0) ? -1 : 1;
             X[k] = randomNumber * sign;

         }

         int countP = 0;
         int countM = 0;

         for ( int x : X ){
             if ( x < 0){
                 countM += 1;
             }else{
                 countP += 1;
             }
         }
         System.out.println(countM + " " + countP + " " + countM + " " + countP );
         System.out.println( mcsOn3(X) + "  " + mcsOn3(X) + " " + mcsOn3(X) + "  " + mcsOn3(X));
        System.out.println( mcsOn2A(X) + "  " + mcsOn2A(X) +" "  + mcsOn2A(X) + "  " + mcsOn2A(X));
        System.out.println( mcsOn2B(X) + "  " + mcsOn2B(X) + " " +mcsOn2B(X) + "  " + mcsOn2B(X));
        System.out.println( mcsOn(X) + "  " + mcsOn(X) + " " + mcsOn(X) + "  " + mcsOn(X));





    }

}
>>>>>>> 9db83e6 (let's start the prac)
