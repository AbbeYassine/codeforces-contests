package com.codeforces.contest590Div3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

            int index = res.indexOf(array[i]);
            if (index == -1) {
                res.add(0, array[i]);
                if (res.size() > k) {
                    res.remove(res.size() - 1);
                }
            }
        }
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }


}
