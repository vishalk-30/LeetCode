package org.example.problem442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int num:nums){
            if (set.contains(num)){
                ans.add(num);
            }
            set.add(num);

        } return ans;

    }
}
