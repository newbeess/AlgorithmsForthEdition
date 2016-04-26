package com.elephant.algorithm.exercise1_1;

import static com.elephant.util.Print.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by elephant on 16/4/26.
 */
public class Exercise21 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String lines = "";
		while ((lines = reader.readLine()) != null) {
			String[] words = lines.split(" ");
			System.out.format("%s,%s,%s,%.3f",
					words[0], words[1], words[2], Double.parseDouble(words[2]) / Double.parseDouble(words[1]));
		}
	}
}
