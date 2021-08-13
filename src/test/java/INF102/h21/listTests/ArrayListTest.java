package INF102.h21.listTests;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import INF102.h21.list.ArrayList;
import INF102.h21.list.List;

public class ArrayListTest {

	List<Integer> arrayList;
	
	@Before
	public void setup() {
		arrayList = new ArrayList<>();
	}
	
	@Test
	public void addSingleElementTest() {
		Integer element = 42;
		arrayList.add(element);
		assertEquals(element, arrayList.get(0));
	}
	
	@Test
	public void add100ElementsTest() {
		for (Integer i = 0; i < 100; i++) {
			arrayList.add(i);
			assertEquals(i, arrayList.get(i));
		}
	}
	
	@Test
	public void sizeTest() {
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		assertEquals(nElements, (Integer) arrayList.size());
	}
	
	@Test
	public void insertTest() {
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		int currentSize = arrayList.size();
		
		Integer element = 42;
		Integer index = 50;
		arrayList.add(index, 42);
		assertEquals(element, arrayList.get(index));
		
		Integer newSize = arrayList.size();
		assertEquals(currentSize, newSize-1);
	}
	
	@Test
	public void headInsert() {
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		
		Integer element = 42;
		Integer index = 0;
		arrayList.add(index, 42);
		assertEquals(element, arrayList.get(index));
	}
	
	@Test
	public void tailInsert() {
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		
		Integer element = 42;
		Integer index = arrayList.size()-1;
		arrayList.add(index, 42);
		assertEquals(element, arrayList.get(index));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void accessEmptyList() {
		arrayList.get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void accessAboveBound() {
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		Integer index = 100;
		arrayList.get(index);
	}
	
	@Test
	public void insert100Random() {
		Random rand = new Random();
		
		Integer nElements = 100;
		for (Integer i = 0; i < nElements; i++) {
			arrayList.add(i);
		}
		
		for (Integer i = 0; i < nElements; i++) {
			Integer randomIndex = rand.nextInt(arrayList.size());
			Integer randomNumber = rand.nextInt(1000);
			arrayList.add(randomIndex, randomNumber);
			assertEquals(randomNumber, arrayList.get(randomIndex));
		}
		
		assertEquals(nElements*2, arrayList.size());
	}
}
