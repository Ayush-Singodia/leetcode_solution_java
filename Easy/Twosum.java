import java.util.HashMap;
import java.util.Map;

class TwoSum {  // Class name is "TwoSum"
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();  // Create an instance of the class
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);  // Call the twoSum method

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
