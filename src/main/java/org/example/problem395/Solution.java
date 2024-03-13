package org.example.problem395;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int ans = k;
        Map<Character, Integer> frequncyMap = new HashMap<>();
        int p1 = 0;
        int p2 = 0;
        while(p2<n){
            frequncyMap.put(s.charAt(p2), frequncyMap.getOrDefault(s.charAt(p2),0) + 1);
            if (check(frequncyMap, k)){
                ans = p2-p1 +1;
                frequncyMap.put(s.charAt(p1),frequncyMap.get(s.charAt(p1))-1)
               while();
            }
        }

        return ans;


    }
    public boolean check(Map<Character, Integer> map, int k){
        for(char key: map.keySet()){
            if(map.get(key)<k){
                return false;
            }
        }return true;
    }
}

