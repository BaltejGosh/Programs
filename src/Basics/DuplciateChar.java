package Basics;

import java.util.Arrays;

public class DuplciateChar {
	public static void main(String[] args) // write in copy
	{

		String ori = "Hellojjkkk";

		char[] newStr = ori.toCharArray();// write in copy
		Arrays.sort(newStr);
		
	
	char[] dup = new char[newStr.length];
	int index =0;

		for (int i = 0; i < newStr.length - 1; i++)// because i ++ accessa krna so keep it<length-1
		{

			if( (newStr[i] == newStr[i + 1]) &&(index ==0 ||dup[index-1]!=newStr[i]))
{

				// str= str+newStr[i];
				//System.out.println(newStr[i]);
				
				dup[index]=newStr[i];
				System.out.println(dup[index]);
				index++;
				
			}

			
		}

	}

}
