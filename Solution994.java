import java.util.LinkedList;
import java.util.Queue;

/*
ClassName:Solution994
@Author Zhou
@Create 2026/8/17 16:21
*/
public class Solution994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int fresh=0;
        int time=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)queue.offer(new int[]{i,j});
                if(grid[i][j]==1)fresh++;
            }
        int dirs[][]={{0,1},{1,0},{0,-1},{-1,0}};
        while (!queue.isEmpty()&&fresh>0){
            int size=queue.size();
            for(int k=0;k<size;k++)
            {
                int[] tmp=queue.poll();
                int i=tmp[0];
                int j=tmp[1];
                for(int dir[]:dirs){

                    int newi=i+dir[0];
                    int newj=j+dir[1];

                    if(newi<0||newi>=grid.length||newj<0||newj>=grid[newi].length||grid[newi][newj]!=1)continue;

                    fresh--;
                    grid[newi][newj]=2;
                    queue.offer(new int[]{newi,newj});
                }
            }
            time++;
        }
        if(fresh!=0)return-1;
        return time;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        Solution994 ss=new Solution994();
        System.out.println(ss.orangesRotting(grid));
    }
}
