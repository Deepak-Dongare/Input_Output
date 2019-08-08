package Input_Output;

import java.io.*; 
class CW3 
{ 
             public static void main(String args[])throws IOException 
        { 
              FileInputStream Fread =new FileInputStream("D:\\test\\testing.txt"); 
              FileOutputStream Fwrite=new FileOutputStream("D:\\test\\testing2.txt") ; 
              System.out.println("File is Copied"); 
              int c; 
              while((c=Fread.read())!=-1) 
              Fwrite.write((char)c); 
              Fread.close(); 
              Fwrite.close(); 
         } 
} 
