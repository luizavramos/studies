package com.study.dataStructure.TwoPointers;

public class Inward {

    //Common movement pattern inward pointer

    public Boolean checkPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (r > l) {
            if (s.charAt(r) == s.charAt(l)) {
                r--;
                l++;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean smallerPrefixes(int[] arr) {

    }
}

