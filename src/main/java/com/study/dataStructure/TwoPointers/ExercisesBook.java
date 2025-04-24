package com.study.dataStructure.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
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

        while(p1 < arr1.size() || p2 < arr2.size()|| p3 < arr3.size()){

            int val1 = p1 < arr1.size() ? arr1.get(p1) : Integer.MAX_VALUE;
            int val2 = p2 < arr2.size() ? arr2.get(p2) : Integer.MAX_VALUE;
            int val3 = p3 < arr3.size() ? arr3.get(p3) : Integer.MAX_VALUE;

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
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> arr2 = Arrays.asList(2, 3, 6, 9, 10);
        List<Integer> arr3 = Arrays.asList(1, 4, 5, 8, 10, 11,12);

        ExercisesBook exercises = new ExercisesBook();
        List<Integer> resultado = exercises.mergeWithOutDuplicates(arr1, arr2, arr3);

        System.out.println("Merge sem duplicatas: " + resultado);
    }

}
