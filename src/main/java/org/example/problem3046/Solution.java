package org.example.problem3046;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums){
            hashMap.put(num, hashMap.getOrDefault(num,0) +1);
        }
        for(int key : hashMap.keySet()){
            if(hashMap.get(key) > 2){
                return false;
            }
        } return  true;

    }
}
