package Input_Output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class revress extends BufferWriteReaderDemo{

	String s=new String(string2);
	public static void main(String[] args) {
		File file= new File("D:\\test\\testing1.txt");
		FileWriter f2= new FileWriter(file,true);
		BufferedWriter bw1 = new BufferedWriter(f2);
		char[] string3;
		//System.out.println();
		//Scanner sc=new Scanner(System.in);
		//String string=sc.nextLine();
		 bw1.write(string2);

	}}
