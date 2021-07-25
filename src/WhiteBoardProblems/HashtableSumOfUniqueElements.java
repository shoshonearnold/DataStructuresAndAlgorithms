package WhiteBoardProblems;

import java.util.HashMap;
import java.util.Map;

public class HashtableSumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == 1) {
                count += nums[i];
            }
            else if (map.get(nums[i]) == 2) {
                count -= nums[i];
            }
        }
        return count;
    }
}
