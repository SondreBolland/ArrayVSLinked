package INF102.h21.Main;

import INF102.h21.list.List;

import java.text.DecimalFormat;
import java.util.Random;

import INF102.h21.list.ArrayList;
import INF102.h21.list.LinkedList;

public class Main {

	public static Random rand = new Random();

	public static DecimalFormat formatter = new DecimalFormat("#, ###");

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		int initalSize = 1000;
		for (int i = 0; i < initalSize; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}

		long startTime;
		long endTime;
		long timeElapsedArray;
		long timeElapsedLinked;
		int nOperations = 10000;

		// Random Insertion
		// ArrayList
		System.out.printf("----%s Random Insertions----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		randomInsertion(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// Linked List
		startTime = System.nanoTime();
		randomInsertion(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Head Insertion
		// ArrayList
		System.out.printf("%n----%s Head Insertions----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		headInsertion(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// LinkedList
		startTime = System.nanoTime();
		headInsertion(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Tail Insertion
		// ArrayList
		System.out.printf("%n----%s Tail Insertions----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		tailInsertion(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// LinkedList
		startTime = System.nanoTime();
		tailInsertion(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Random Access
		// ArrayList
		System.out.printf("%n----%s Random Access----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		randomAccess(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// LinkedList
		startTime = System.nanoTime();
		randomAccess(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Head Access
		// ArrayList
		System.out.printf("%n----%s Head Access----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		headAccess(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// LinkedList
		startTime = System.nanoTime();
		headAccess(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Tail Access
		// ArrayList
		System.out.printf("%n----%s Tail Access----%n", formatter.format(nOperations));
		startTime = System.nanoTime();
		tailAccess(arrayList, nOperations);
		endTime = System.nanoTime();
		timeElapsedArray = (endTime - startTime) / 1000;
		printResult(arrayList, timeElapsedArray);
		// LinkedList
		startTime = System.nanoTime();
		tailAccess(linkedList, nOperations);
		endTime = System.nanoTime();
		timeElapsedLinked = (endTime - startTime) / 1000;
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);
	}

	public static void printResult(List<Integer> list, long microSeconds) {
		String listType = list.getClass().getSimpleName();
		double seconds = microSeconds / 1000000.0;
		System.out.printf("%-15s| time elapsed: %-7d microseconds (%f seconds)%n", listType, microSeconds, seconds);
	}

	public static void printPercentage(double timeArray, double timeLinked) {
		if (timeArray > timeLinked) {
			double percentage = (timeLinked / timeArray) * 100.0;
			System.out.println("LINKEDLIST BEST");
			System.out.printf("LinkedList spent %.1f %% of the time ArrayList did.%n", percentage);
		} else {
			double percentage = (timeArray / timeLinked) * 100.0;
			System.out.println("ARRAYLIST BEST");
			System.out.printf("ArrayList spent %.1f %% of the time LinkedList did.%n", percentage);
		}
	}

	/**
	 * Get <code>n</code> elements from <code>list</code> at random indices
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void randomAccess(List<Integer> list, int n) {
		int listLength = list.size();
		for (int i = 0; i < n; i++) {
			int randomIndex = rand.nextInt(listLength - 1);
			list.get(randomIndex);
		}
	}

	/**
	 * Get <code>n</code> elements from <code>list</code> at index 0
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void headAccess(List<Integer> list, int n) {
		for (int i = 0; i < n; i++) {
			list.get(0);
		}
	}

	/**
	 * Get <code>n</code> elements from <code>list</code> at index 0
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void tailAccess(List<Integer> list, int n) {
		int listLength = list.size();
		for (int i = 0; i < n; i++) {
			list.get(listLength - 1);
		}
	}

	/**
	 * Insert <code>n</code> elements in <code>list</code> at random indices
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void randomInsertion(List<Integer> list, int n) {
		int listLength = list.size();
		for (int i = 0; i < n; i++) {
			int randomIndex = rand.nextInt(listLength - 1);
			list.add(randomIndex, 42);
		}
	}

	/**
	 * Insert <code>n</code> elements in <code>list</code>. Each new element at the
	 * end of the list.
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void tailInsertion(List<Integer> list, int n) {
		for (int i = 0; i < n; i++) {
			list.add(42);
		}
	}

	/**
	 * Insert <code>n</code> elements in <code>list</code>. Each new element at the
	 * start of the list.
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void headInsertion(List<Integer> list, int n) {
		for (int i = 0; i < n; i++) {
			list.add(0, 42);
		}
	}
}
