package org.example.problem531;

import org.example.problem531.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<TreeNode> queue  = new ArrayList<>();
        queue.add(root);
        int ans = root.val;

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i<size; i++) {
                TreeNode front = queue.remove(0);
                if(front.left != null){
                    queue.add(front.left);
                }
                if (front.right != null){
                    queue.add(front.right);
                }

            }


           if(!queue.isEmpty()){
               ans = queue.get(0).val;
           }

        }
        return ans;


    }
}
