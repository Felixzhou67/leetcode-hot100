/*
ClassName:Solution74
@Author Zhou
@Create 2026/8/25 20:01
*/
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int i=mid/n;
            int j=mid%n;
            int vmid=matrix[i][j];
            if(vmid==target)
            {
                return true;
            }else if(vmid>target)
            {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}
