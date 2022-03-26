package practice.core.leetcode.amazon;

import org.junit.Test;

public class LongestPallindrome {

    public String longestPallindrome(String s){
        String res = "";
        for(int i =0; i <s.length(); i++){
            String temp = extendPallindrome(s, i, i+1);
            if(temp.length() > res.length()){
                res = temp;
            }
        }
        return res;
    }

    public String extendPallindrome(String s, int i, int j){

        while(i>0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i,j);

    }

    @Test
    public void LongestPallindrome(){
        System.out.println(longestPallindrome("aba"));
//        System.out.println("aba".substring(0,0));
//        System.out.println("aba".substring(0,1));
//        System.out.println("aba".substring(0,2));
    }
}
