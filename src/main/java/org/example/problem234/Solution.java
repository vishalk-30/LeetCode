package org.example.problem234;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int p1 = 0;
        int p2 = arr.size()-1;
        while(p1<p2){
            if (arr.get(p1) != arr.get(p2)){
                return false;
            }
            p1++;
            p2--;
        }    return true;
    }
}
