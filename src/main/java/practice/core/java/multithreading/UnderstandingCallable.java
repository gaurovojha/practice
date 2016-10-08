package practice.core.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class UnderstandingCallable {
	
	public static void main(String args[]){
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		FactorialCalculator firstCal = new FactorialCalculator(2);
		//Submit first task
		System.out.println("Submit first task");
		Future firstResult = ex.submit(firstCal);
		
		FactorialCalculator secondCal = new FactorialCalculator(5);
		//Submit second task
		System.out.println("Submit second task");
		Future secondResult = ex.submit(secondCal);
		
		FactorialCalculator thirdCal = new FactorialCalculator(3);
		//Submit third task
		System.out.println("Submit third task");
		Future thirdResult = ex.submit(thirdCal);
		
		try {
			System.out.println("Result of first calcualtion " + firstResult.get());
			System.out.println("Result of second calcualtion " + secondResult.get());
			System.out.println("Result of third calcualtion " + thirdResult.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

class FactorialCalculator implements Callable<Long>{

	private int n;

	public FactorialCalculator(int n){
		this.n = n;
	}
	
	public Long call() throws Exception {
		return calculateFactorial(n);
	}
	
		/*	Calculate factorial*/	
	private static Long calculateFactorial(int n) throws InterruptedException{
		Long result = 0L;
		while(n>1){
			result = result * n;
			n--;
			Thread.sleep(200);
		}
		return result;
	}
}