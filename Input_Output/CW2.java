package Input_Output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CW2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("D:\\test\\numberchar.txt");
		FileWriter f1= new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(f1);
			System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		bw.write(string);
	

	}

}
