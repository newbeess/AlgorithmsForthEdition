package com.elephant.algorithm.exercise1_1;

import java.util.Random;

import static com.elephant.util.Print.*;

/**
 * 编写一段代码，打印出一个M行N列的二维数组的转置(交换行和列).
 */
public class Exercise13 {
	static void swapArray(int rows,int cols,Object[][] array){
		Object[][] array1=new Object[cols][rows];
		print("转换后: "+array1.length+"行,"+array1[0].length+"列: ");
		for (int i=0;i<rows;i++)
			for (int j=0;j<cols;j++)
				array1[j][i]=array[i][j];
		for (int i=0;i<cols;i++){
			for (int j=0;j<rows;j++){
				printnb(array1[i][j] + "\t");
			}
			print();
		}
	}
	public static void main(String[] args) {
		Random random=new Random(47);
		Integer[][] a=new Integer[3][5];
		print("转换前: "+a.length+"行,"+a[0].length+"列: ");
		for (int i=0;i<a.length;i++)
			for (int j=0;j<a[i].length;j++)
				a[i][j]=random.nextInt(i * j + 5)+5;
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				printnb(a[i][j]+"\t");
			}
			print();
		}
		swapArray(3,5,a);
	}
}
