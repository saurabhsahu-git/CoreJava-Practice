package strings;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Saurabh Sahu";
		System.out.println(str);
		String a="z";
		for(int i=0;i<=str.length()-1;i++)
		System.out.print(str.charAt(i));
		System.out.println();
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareToIgnoreCase("A"));
		
	}

}
