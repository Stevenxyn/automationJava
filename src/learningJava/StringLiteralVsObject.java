package learningJava;

public class StringLiteralVsObject {

	public static void main(String[] args) {

		// Normal string
		String str1 = "Prueba";
		String str2 = "Prueba";
		
		// Object string
		String str3 = new String("Prueba");
		
		//They are equal for the datatype
		System.out.println(str1 == str2);
		
		//They are not equal because one is a normal string and the other is a string object
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		//Now we comparing the values
		System.out.println(str1.equals(str3));
		
	}
}
