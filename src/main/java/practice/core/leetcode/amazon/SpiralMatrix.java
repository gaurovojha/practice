package practice.core.leetcode.amazon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
//travel right
            for(int j =0;j <=colEnd; j++){
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;

//        travel down
            for(int i=rowBegin; i<=rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // travel left
            for(int j=colEnd; j>=colBegin; j--){
                result.add(matrix[rowEnd][j]);
            }
            rowEnd--;

            //travel up
            
            for(int i=rowEnd; i>=rowBegin; i--){
                result.add(matrix[i][colBegin]);
            }
            colBegin++;
        }


        return result;
    }

    @Test
    public void spiralOrderTest(){
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[1][0] = 4;
        input[1][1] = 5;
        input[1][2] = 6;
        input[2][0] = 7;
        input[2][1] = 8;
        input[2][2] = 9;
        spiralOrder(input);
    }
}
