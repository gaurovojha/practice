package practice.core.java.puzzles.jpmorgan.impl;

import java.io.Serializable;

public class StudentResult implements Serializable{
	private String rank;
	private String name;
	private String marks;

	/*
	 * Getters and Setters 
	 */
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
}
