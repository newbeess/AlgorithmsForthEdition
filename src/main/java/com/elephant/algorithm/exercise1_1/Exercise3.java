package com.elephant.algorithm.exercise1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/4/24.
 */
public class Exercise3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		print("Please enter three integers like:1,2,3: ");
		String[] s = reader.readLine().split(",");
		int one = Integer.parseInt(s[0]);
		int two = Integer.parseInt(s[1]);
		int three = Integer.parseInt(s[2]);
		if (one == two && two == three)
			print("equal");
		else
			print("not equal");

	}
}
