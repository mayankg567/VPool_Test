package com.vpool.action;

public class RandomNoGenerator {
	public static int generateNumber() {
		return (int) (Math.random() * 1000000 + 1);
	}
	/*
	 * public static void main(String[] args) {
	 * System.out.println(generateNumber()); }
	 */
}
