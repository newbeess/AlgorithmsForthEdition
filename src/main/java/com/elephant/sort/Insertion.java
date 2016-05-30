package com.elephant.sort;

/**
 * 插入排序
 * 思想： 将每个元素插入到前方有序的的部分的适当位置
 * 性能：最好情况   N-1 次比较，0次交换
 * 		最坏情况下 N2/2 次比较，N2/2 次交换
 * 特点：1.运行时间取决于输入的有序情况
 * 		2.适合部分有序的数组
 */
public class Insertion extends Example {
	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
				exch(a, j, j - 1);
	}
}
