package practice.core.gaurov.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class jp {
    List<Integer> result = null;
    boolean failed = false;
    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{};
        int[][] prerequisites = new int[4][2];
        prerequisites[0][0] = 0;
        prerequisites[0][1] = 1;
        prerequisites[1][0] = 1;
        prerequisites[1][1] = 0;
        prerequisites[2][0] = 0;
        prerequisites[2][1] = 3;
        prerequisites[3][0] = 3;
        prerequisites[3][1] = 2;
        System.out.println(new jp().findOrder(4, prerequisites));
        for(int i : new jp().findOrder(4, prerequisites)){
            System.out.println(i);
        }
    }
    public  int[] findOrder(int numCourses, int[][] prerequisites) {
        List[] list = new ArrayList[numCourses];
        result = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            list[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] visiting = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            dfs(list,i,visited,visiting);
        }
        int[] ans = new int[numCourses];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return failed?new int[]{} :ans;
    }
    public void dfs(List[] list, int course, boolean[] visited, boolean[] visiting){
        if(visited[course])return;
        visiting[course]=true;
        List<Integer> lst = list[course];
        for(int i=0;i<lst.size();i++){
            int children = lst.get(i);
            if(visiting[children]){
                failed=true;
                return;
            }
            dfs(list,children,visited,visiting);
        }
        result.add(course);
        visiting[course]=false;
        visited[course]=true;
        return;
    }
}
