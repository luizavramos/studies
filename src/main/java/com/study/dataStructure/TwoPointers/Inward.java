package com.study.dataStructure.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

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
    public Boolean palindromicSentence(String s){
        int l =0, r = s.length() - 1;

        while(r > l){
            if(!Character.isLetter(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetter(s.charAt(r))){
                r--;
                continue;
            }else if(Character.toLowerCase(s.charAt(l)) != Character
                    .toLowerCase(s.charAt(r))){
                return false;
            }
             l++;
             r--;
        }
         return true;
        }

        public Boolean reverseCaseMatch(String s){
            int l =0, r = s.length() - 1;
            while(l < s.length() && r >= 0){
                if(!Character.isLowerCase(s.charAt(l))){
                    l++;
                    continue;
                }
                if(!Character.isUpperCase(s.charAt(r))){
                    r--;
                    continue;
                } else if (s.charAt(l) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }

        public ArrayList<Integer> mergeArray(int[] arr1, int[] arr2){
            ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.length - 1 && j < arr2.length -1){
            if(arr1[i] > arr2[j]){
                res.add(arr2[j]);
                j++;
            }
            else if (arr1[i] < arr2[j]){
                res.add(arr1[i]);
                i++;
            }
            else if(arr1[i] == arr2[j]){
                res.add(arr2[j]);
                res.add(arr1[i]);
                i++;
                j++;
            }

            while(i < arr1.length){
                res.add(arr1[i]);
                i++;
            }

            while(j < arr2.length){
                res.add(arr2[j]);
                j++;
            }

        }
        return res;
        }


    public static void main(String[] args) {
        Inward pc = new Inward();
        System.out.println(pc.reverseCaseMatch("haDrRAHd"));//true
        System.out.println(pc.reverseCaseMatch("helloworldHELLOWORLD"));//false
        System.out.println(pc.palindromicSentence("A man, a plan, a canal: Panama")); // true
        System.out.println(pc.palindromicSentence("Was it a car or a cat I saw?"));   // true
        System.out.println(pc.palindromicSentence("Hello, World!"));                  // false
        System.out.println(pc.palindromicSentence("Bob wondered, 'Now, Bob?"));// true

    }


    }



