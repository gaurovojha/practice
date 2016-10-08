package practice.core.java.puzzles.jpmorgan;

import practice.core.java.puzzles.jpmorgan.impl.StudentResult;

public interface MyCache {
	
	public StudentResult readFromCache(String rank);
	
	public void addToCache(StudentResult result);
	
	public void removeFromCache(String rank);

}
