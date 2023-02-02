package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DemoForArrays {

	static Random rand = new Random();

	public static void main(String[] args) {

		workWithArrayList();
	}

	public static void workWithArrayList() {
		ArrayList ll = new ArrayList<>();
		long startWriteTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			ll.add(rand.nextInt());
		}
		long endWriteTime = System.currentTimeMillis();
		long startReadingTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("The value at index : " + i + " " + ll.get(i));
		}
		long endReadingTime = System.currentTimeMillis();

		System.out.println("Total Write Time : " + (endWriteTime - startWriteTime) + " MS");
		System.out.println("Total read Time : " + (endReadingTime - startReadingTime) + " MS");
	}
	
	public static void workWithLinkedList() {
		LinkedList ll = new LinkedList();
		long startWriteTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			ll.add(rand.nextInt());
		}
		long endWriteTime = System.currentTimeMillis();
		long startReadingTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("The value at index : " + i + " " + ll.get(i));
		}
		long endReadingTime = System.currentTimeMillis();

		System.out.println("Total Write Time : " + (endWriteTime - startWriteTime) + " MS");
		System.out.println("Total read Time : " + (endReadingTime - startReadingTime) + " MS");
	}

	public static void workWithArray() {
		// define array
		int x[] = new int[1000];
		long startWriteTime = System.currentTimeMillis();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt();
		}
		long endWriteTime = System.currentTimeMillis();
		long startReadingTime = System.currentTimeMillis();
		for (int i = 0; i < x.length; i++) {
			System.out.println("The value at index : " + i + " " + x[i]);
		}
		long endReadingTime = System.currentTimeMillis();

		System.out.println("Total Write Time : " + (endWriteTime - startWriteTime) + " MS");
		System.out.println("Total read Time : " + (endReadingTime - startReadingTime) + " MS");
		//apply sorting algorithm for array data structure
		
	}

}
