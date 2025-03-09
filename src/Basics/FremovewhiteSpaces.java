package Basics;

public class FremovewhiteSpaces {
	public static void main(String args[])
	{
	String name= "baltej kaur Saluja";
	String djf= name.replaceAll("\\s","");
	System.out.println(djf);
	String input = "balte566799900 kaur%%%";
	String output = name.replaceAll("[^a-zA-Z]","");
	System.out.println(output);
	
	}

}
