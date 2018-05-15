package com.company;

public class Operations {

    public int add(int s1, int s2) {
        return s1 + s2;
    }

    public int profit(int s1, int s2) {
        int result;
        if (s1 > s2) {
            result = s1 - s2;
        } else {
            result = s2 - s1;
        }
        return result;
    }

    public int multiplication(int s1, int s2) {
        return s1 * s2;
    }

    public int division(int s1, int s2) {
        int result;
        if (s1 < s2 || s1 == 0) {
            result = 0;
        } else {
            result = s1 / s2;
        }
        return result;
    }
}
