package com.qa.main;

import java.util.Scanner;

import com.qa.main.utils.Console;

public class Runner {

	public static Scanner scanner;

	public static void main(String[] args) {

		scanner = Console.getScanner();
		Console.close();
	}

}
