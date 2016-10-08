package practice.core.java.strings;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FindAllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "asdfsd7dfhg3";
		System.out.println(substringCalculator(st));
	}

	/*
	 * Complete the function below.
	 */
	static long substringCalculator(String st) {
		st = checkConstraint(st);
		System.out.print(st + ":::::::::::::::::");
		return permutation(st);

	}

	static String checkConstraint(String s) {
		String str = "";
		char[] chars = s.toCharArray();

		for (char c : chars) {
			if (Character.isLetter(c)) {
				str = str + c;
			}

		}
		return str;
	}

	static long permutation(String string) {
		int length = string.length();
		String sub = "";
		Set<String> set = new HashSet();
		for (int c = 0; c < length; c++) {
			for (int i = 1; i <= length - c; i++) {
				sub = string.substring(c, c + i);
				set.add(sub);

			}
		}
		return set.size();
	}

}
