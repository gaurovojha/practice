package practice.core.java.puzzles.thoughtworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * This program print 
 * Input. 	String 1: chair
   			String 2: mat
   			String 3: phone
   Output : cmpahhaotiner
 */

/*class test extends PrintingStringPattern{
	public  String a(StringBuilder o){
		super.a(null);
		System.out.println("object");
		return null;
	}
}*/

public class PrintingStringPattern {
	
	private static String string1 = "chair";
	private static String string2 = "mat";
	private static String string3 = "phone";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1Solution(string1, string2, string3);
		internetSolution(string1, string2, string3);
		//a(null);

	}
	
	private  String a(StringBuilder s){
		System.out.println("string");
		return null;
	}
	
	

	
	private static String problem1Solution(String string1, String string2, String string3){
		//Solution 1
		String result = "";
		char[] charArr1 = string1.toCharArray();
		char[] charArr2 = string2.toCharArray();
		char[] charArr3 = string3.toCharArray();
		int len = findMaXlength(charArr1, charArr2, charArr3);
		for(int i = 0 ;i<len ; i++){
			List<Character> charList = new ArrayList();
			if(i<charArr1.length){
				charList.add(charArr1[i]);
			}
			if(i<charArr2.length){
				charList.add(charArr2[i]);
			}
			if(i<charArr3.length){
				charList.add(charArr3[i]);
			}
			Collections.sort(charList);
			for(Character c: charList){
				result = result + "" + c;			
				}
		}
		System.out.println(result);
		
		return null;
	}
	
	private static int findMaXlength(char[] charArr1,char[] charArr2,char[] charArr3){
		int len = charArr1.length;
		if(len<charArr2.length){
			len = charArr2.length;
			if(len<charArr3.length){
				len = charArr3.length;
			}
		}else if(len<charArr3.length){
			len = charArr3.length;
		}
		return len;
	}
	
	
	private static void internetSolution(String s1, String s2, String s3){
		String result = "";

        int len1 = 0;
        int len2 = 0;
        int len3 = 0;

        List<Character> list = new ArrayList();

        while (len1 != s1.length() || len2 != s2.length() || len3 != s3.length()) {

            if (len1 != s1.length()) {
                list.add(s1.charAt(len1));
                len1++;
            }
            if (len2 != s2.length()) {
                list.add(s2.charAt(len2));
                len2++;
            }
            if (len3 != s3.length()) {
                list.add(s3.charAt(len3));
                len3++;
            }
            Collections.sort(list);

            for (Character c : list)
                result = result + "" + c;

            list.clear();
        }
        System.out.println();
        System.out.println(result);
    }

}
