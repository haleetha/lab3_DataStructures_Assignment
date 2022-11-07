package com.greatlearning.lab3ques1.com;

public class BracketBalanceMain {

	public static void main(String[] args) {
		boolean status;

		BracketBalance ob = new BracketBalance();

		String input = "(({}))";

		status = ob.balanceCheck(input);

		if (status) {
			System.out.println("The entered String has Balanced Brackets");
		} else {

			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
