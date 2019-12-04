package Aufgabe1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
	private List list0;
	private List list1;
	private List list2;
	
	
	@Before
	public void setUp() {
		list0 = new List();
	
		list1 = new List();
		list1.insert("Hello");
		
		list2 = new List();
		list2.insert("World");
		list2.insert("Hello");
	}
	
	@Test
	public void testInsert() {
		list0.insert("Hello");
		assertEquals("Hello", list0.toString());
		
		list2.insert("xxx");
		assertEquals("xxx, Hello, World", list2.toString());
	}

	@Test
	public void testCount() {
		assertEquals(0, list0.count());
		assertEquals(1, list1.count());
		assertEquals(2, list2.count());
	}

	@Test
	public void testGet() {
		assertEquals("Hello", list2.get(0));
		assertEquals("World", list2.get(1));

	}

	@Test
	public void testDelete() {
		list2.delete("Mist");
		assertEquals("Hello, World", list2.toString());
		list2.delete("World");
		assertEquals("Hello", list2.toString());
		list2.delete("Hello");
		assertEquals("", list2.toString());
		list2.delete("Mist");
		assertEquals("", list2.toString());
	}
}
