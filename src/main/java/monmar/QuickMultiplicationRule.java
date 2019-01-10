package monmar;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class QuickMultiplicationRule {

	public static void main(String[] args) {

		final String pattern = "(-2a-8)^3";
		final String pattern1 = "(a-1)^3";
		String[] partsOfExpression = pattern1.split("\\W");
		for (int i = 0; i < partsOfExpression.length; i++) {
			if (!partsOfExpression[i].isEmpty())
				System.out.println(partsOfExpression[i]);
		}

		System.out.println("=======================================");

		String[] partsOfExpressionOnlySigns = pattern.split("[\\( | \\) | \\^]");
		for (int i = 0; i < partsOfExpressionOnlySigns.length; i++) {
			if (!partsOfExpressionOnlySigns[i].isEmpty()) {

				System.out.println(partsOfExpressionOnlySigns[i]);
			}
		}
		
		System.out.println("=======================================");

		char[] chars = pattern.toCharArray();
		StringBuilder  sb = new StringBuilder();
		for(int i = 0; i< chars.length; i++) {
			if(chars[i]!='(' || chars[i]!=')' || chars[i]!='^') {
				
			}
			
			Character.toString(chars[i]);
			System.out.println();
		}
		
		
		
	}

}
