package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateDemo {
	public static void main(String args[]) {

		String original = "baalltejj";
		StringBuilder sbr = new StringBuilder();
		char aa[] = original.toCharArray();
				for (int i = 0; i < aa.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < aa.length; j++) {
				if (aa[i] == aa[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated)
				sbr.append(aa[i]);
		}

		System.out.println(sbr);
	
	
	
	StringBuilder Sbr2 =new StringBuilder();
	//Set<Character> set = new LinkedHashSet<>();
	Set<Character> set = new LinkedHashSet();
	for(int i=0;i<aa.length;i++)
	{
	set.add(aa[i]);
	}
	//System.out.println(set); [b, a, l, t, e, j]
	for(char c :set)
	{
		Sbr2.append(c);
	}
	
	
	System.out.println("sbr="+Sbr2);
}	
	
}
