package TestPackage;


public class StringReverse {

	public static void main(String[] args) {
		
		//Reverse using string buffer
		//StringBuffer sb1 = new StringBuffer("Hello World");
		//System.out.println(sb1.reverse());
		
		
		//using toCharArray
		String str1 = new String("ABCDEF");
		String str2 = "";
		
		char[] ch = str1.toCharArray();
		
		int a = ch.length;
		System.out.println(a);
		
		for (int i=a-1 ; i>=0 ; --i)
		{
			str2 = str2 + ch[i];
		}
		System.out.println("*** Reverse String is : "+ str2);
		
		
		if(str1.contains(str2))
			System.out.println("Contains method output : True");
		else
			System.out.println("Contains method output : False");
		
		if(str1.equals(str2))
			System.out.println("Equals method output : True");
		else
			System.out.println("Equals method output : False");
		
		if(str1.compareTo(str2) == 0)
			System.out.println("compare method output : True");
		else
			System.out.println("compare method output : False");
		
	}

}
