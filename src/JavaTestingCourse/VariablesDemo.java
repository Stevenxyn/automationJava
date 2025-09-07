package JavaTestingCourse;

import java.io.PrintStream;

public class VariablesDemo {

	// Igualmente esta variable esta dentro del scope de VariablesDemo
	int precioAlot = 457;

	public static void main(String[] args) {

		// type variablename = value;
		int age = 25;
		char initialName = 'C';
		String name = "Steve";
		String spaceText = " ";

		System.out.println("Welcome" + spaceText + name);

	}

	public void myMethod() {
		// las variables estan en el scope dentro de esto
		int precio = 25;
	}

}
