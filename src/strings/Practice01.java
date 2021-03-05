package strings;

import java.util.Scanner;

public class Practice01 {
	
	public static void main(String[] args) {
	
		String str1 = "Chutiya";
		String str2 = "Chutiya";
		String str3 = new String("Chutiya");
		String str4 = new String("Chutiya");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str3==str3);
		System.out.println(str3==str4);
		
	}
	
	
	

}
