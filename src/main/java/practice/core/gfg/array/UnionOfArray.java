package practice.core.gfg.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};

        //System.out.println(doUnion(arr1, arr2, arr1.length, arr2.length));
        System.out.println(doIntersection(arr1, arr2, arr1.length, arr2.length));

    }

    static int doUnion(int[] arr1, int[] arr2, int m, int n){
        Set set = new HashSet<>();
        for(int i=0; i<m ;i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<n ;i++){
            set.add(arr2[i]);
        }

        return set.size();
    }
    static int doIntersection(int[] arr1, int[] arr2, int m, int n){
        Set set = new HashSet<>();
        for(int i=0; i<m ;i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<n ;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }

        return set.size();
    }
}
