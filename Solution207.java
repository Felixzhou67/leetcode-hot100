import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution207
@Author Zhou
@Create 2026/8/18 16:28
*/
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int p[]:prerequisites)
        {
            int a=p[0];
            int b=p[1];

            graph.get(b).add(a);
        }

        int[] state=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(state[i]==0)
            {
                if(!dfs(i,graph,state))
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int course,List<List<Integer>> graph,int[] state){
        if(state[course]==1)return false;
        if(state[course]==2)return true;
        state[course]=1;
        for(int next :graph.get(course))
        {
            if(!dfs(next,graph,state))return false;
        }
        state[course]=2;
        return true;
    }

    public static void main(String[] args) {
        int numCourses1 = 2;
        Solution207 ss=new Solution207();
        int[][] prerequisites1 = {
                {1, 0}
        };

        System.out.println(ss.canFinish(numCourses1, prerequisites1)); // true

        int numCourses2 = 2;

        int[][] prerequisites2 = {
                {1, 0},
                {0, 1}
        };

        System.out.println(ss.canFinish(numCourses2, prerequisites2)); // false
    }
}
