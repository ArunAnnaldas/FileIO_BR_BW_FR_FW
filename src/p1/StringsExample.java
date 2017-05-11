package p1;

public class StringsExample {

	//System.out.println(s1.compareTo(s2));
	
	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "crow";
		String s3 = "cat";
		String s4 = null;
		System.out.println(s1.hashCode());
		s1 = s1.concat(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(3));
		System.out.println(s2.substring(1));
		System.out.println(s2.substring(2));
		
		
		
		//System.out.println(s4.hashCode());
		s4 = s1 + s2 + "ok";
		
		System.out.println(s4);
		s1 = s1 + "end";
		System.out.println(s1);		
		
		String str1 = new String("cat");
		String str2 = new String("crow");
		String str3 = new String("cat");
		
		System.out.println(str1.hashCode());
		System.out.println(s1==s3);
		
		
		
		
		/*String s1 = new String("cat");
		String s2 = new String("crow");//17+(-5)+(-23)   +6-23
		String s3 = new String("cat");

		System.out.println(s1.compareTo(s2));*/
		
		
		/*
		String s4 = null;
		s4 = s3;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if(s4==s3)
			System.out.println("Strings handles are equal");
		else
			System.out.println("Strings handles are not equal");
		
		if(s3.equals(s4))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		*/
		

	}

}
