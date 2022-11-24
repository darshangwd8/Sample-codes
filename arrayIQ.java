//Leetcode:747. Largest Number At Least Twice of Others
/*
you are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, 
or return -1 otherwise.
*/
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0; 
    int maxIndex =0;
    
    for(int num: nums){
        if(num>max){
            max = num;
        }
    }
    for(int i=0; i<nums.length; i++){
        if(max == nums[i]){
            maxIndex = i;
        }
    }
    
    for(int i=0; i<nums.length; i++){
        if(nums[i]==max){
        continue;
        }else{
            if(nums[i]*2 > max){
                return -1;
            }
        }
        
    }
    return maxIndex;

}
}
