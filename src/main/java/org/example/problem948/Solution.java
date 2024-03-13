package org.example.problem948;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int ans = 0;
        int p1 = 0;
        int p2 = n-1;
        int res = 0;
        while(p1<p2){
            if(power >= tokens[p1]){

                power -= tokens[p1];
                p1++;
                res++;
            }else {
                if(res > 0){
                    power += tokens[p2];
                    p2--;
                    res--;
                } else{
                    break;
                }
            }
            ans = Math.max(res,ans);
        } return ans;

    }
}
