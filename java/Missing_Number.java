class Solution {
    public int missingNumber(int[] nums) {
        
        int n= nums.length;
        //This is the formula to calculate the sum of the first n natural numbers including 0
        int totalSum = n*(n+1)/2;

        int actualSum = 0;
        for(int num : nums){
            actualSum+=num;
        }

        return (totalSum-actualSum);
    }
}