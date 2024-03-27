class Solution {
    public static int removeDuplicates(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(i<nums.length-1 && nums[i+1]==nums[i]){
               continue;
           }else{
               nums[count]=nums[i];
               count++;
           }
       } 
       return count;
    }

    public static void main(String args[]){
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}