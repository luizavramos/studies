package com.study.dataStructure.TwoPointers;

public class SlowAndFast {
    public boolean smallerPrefixes(int[] arr) {
        int sp = 0, fp = 0;
        int slowSum = 0, fastSum = 0;

        while(fp < arr.length){
            slowSum += arr[sp];
            fastSum += arr[fp] + arr[fp + 1];

            if(slowSum >= fastSum){
                return false;
            }
            sp++;
            fp += 2;
        }
        return true;

    }

}
