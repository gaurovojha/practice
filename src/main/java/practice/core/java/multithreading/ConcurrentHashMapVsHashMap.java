package practice.core.java.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapVsHashMap {
	private static final int POOL_SIZE = 4;
	
	private static Map<String,Integer> hashMap = new HashMap<String,Integer>();
	Map<String,Integer> concurrentHashMap = new ConcurrentHashMap<String,Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hashMap.put("gaurov", 1));
		System.out.println(hashMap.put("gaurov", 2));
		System.out.println(hashMap.get("gaurov"));

	}
	
	public void executeTasks(final Map<String, Integer> inputMap) throws InterruptedException{
		long startTime = System.nanoTime();
		ExecutorService es = Executors.newFixedThreadPool(POOL_SIZE);
		for(int j=1;j<POOL_SIZE;j++){
			es.execute(new Runnable(){
				public void run() {
					for(int i = 0 ;i <500000 ; i++){
					Integer randomNumber = (int)Math.ceil(Math.random()*55000);
					Integer value = inputMap.get(String.valueOf(randomNumber));
					inputMap.put(String.valueOf(randomNumber), randomNumber);
				}
			}
		});
		}
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		long endTime = System.nanoTime();
		long toltalTime = (endTime - startTime)/1000000L;
		
		
	}

}
