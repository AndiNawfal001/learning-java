package com.tutorial.oracle_academy;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class section6 {
    public static void main(String[] args) throws IOException {

        // 6-1

        // String[] siswa = new String[3];
        // siswa[0] = "andi";
        // siswa[1] = "nawfal";
        // siswa[2] = "dzikra";

        // String[] murid = { "andi", "nawfal", "dzikra" };

        // murid[0] = "gwe";

        // System.out.println(murid[0]);

        // for (int index = 0; index < murid.length; index++) {
        // System.out.println(murid[index]);
        // }

        // for (String x : murid) {
        // System.out.println(x);
        // }

        // char[][] sentence = new char[10][10];
        // int[][] myArray = { { 0, 0, 0 }, { 0, 0, 0 } };

        // Scanner in = new Scanner(System.in);
        // int[][] nums = new int[3][2];

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // System.out.println("Enter a value for a row " + i + ", column " + j);
        // nums[i][j] = in.nextInt();
        // }
        // }

        // 6-2

        // String s1 = "Hello";
        // String s2 = "Goodbye";

        // if (s1 == s2)
        // System.out.println("They are equal");
        // else
        // System.out.println("They aren't equal");

        // String[] s1 = new String[5];
        // System.out.println(s1[0]);

        // try {
        // FileReader reader = new FileReader("test.txt");
        // } catch (IOException e) {
        // System.out.println("File not found");
        // }
        // int i = 0;
        // try {
        // if (i > 9 || i < 0)
        // throw new Exception("index " + i + " is out if bounds!");
        // } catch (Exception e) {
        // if (i > 9)
        // i -= 9;
        // else
        // i += 9;
        // }

        // int array[][] = { { 6, 4, 3 }, { 4, 3, 2 } };
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.println(2 * array[1][1]);
        // }
        // }

        // int[] arr = { 5, 4, 2, 1, 0 };
        // for (int i = 1; i < arr.length; i++) {
        // arr[i - 1] += arr[i];
        // }
        // int number[] = new int[5];

        // System.out.println(number.length);
        // int array[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        // for (int i = 0; i < 2; i++)
        // for (int j = 0; j < 3; j++)
        // System.out.print(2 * array[1][1]);

        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (j <= i)
                    table[i][j] = 1;

        System.out.println(table);
    }
}