package com.elephant.algorithm.exercise1_1;

import static com.elephant.util.Print.*;

import java.util.Random;

/**
 * Created by elephant on 16/4/25.
 */
public class Exercise11 {
	public static void main(String[] args) {
		Random random = new Random(47);
		boolean[][] array = new boolean[5][5];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++) {
				if (random.nextInt(i * j + 10) % 2 == 0)
					array[i][j] = true;
				else
					array[i][j] = false;
			}

		printnb("\t");
		for (int x = 0; x < array[0].length; x++)
			printnb(x + "\t");

		for (int i = 0; i < array.length; i++) {
			print();
			printnb(i + ": "+"\t");
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == true)
					printnb("*" + "\t");
				else
					printnb(" "+"\t");
			}
		}
	}
}
