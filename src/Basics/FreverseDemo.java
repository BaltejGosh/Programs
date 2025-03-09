package Basics;

public class FreverseDemo {
	// 1.to print reverse string
	public static void main(String args[]) {
		String name = "baltej kaur love india ";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("-------------------");
		// 2nd approach
		String str = "kaur";
		char[] arr = str.toCharArray();
		// StringBuilder sv = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--)

		{
			System.out.print(arr[i]);

			// sv = sv.append(arr[i]);//
		}

		// 3rd approach
		String str1 = "saluja";
		StringBuffer strr = new StringBuffer(str1);
		System.out.println(strr.reverse());

		// 4th approach
		String str2 = "saluja";
		StringBuffer strr1 = new StringBuffer(str1);
		System.out.println(strr1.reverse());

		// 5th approach
		String str3 = "ramji";
		StringBuilder stb = new StringBuilder(str3);
		System.out.println(stb.reverse());

		// String sdd;
		// sdd =stb.reverse(); because can convert string buffer to string

		String sdd = stb.reverse().toString();

		String name1 = "baltej";
		/*
		 * //String rev= ""; for(int i=name.length()-1; i>=0;i--) { rev = rev +
		 * name.charAt(i);
		 * 
		 * } System.out.print(rev); System.out.println();
		 */
		// char

		/*
		 * char[] rev= name.toCharArray(); int index =0; char [] dup = new
		 * char[rev.length]; for(int i=rev.length-1; i>=0;i--) { dup[index] = rev[i];
		 * index++; } System.out.println(dup);
		 */
		/*
		 * String rev= ""; for(int i=name.length()-1; i>=0;i--) { rev = rev +
		 * name.charAt(i);
		 * 
		 * } System.out.print(rev); System.out.println();
		 */
	}
}
