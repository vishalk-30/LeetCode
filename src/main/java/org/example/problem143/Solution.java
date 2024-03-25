package org.example.problem143;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null){
            ListNode currNode = curr;
            curr = curr.next;
            currNode.next = null;
            arr.add(currNode);

        }
        ListNode ans = new ListNode(-1);
        curr = ans;
        int p1 = 0;
        int p2 = arr.size()-1;
        while(p1<p2){
            curr.next = arr.get(p1);
            curr = curr.next;
            curr.next = arr.get(p2);
            curr = curr.next;
            p1++;
            p2--;
        }
        if(arr.size()%2 == 1){
            curr.next = arr.get(p1);
        }

    }
}
