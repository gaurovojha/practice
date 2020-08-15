package practice.core.java.puzzles.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1 {

    public static void main(String[] args) {



        List<List<Integer>> grid = new ArrayList<>();
        //insert data in 2D array list

        List<Integer> row =  Arrays.asList(0,1,1,0);
        List<Integer> row1 = Arrays.asList(1,1,1,0);
        List<Integer> row2 = Arrays.asList(0,1,1,1);
        List<Integer> row3 = Arrays.asList(0,1,0,0);

        grid.add(row);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);




        int result = 0;
        while (true){
            int count =0;
            for (int i = 0; i < grid.size(); i++)
            {
                for (int j = 0; j < grid.get(i).size(); j++)
                {
                    // do stuff
                    if(grid.get(i).get(j)==0){
                        count++;
                    }
                    if(grid.get(i).get(j)==1){

                        if((i-1)>=0 && grid.get(i-1).get(j)==0){
                            grid.get(i-1).set(j,(Integer) 1);
                        }
                        if(i+1<grid.size() && grid.get(i+1).get(j)==0){
                            grid.get(i+1).set(j,(Integer)1);
                        }
                        if((j-1)>=0 && grid.get(i).get(j-1)==0){
                            grid.get(i).set(j-1,(Integer)1);
                        }
                        if(j+1<grid.get(0).size() && grid.get(i).get(j+1)==0){
                            grid.get(i).set(j+1,(Integer)1);
                        }
                    }

                }
            }
            result++;
            if(count==0){
                break;
            }
        }

        System.out.println(result);

    }
}
