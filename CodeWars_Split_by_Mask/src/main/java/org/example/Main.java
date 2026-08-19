package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mask = new ArrayList<>();
        mask.add(2);
        mask.add(3);
        mask.add(1);
        mask.add(3);
        System.out.println(splitByMask("123456789", mask));
    }

    public static ArrayList<String> splitByMask(String str, ArrayList<Integer> mask) {
        ArrayList<String> strList = new ArrayList<>();
        int pos = 0;
        for (Integer i : mask) {
            strList.add(str.substring(pos, pos + i));
            pos = pos + i;
        }

        return strList;
    }
}