package com.tutorial.oracle_academy;

import java.util.Scanner;

public class section5 {
    public static void main(String[] args) {
        // String s1 = "I eat apples";
        // String s = "\"\"\\\n\"";
        // String s2 = "Bananas are my favorite fruit";
        // // String s3 = "haha";
        // // String s4 = "haha";
        // int n = s1.length();
        // System.out.println(s1.substring(6) + " " + s2.substring(8, 23));
        // System.out.println(s);

        // 5-1

        Scanner in = new Scanner(System.in);
        // System.out.println("Enter your name :");
        // String name = in.next();
        // System.out.println("Enter your Age : ");
        // int age = in.nextInt();
        // System.out.println("Halo " + name + " your age must " + age);

        // System.out.println("Enter your grade :");
        // int grade = in.nextInt();
        // if (grade >= 88)
        // System.out.println("hebat");
        // else
        // System.out.println("coba lagi");

        // System.out.println("enter your number day absent : ");
        // int numberDayAbsent = in.nextInt();
        // System.out.println("enter your grade : ");
        // int grade = in.nextInt();
        // boolean madeHonorRoll = grade >= 90;

        // if (madeHonorRoll && numberDayAbsent <= 3)
        // System.out.println("lulus");
        // else
        // System.out.println("ngulang awokwok");

        // System.out.println("Enter your class level between 7 -12 : ");
        // int level = in.nextInt();
        // switch (level) {
        // case 7 -> System.out.println("1 smp");
        // case 8 -> System.out.println("2 smp");
        // case 9 -> System.out.println("3 smp");

        // case 10 -> System.out.println("1 sma");
        // case 11 -> System.out.println("2 sma");
        // case 12 -> System.out.println("3 sma");

        // default -> System.out.println("infalid");
        // }

        // System.out.println("Enter your whatever number : ");
        // int number = in.nextInt();
        // String hasil = number < 3 ? "angka lebih kecil dari 3" : "angka lebih besar
        // dari 3 ";
        // System.out.println(hasil);

        // 5-2

        // int numInputs = 0;
        // int sum = 0;
        // while (numInputs < 10) {
        // int input = in.nextInt();
        // sum += input;
        // numInputs++;
        // }

        // System.out.println("The sum of those ten number is: " + sum);

        // System.out.println("Enter a Word : ");
        // String word = in.next();
        // int firstPosition = 0;
        // int lastPosition = word.length() - 1;
        // boolean isAPalindrome = true;

        // while (firstPosition < lastPosition) {
        // if (word.charAt(firstPosition) != word.charAt(lastPosition))
        // isAPalindrome = false;

        // firstPosition++;
        // lastPosition--;
        // }

        // if (isAPalindrome)
        // System.out.println("The word is a Palindrome");
        // else
        // System.out.println("The word isn't a Palindrome");

        int num = 7;
        while (num >= 0) {
            num -= 3;
        }
        System.out.println(num);
    }
}
