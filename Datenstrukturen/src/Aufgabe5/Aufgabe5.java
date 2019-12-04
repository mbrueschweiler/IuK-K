package Aufgabe5;

public class Aufgabe5 {
	public static void main(String[] arg) {
		{
			List list = new List();
			list.insert("World");
			list.insert("Hello");
			// Ausgabe: Hello, World 
			System.out.println(list.toString());
		}
		{
			List list = new List();
			list.append("Hello");
			list.append("World");
			// Ausgabe: Hello, World 
			System.out.println(list.toString());
		}
		{
			List list = new List();
			list.insert("World");
			list.insert("Hello");
			list.delete("Mist");
			// Ausgabe: Hello, World 
			System.out.println(list.toString());
			list.delete("World");
			// Ausgabe: Hello
			System.out.println(list.toString());
		}
	}
}
