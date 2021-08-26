package INF102.h21.Main;

import INF102.h21.list.List;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.function.Consumer;

import INF102.h21.list.ArrayList;
import INF102.h21.list.LinkedList;

public class Main {

	public static Random rand = new Random();

	public static DecimalFormat formatter = new DecimalFormat("#, ###");

	private static int nOperations;

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		int initalSize = 1000;
		for (int i = 0; i < initalSize; i++) {
			arrayList.addLast(i);
			linkedList.addLast(i);
		}

		// For each operation (insertion and access) time the 
		// process for both LinkedList and ArrayList
		long timeElapsedArray;
		long timeElapsedLinked;
		nOperations = 10000;

		// Random Insertion
		// ArrayList
		System.out.printf("----%sRandom Insertions----%n", formatter.format(nOperations));
		timeElapsedArray = timeRandomInsertion(arrayList);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeListMethod(linkedList, Main::randomInsertion);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Head Insertion
		// ArrayList
		System.out.printf("%n----%sHead Insertions----%n", formatter.format(nOperations));
		timeElapsedArray = timeHeadInsertion(arrayList, nOperations);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeHeadInsertion(linkedList, nOperations);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Tail Insertion
		// ArrayList
		System.out.printf("%n----%sTail Insertions----%n", formatter.format(nOperations));
		timeElapsedArray = timeTailInsertion(arrayList, nOperations);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeTailInsertion(linkedList, nOperations);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Random Access
		// ArrayList
		System.out.printf("%n----%sRandom Access----%n", formatter.format(nOperations));
		timeElapsedArray = timeRandomAccess(arrayList, nOperations);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeRandomAccess(linkedList, nOperations);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Head Access
		// ArrayList
		System.out.printf("%n----%sHead Access----%n", formatter.format(nOperations));
		timeElapsedArray = timeHeadAccess(arrayList, nOperations);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeHeadAccess(linkedList, nOperations);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);

		// Tail Access
		// ArrayList
		System.out.printf("%n----%sTail Access----%n", formatter.format(nOperations));
		timeElapsedArray = timeTailAccess(arrayList, nOperations);
		printResult(arrayList, timeElapsedArray);
		// Linked List
		timeElapsedLinked = timeTailAccess(linkedList, nOperations);
		printResult(linkedList, timeElapsedLinked);
		printPercentage(timeElapsedArray, timeElapsedLinked);
	}

	/**
	 * Performs <code>nInsertions</code> of random insertions. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nInsertions number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeRandomInsertion(List<Integer> list) {
		long startTime = System.nanoTime();
		randomInsertion(list);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
	
	/**
	 * Performs <code>nInsertions</code> of head insertions. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nInsertions number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeHeadInsertion(List<Integer> list, int nInsertions) {
		long startTime = System.nanoTime();
		headInsertion(list, nInsertions);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
	
	/**
	 * Performs <code>nInsertions</code> of tail insertions. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nInsertions number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeTailInsertion(List<Integer> list, int nInsertions) {
		long startTime = System.nanoTime();
		tailInsertion(list, nInsertions);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
	
	/**
	 * Performs <code>nAccess</code> of random access. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nAccess number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeRandomAccess(List<Integer> list, int nAccess) {
		long startTime = System.nanoTime();
		randomAccess(list, nAccess);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
	
	/**
	 * Performs <code>nAccess</code> of head access. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nAccess number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeHeadAccess(List<Integer> list, int nAccess) {
		long startTime = System.nanoTime();
		headAccess(list, nAccess);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
	
	/**
	 * Performs <code>nAccess</code> of tail access. 
	 * Times the process
	 * 
	 * @param list of elements to be inserted
	 * @param nAccess number of insertions to be performed
	 * @return time (nanoseconds) taken to perform operations
	 */
	public static long timeTailAccess(List<Integer> list, int nAccess) {
		return timeListMethod(list, Main::tailAccess);
//		long startTime = System.nanoTime();
//		tailAccess(list);
//		long endTime = System.nanoTime();
//		long timeElapsed = (endTime - startTime) / 1000;
//		return timeElapsed;
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
	public static void tailAccess(List<Integer> list) {
		int listLength = list.size();
		for (int i = 0; i < nOperations; i++) {
			list.get(listLength - 1);
		}
	}

	/**
	 * Insert <code>n</code> elements in <code>list</code> at random indices
	 * 
	 * @param list of integers
	 * @param n    inserts
	 */
	public static void randomInsertion(List<Integer> list) {
		int listLength = list.size();
		for (int i = 0; i < nOperations; i++) {
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
			list.addLast(42);
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
	
	public static long timeListMethod(List<Integer> list, Consumer<List<Integer>> method) {
		long startTime = System.nanoTime();
		method.accept(list);
		long endTime = System.nanoTime();
		long timeElapsed = (endTime - startTime) / 1000;
		return timeElapsed;
	}
}
