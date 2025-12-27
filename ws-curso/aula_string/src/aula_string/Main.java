package aula_string;

public class Main {

	public static void main(String[] args) {
		
		String original = " abcde FGHIJ  ABC abc DEFG  ";
		
		System.out.printf("Original: %s %n", original);
		
		String s01 = original.toLowerCase();
		
		System.out.println("toLowerCase: " + s01);
		
		String s02 = original.toUpperCase();
		
		System.out.println("toUpperCase: " + s02);
		
		String s03 = original.trim();
		
		System.out.println("trim: -" + s03 + "-");
		
		String s04 = original.substring(3);
		
		System.out.println("substring (3): -" + s04 + "-");
		
		// Delimitando recorte das strings
		String s05 = original.substring(3, 9);
		
		System.out.println("substring (3): -" + s05 + "-");
		
		String s06 = original.replace('a', 'x');
		
		System.out.println("replace ('a', 'x'): " + s06);
		
		// Indica as ocorrências do parâmetro
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Index of bc: " + i);
		System.out.println("Last index of bc: " + j);
	}

}
