package com.Bixler.Algorithms;

/**
 * Created by derekbixler on 8/21/16.
 */
public class Algorithms {

    public double min(double a, double b) {
        return (a) < (b) ? (a) : (b);
    }

    public double min(double a, double b, double c) {
        return ((a) < (b) ? ((a) < (c) ? (a) : (c)) : ((b) < (c) ? (b) : (c)));
    }

    public double min(double a, double b, double c, double d) {
        return min(min(a, b), min(c, d));
    }

    public static int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();

        // m+1, n+1, because finally return c[m][n]
        int[][] c = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            c[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            c[0][j] = j;
        }

        //iterate though, and check last char
        for (int i = 0; i < m; i++) {
            char c1 = a.charAt(i);
            for (int j = 0; j < n; j++) {
                char c2 = b.charAt(j);

                if (c1 == c2) {
                    c[i + 1][j + 1] = c[i][j];
                } else {
                    int replace = c[i][j] + 1;
                    int insert = c[i][j + 1] + 1;
                    int delete = c[i + 1][j] + 1;

                    int min = replace > insert ? insert : replace;
                    min = delete > min ? min : delete;
                    c[i + 1][j + 1] = min;
                }
            }
        }

        return c[m][n];
    }
}