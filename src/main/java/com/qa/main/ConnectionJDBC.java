package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.qa.main.utils.Console;

public class ConnectionJDBC {

	private static String URL;
	private static String USER;
	private static String PW;

	private static Connection activeConnection;
	private static Scanner scanner;

	public static void initConnection() {
		// Scanner to retrieve username / password from user.

		getUserPass();

		try {
			activeConnection = DriverManager.getConnection(URL, USER, PW);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void getUserPass() {
		scanner = Console.getScanner();

		System.out.println("Please provide the server url: ");
		URL = scanner.nextLine();

		System.out.println("Please provide username: ");
		USER = scanner.nextLine();

		System.out.println("Please provide password: ");
		PW = scanner.nextLine();
	}

}
