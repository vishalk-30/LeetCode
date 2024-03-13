package org.example.problem1171;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        int prefixSum = 0;
        ListNode dummy = new ListNode(0,head);
        ListNode curr = dummy;

        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0,dummy);
        while(curr != null){
            prefixSum += curr.val;
            map.put(prefixSum,curr);
            curr = curr.next;

        }
        prefixSum = 0;
        curr = dummy;

        while (curr != null){
            prefixSum += curr.val;
            curr.next = map.get(prefixSum).next;
            curr = curr.next;
        }return dummy.next;



    }
}
