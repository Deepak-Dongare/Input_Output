package Input_Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class CW1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// File f=new File("D:\\test\\a.txt");

		// Scanner sc=new Scanner(System.in);

		File obj = new File("D:\\test\\testing.txt");
		FileWriter file = new FileWriter(obj, true);
		BufferedWriter bw = new BufferedWriter(file);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String string = sc.nextLine();

		// FileWriter file1=new FileWriter("D:\\test\\testing.txt");
		bw.write(string);
	
			//System.out.println(bw);
		/*
		 * FileReader fr = new FileReader("D:\\test\\testing.txt"); BufferedReader
		 * reader = new BufferedReader(fr); String string1 =reader.readLine();
		 * System.out.println(string1); //System.out.println(string.readLine()); //char
		 * a[]=new char[];
		 * 
		 * 
		 * char[] a=(string1.toCharArray());
		 * 
		 * // for(char x:a) // System.out.println(x); //file1.close();
		 * 
		 * for (int left = 0, right = a.length - 1; left < right; left++, right--) { //
		 * swap the values at the left and right indices char temp = a[left]; a[left] =
		 * a[right]; a[right] = temp; } for(int i=0;i<a.length;i++) {
		 * System.out.print(a[i]); } String string2=new String(a); // String
		 * string2=string1.toString();
		 * 
		 * //
		 * 
		 * System.out.println(string2); //System.out.println(string2);
		 * 
		 * //File obj = new File("D:\\test\\testing.txt"); //FileWriter file=new
		 * FileWriter("D:\\test\\testing.txt"); //Scanner sc=new Scanner(System.in); //
		 * System.out.println("Enter String "); // String string =sc.nextLine();
		 * 
		 * // System.out.println("  "+string1); //file.write(string1);
		 * //System.out.println(file); // } // Printing the Array after reverse
		 * //System.out.print("Reverse Array :"); //{ // { // for(char val : a) //
		 * System.out.print(" "+val); // // }
		 * 
		 * 
		 * // //String revers=val.tostring();
		 * 
		 * if (file.exists()) { System.out.println("File name: " + file.getName());
		 * System.out.println("Absolute path: " + file.getAbsolutePath());
		 * System.out.println("Writeable: " + file.canWrite());
		 * System.out.println("Readable " + file.canRead());
		 * System.out.println("File size in bytes " + file.length()); } else {
		 * System.out.println("The file does not exist."); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //System.out.println(f);
		 * 
		 */

	}
}