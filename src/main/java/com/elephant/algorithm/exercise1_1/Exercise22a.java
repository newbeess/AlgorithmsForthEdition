package com.elephant.algorithm.exercise1_1;

/**
 * Created by elephant on 16/4/26.
 */
public class Exercise22a {
	public static int rank(int key, int[] a) {
		int lo = 0,
				hi = a.length - 1,
				depth = 0;
		while (lo <= hi) {
			System.out.format("%s%-4d%d\n", repeat(4 * depth++, ' '), lo, hi);
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	private static String repeat(int n, char c) {
		String s = "";
		for (int i = 0; i < n; i++)
			s += c;
		return s;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 8, 13, 14, 22, 31, 55};
		int key = 55;
		int res=rank(key, a);
		if (res==-1)
			System.out.println("数组里面没有找到关键字 "+key+". ");
		else
			System.out.println(key+",找到了，位置为："+res);
	}
}
