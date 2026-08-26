/*
ClassName:Solution153
@Author Zhou
@Create 2026/8/26 17:48
*/
public class Solution153 {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right]){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return nums[left];
    }
}
