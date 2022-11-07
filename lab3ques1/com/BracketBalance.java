package com.greatlearning.lab3ques1.com;

import java.util.Stack;

public class BracketBalance {
	//Stack<Character> stak = new Stack<Character>();

	public boolean balanceCheck(String input) {

		Stack<Character> stack = new Stack<Character>();
		for (char c : input.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);

			} else {
				if (stack.isEmpty()) {
					return false;
				}
				//                System.out.println();
				Character d = (Character) (stack.pop());
				//                System.out.print(d);
				if ((c == '}' && d != '{') || (c == ')' && d != '(') || (c == ']' && d != '[')) {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}
}
