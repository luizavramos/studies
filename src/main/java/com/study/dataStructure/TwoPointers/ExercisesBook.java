package com.study.dataStructure.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ExercisesBook {
    //27.7
    public boolean twoSum(List<Integer> arr){
        int r = 0, l =  arr.size() - 1;

        while(l < r){
            if(arr.get(r) + arr.get(l) > 0){
                r++;
            }
            if(arr.get(r) + arr.get(l) < 0){
                l--;
            }else if (arr.get(r) + arr.get(l) == 0) {
                return true;
            }
        }

        return false;
    }
    //27.8
    public List<Integer> mergeWithOutDuplicates(List<Integer> arr1,List<Integer> arr2,List<Integer> arr3){
        int p1 = 0, p2 = 0, p3 = 0;

        List<Integer> response = new ArrayList<>();

        while(p1 < arr1.size() || p2 < arr2.size() || p3 < arr3.size()){

            int val1 = p1 < arr1.size() ? arr1.get(p1) : Integer.MAX_VALUE;
            int val2 = p1 < arr1.size() ? arr1.get(p1) : Integer.MAX_VALUE;
            int val3 = p1 < arr1.size() ? arr1.get(p1) : Integer.MAX_VALUE;

            int minValue = Math.min(val1, Math.min(val2, val3));

            if(response.isEmpty() || response.get(response.size() - 1) != minValue){
                response.add(minValue);
            }

            if(val1 == minValue) p1++;
            if(val2 == minValue) p2++;
            if(val3 == minValue) p3++;
        }
        return response;
    }

}
