// Problem 167: Two Sum II - Input Array is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right) {
            int current_sum = numbers[left] + numbers[right];

            if(current_sum == target) {
                return new int[] {left+1, right+1};
            } else if(current_sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}