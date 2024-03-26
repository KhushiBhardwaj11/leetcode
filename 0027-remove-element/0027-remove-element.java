class Solution {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
    return count;
    }

    public static void main(String args[]){
        int nums[]={2,3,4,3,4};
           System.out.println(removeElement(nums,3));
    }
}