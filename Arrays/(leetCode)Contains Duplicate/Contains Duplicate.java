
//Brute

// we need to keep track of the number of occurrences of each integer. We can use a HashMap to do this!

// If an integer does not exist in the HashMap, we input it into the HashMap with a value of 1 (1 indicating its first occurrence). But if an integer is found inside the HashMap, then we can return true as it means this integer was present in the nums array & this is the 2nd occurrence of it we're seeing

// Our solution has a time complexity of O(n) as we will need to traverse through each element in the nums array. The space complexity is O(n) in the worst case as it's possible that the HashMap will grow to be as big as the nums array, where every integer in the nums array is unique

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
      
      for(int a:nums){
        if (hash.get(a)== null)
          hash.put(a,1);
        else 
          return true;
      }
         return false;
      }
}




// Time O(nlogn) and Space O(1)

    public static boolean containsDuplicateConstantSpace(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }