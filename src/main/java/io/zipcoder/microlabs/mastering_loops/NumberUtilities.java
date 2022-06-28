package io.zipcoder.microlabs.mastering_loops;


import java.time.temporal.ValueRange;
import java.util.stream.IntStream;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

//      StringBuilder str = new StringBUilder();
//       For (int i = start; i < stop; i++) {
//       if (i % 2 == 0) {
//       str.append(i)
//       }
//       return str.stringTo();
//       }

        StringBuilder str = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                str.append(i);
            }
        }
        return str.toString();
    }







    public static String getOddNumbers(int start, int stop) {

        String outputOdd = "";
        int i;

        for( i = start; i<stop; i++){
            if(i%2!=0) {
                outputOdd += String.valueOf(i);
            }

        }

        return outputOdd;
    }



    public static String getSquareNumbers(int start, int stop, int step) {
            int i;
            String output = "";

            for(i=start; i<stop; i+=step) {
                int square = i*i;
                output += String.valueOf(square);

            }

        return output;


    }


    public static String getRange(int stop) {
        // String builder is better then +=
        // String builder
        // In the case of millions strings, stringBuilder is faster

        StringBuilder str = new StringBuilder();

        for (int i = 0; i<stop; i++) {
            str.append(i);
        }

        return str.toString();

    }



    public static String getRange(int start, int stop) {

        int i;
        String output = "";

        for (i=start; i<stop; i++){
            output +=String.valueOf(i);
        }

        return output;
    }






    public static String getRange(int start, int stop, int step) {

        int i;
        String output = "";


        for (i=start; i<stop; i+=step){
            output +=String.valueOf(i);
        }

        return output;
    }






    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder str = new StringBuilder();
        int i;

        int expoFormula;

        String output = "";

        for(i=start;i<stop;i+=step){
            expoFormula = (int) (Math.pow(i, exponent));
            output += String.valueOf(expoFormula);
        }

        return output;
    }
}
