/*
ClassName:Solution34
@Author Zhou
@Create 2026/8/26 15:54
*/
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;

        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
            {
                first=mid;
                right=mid-1;
            }else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        left=0;
        right=nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
            {
                last=mid;
                left=mid+1;
            }else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return new int[]{first,last};
    }
}
