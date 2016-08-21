package com.Bixler.Arrays;

/**
 * Created by derekbixler on 4/8/16.
 */
public class PrintArray {

    public static void print(Object[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(byte[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(short[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(long[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(float[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(double[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(char[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void print(boolean[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println(" }");
    }
}
