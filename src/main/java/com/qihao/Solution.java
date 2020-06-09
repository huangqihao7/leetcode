package com.qihao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2019/10/10 12:36
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = new Solution().twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i]) != null){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
