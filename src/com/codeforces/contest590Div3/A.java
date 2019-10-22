package com.codeforces.contest590Div3;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextLong();
            }
            System.out.println((long) Math.ceil((double) sum / n));
        }
    }
}
