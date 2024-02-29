package org.example.problem1609;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;


        while(!queue.isEmpty()){
            int size =queue.size();
            int prev = 0;

            for(int i = 0; i<size;i++ ){
                TreeNode front = queue.poll();
                int num = front.val;
                if (front.left != null){
                    queue.add(front.left);
                }
                if (front.right != null){
                    queue.add(front.right);
                }

                if(level%2 == 0){

                    if(num %2 == 1){
                        if(i != 0){
                            if(num <= prev){
                                return false;
                            }
                        }
                        prev = num;
                    }else{
                        return false;
                    }

                }else{
                    if(num %2 == 0){
                        if(i != 0){
                            if(num >= prev){
                                return false;
                            }
                        }
                        prev = num;
                    }else{
                        return false;
                    }

                }
            }
            level++;

        }return true;

    }
}
