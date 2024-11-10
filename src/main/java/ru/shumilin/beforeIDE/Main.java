package ru.shumilin.beforeIDE;

import ru.Utils;

import java.util.Arrays;

class Main {
	public static void main(String[] args){
		// Возведение в степень
		System.out.println("Возведение в степень");
		System.out.println("2^3 = " + Utils.pow(2,3));
		System.out.println("2^0 = " + Utils.pow(2,0));
		System.out.println("2^(-2) = " + Utils.pow(2,-2));

		// Умножение
		System.out.println("\nУмножение");
		System.out.println("2*3 = " + Utils.mult(2,3));
		System.out.println("2*0 = " + Utils.mult(2,0));
		System.out.println("2*(-2) = " + Utils.mult(2,-2));

		// Сумма
		System.out.println("\nСумма");
		System.out.println("2+3 = " + Utils.sum(2,3));
		System.out.println("2+0 = " + Utils.sum(2,0));
		System.out.println("2+(-2) = " + Utils.sum(2,-2));

		// Разность
		System.out.println("\nРазность");
		System.out.println("2+3 = " + Utils.sub(2,3));
		System.out.println("2+0 = " + Utils.sub(2,0));
		System.out.println("2+(-2) = " + Utils.sub(2,-2));

		// Деление
		try {
			System.out.println("\nДеление");
			System.out.println("6/3 = " + Utils.div(6, 3));
			System.out.println("2/(-2) = " + Utils.div(2, -2));
			System.out.println("2/0 = " + Utils.div(2, 0));
		}catch (Exception e){
			System.out.println(e);
		}

		// Сложение массивов
		System.out.println("\nСложение массивов");
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9};
		System.out.println(Arrays.toString(Utils.concat(arr1,arr2)));
	}
}