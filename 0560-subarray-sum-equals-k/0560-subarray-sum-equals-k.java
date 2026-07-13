class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;//jodna start hua
        
              

            // Check first
            if (map.containsKey(sum - k)) {//check if phir prefix sum to nahi aaya
                count += map.get(sum - k);//19(current prefix sum,)-7(k)=12(earlier.elemets)
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);//hash map me key-value daale prefix sum->frequency
        }

            // Then store the current prefix sum
          
        

        return count;
    }
}