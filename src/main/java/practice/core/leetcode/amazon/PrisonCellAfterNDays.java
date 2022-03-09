package practice.core.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class PrisonCellAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int n) {
        Map<String,Integer> seen = new HashMap<>();

        while(n >0){
            int temp[] = new int[cells.length];
            seen.put(Arrays.toString(cells),n--);
            for(int i =1; i <cells.length -1 ; i++){
                temp[i] = cells[i-1] == cells[i+1] ? 1 : 0;
            }
            cells = temp;
            if(seen.containsKey(Arrays.toString(cells))){
                n %= seen.get(Arrays.toString(cells)) - n;
            }
        }
        return cells;
    }

    @Test
    public void prisonAfterNDaysTest(){
        int[] res = prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1}, 7);
        System.out.println(res);
    }
}
