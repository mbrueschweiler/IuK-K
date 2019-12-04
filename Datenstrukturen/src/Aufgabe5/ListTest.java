package Aufgabe5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	@Test
	public void testInsert() {
		List list = new List();
		list.insert("World");
		list.insert("Hello");
		
		assertEquals("Hello, World", list.toString());
	}

	@Test
	public void testAppend() {
		List list = new List();
		list.append("Hello");
		list.append("World");

		assertTrue(list.checkLinks());
		assertEquals("Hello, World", list.toString());
	}

	@Test
	public void testDelete() {
		List list = new List();
		list.insert("World");
		list.insert("Hello");
		list.delete("Mist");

		assertEquals("Hello, World", list.toString());
		
		list.delete("World");
		
		assertEquals("Hello", list.toString());
	}
}
