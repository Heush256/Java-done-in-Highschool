import java.util.*;
import java.io.*;
public class Main {
  public static void main(String [] args) throws IOException {
   
	  Scanner reader = new Scanner(new File("C:\\Users\\1toas\\eclipse-workspace\\ReadWriteFile\\src\\numbers.txt"));
	  
    PrintWriter writer = new PrintWriter(new File("C:\\Users\\1toas\\eclipse-workspace\\ReadWriteFile\\src\\numbers2.txt"));
    
    int num;
    
    while(reader.hasNext()){
    	
      num = reader.nextInt();
      
      if(num > 0) {
    	  
    	  writer.println(num);
    	  
      }
      
    }
   
    writer.close();
   
    reader.close();
    
  }
  
}