package PascalsTriangleSingleElement;

import java.util.ArrayList;
import java.util.Scanner;


/*
* Given a particular row and column number (1-based), print the element in the pascals triangle
* if we denote the row as 'R' and the column as 'C', then the formula for a particular element is:
* (R - 1)
* */
public class PascalsTriangleSingleElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row number: ");
        int row = sc.nextInt();

        System.out.print("enter the column number: ");
        int col = sc.nextInt();

        System.out.println(calculateSingleElement(row-1, col-1));
    }


    // this function will calculate the nCr
    public static long calculateSingleElement(int n, int r) {
        long res = 1;
        r = Math.min(r, (n -r)); // since 10C7 and 10C3 are the same thing, and it's much easier to compute 10C3 than 10C7

        for (int i = 0; i < r; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }



}
