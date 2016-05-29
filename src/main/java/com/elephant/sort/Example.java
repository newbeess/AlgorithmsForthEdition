package com.elephant.sort;

/**
 * 排序算法的模板类
 */
public abstract class Example {
	/**
	 * 抽象 排序类， 每种排序算法都有自己不同的实现
	 */
	public abstract void sort(Comparable[] a);

	/**
	 * v 是否 小于 w
	 */
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换元素 a[i] <-> a[j]
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	/**
	 * 打印 数组元素
	 */
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	/**
	 * 检查数组是否已排好序
	 */
	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
}
