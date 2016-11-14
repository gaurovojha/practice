package practice.core.java.usecases.threadpool;

import java.util.List;

public class MyThreadPool {

	List<Thread> threads ;
	int poolSize;
	
	public MyThreadPool(int size){
		poolSize = size ;
		createThreads(poolSize, threads);
	}
	
	private void createThreads(int size, List<Thread> threads){
		for(int i=0; i <size ;i++){
			threads.add(new Thread());
		}
	}
	
	public Thread takeThread(){
		Thread t = threads.get(0);
		threads.remove(0);
		return t;
	}
	
	public void putThread(Thread t){
		threads.add(t);
	}
}
