package com.elephant.sort;

/**
 * 选择排序类
 * 思想：不断选择剩余元素中最小的那个
 * 性能：N2/2 次比较
 * 		N  次交换
 * 特点：1. 运行时间和输入无关
 * 		2. 数据移动最少（N次交换）
 */
public class Selection extends Example {
	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = 0;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min]))
					min = j;
			}
			exch(a, i, min);
		}
	}
}
