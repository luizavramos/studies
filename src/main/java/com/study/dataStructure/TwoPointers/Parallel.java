package com.study.dataStructure.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class Parallel {

    public int[] arrayIntersection(int[] arr1, int[] arr2 ){
        List<Integer> response = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < arr1.length && p2 < arr2.length){
            if(arr1[p1] == arr2[p2]){
                response.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] > arr2[p2]){
                p2++;
            }else if (arr1[p1] < arr2[p2]){
                p1++;
            }
        }
        return response.stream().mapToInt(i -> i).toArray();
    }
}
