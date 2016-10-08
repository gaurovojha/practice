/* IMPORTANT: Multiple classes and nested static classes are supported 
  uncomment this if you want to read input.*/
package practice.core.java.puzzles.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
 * input :
1
1
1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2
 */

class CrazyPainter {
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(br.readLine());
        String curr = br.readLine();
        
        for(int x=1 ; x<= Integer.parseInt(curr); x=x+2){
        BigInteger T = new BigInteger(br.readLine());
        BigInteger sum= BigInteger.ZERO;
        String[] strArr = br.readLine().split(" ");
		List<BigInteger> listCk = new ArrayList<BigInteger>();
		for(String s : strArr){
			listCk.add(new BigInteger(s));
		}
		if(0> T.compareTo(new BigInteger("2"))){
			for(int i =1 ; i<=T.multiply(new BigInteger("12")).intValue() ; i++){
				sum =sum.add(listCk.get(i));	
			}
		}else{
			BigInteger q = (T.multiply(new BigInteger("12")).divide(new BigInteger("26")));
			BigInteger r = (T.multiply(new BigInteger("12"))).mod(new BigInteger("26"));
			
			sum = q.multiply(findSum(listCk));
			for(int i=0;i<r.intValue();i++){
				sum =sum.add(listCk.get(i));
			}
		}
        
        System.out.println(sum);
        }*/
		
		BigInteger T = new BigInteger("335341277") ;
		String[] strArr = "6846 9940 4037 4956 7765 9128 1251 2694 5084 6799 3007 367 2383 6170 8410 3844 4028 1330 6055 5226 6566 4095 7492 5381 2641 9793".split(" ");
		List<BigInteger> listCk = new ArrayList<BigInteger>();
		for(String s : strArr){
			listCk.add(new BigInteger(s));
		}
        System.out.println(findSum(listCk));
        System.out.println(findQ(T));
        System.out.println(findR(T));
		BigInteger sum = findQ(T).multiply(findSum(listCk));
		for(int i=0;i<findR(T).intValue();i++){
			sum =sum.add(listCk.get(i));
		}
		System.out.println(sum);
    }
	
	public static BigInteger findQ(BigInteger T){
		return (T.multiply(new BigInteger("12")).divide(new BigInteger("26")));
	}
	
	public static BigInteger findR(BigInteger T){
		return (T.multiply(new BigInteger("12"))).mod(new BigInteger("26"));
	}
    
    public static BigInteger findSum(List<BigInteger> listCk){
    	BigInteger sum = BigInteger.ZERO;
    	for(BigInteger i : listCk){
    		sum =sum.add(i);
			}
			return sum;
    }}
