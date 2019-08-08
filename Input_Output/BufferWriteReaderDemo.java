package Input_Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriteReaderDemo {

	public static void main(String[] args) throws Exception {
		//one way
	//	BufferedWriter bw=new BufferedWriter(new FileWriter("xyz.txt"));
		
		//2nd way
	File f= new File("D:\\test\\tsting.txt");
		FileWriter f1= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(f1);
	System.out.println("Enter String ....");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		bw.write(string);
	//bw.write(100);
	//	bw.write('a');
		//bw.newLine();
		//bw.write("abcfdhdhjg");
		
	bw.flush();
	//	System.out.println(bw);
	bw.close();
		
		
		// FileReader fr = new FileReader("D:\\test\\testing.txt"); 
		// BufferedReader reader = new BufferedReader(fr);
	//	 String string1 =reader.readLine();
		//System.out.println(string1);
		//System.out.println(string.readLine()); //char
		
		 
		
	FileInputStream fS=new FileInputStream(f);
	char  a[]=new char[fS.available()];
	//int i1=0;
	
//	while(fS.available()>0) {
	//	int  s= fS.read();
		//a[i1]=(char)s;
//		System.out.print(a[i1]);
				
//	}
	for(int i = 0;i<a.length;i++)
	{
		int  s= fS.read();
		 a[i]=(char)s;
	System.out.print(a[i]);
	}
//		//char r[]=c.tocharArray();
//	}
	//int i=0;dfggh
	//int a=fS.read();
//	char[] r=new char[fS.available()];
	//for(int i=0;i<fS.available();i++) {
		 
		//System.out.println(":::"+r[i]);
		//r[i]=;
	//}
//	System.out.println(r);
	//	while( (i=fS.read())!=-1) {
			
			
			//char c=(char)s;
			
			///String  x[]=c.tocharArray();
		//}
	//	char c=(char)s;
		
	//	 for(String x: s)
		// String string1 =new String();
		 
		  //char[] a=(s.toCharArray());
		  
		  for (int left = 0, right = a.length - 1; left < right; left++, right--) 
		  { 
			    
			  char temp = a[left];
	            a[left]  = a[right];
	            a[right] =  temp;
		} 
		  //int i2=0;
		  //while(fS.available()>0) {
			//  System.out.println(a[i2]);
		  
		  
	System.out.println();
//	  for(int i=0;i<a.length;i++) {
//				
//			  System.out.print("::::"+a[i]);
//		  }
//		  
	//  String String3 =n
		//  String string1=a.toString();
		 // System.out.println("data"+string1);
//	
		  
		// String string3=" ";
//		  for(char val : c);
		//  char c=(char)val;
			  
	          
//				 
		 String string1=new String(a); // String
		 
				// string2=string1.toString();
				System.out.println("::::"+string1);
				 //string3=string2;
				 
			 File file= new File("D:\\test\\newtest.txt");
			FileWriter f2= new FileWriter(file);				
			//	BufferedWriter bw1 = new BufferedWriter(f2);
				//FileOutputStream fos=new FileOutputStream(file);
		//		 String string3=new String();
	//		fos.write(string1.getBytes());
			//	BufferedWriter bw1 = new BufferedWriter(fos);
				
				//	System.out.println();
				//	Scanner sc=new Scanner(System.in);
			//	String string=sc.nextLine();
				f2.write(string1);
//		  FileInputStream f=new FileInputStream();
							 
		
	}

	}
	
