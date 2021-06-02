package com.qa.main.utils;

import java.util.Scanner;

public class Console {

	// ONLY THIS CONSOLE CLASS SHOULD INTERACT WITH THIS SCANNER
	private static Scanner scanner = new Scanner(System.in);

	public static Scanner getScanner() {
		return scanner;
	}

	public static void close() {
		scanner.close();

	}
}
