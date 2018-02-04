package com.www.test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ReadData 
{
	public String fileName="C:\\Users\\Shuily\\workspace\\project\\Software Engineer Questionnaire\\src\\Data.txt";
	
	
	@Test	
	public void getMessage() throws IOException
	{
		
		 StringBuilder stringbuilder = new StringBuilder();
		
		 BufferedReader bufferedreader=null;
		 FileReader filereader=null;
		try {
			
			
			 bufferedreader= new BufferedReader(new FileReader(fileName));
		    String line = bufferedreader.readLine();
		    while (line != null) 
		    {
		    String word1= 	line.substring(0, 8);
		    System.out.println(word1);
		    String word2= 	line.substring(8);
		    	  String[] words= word2.split(",");
			       for(int i=0;i<words.length;i++)
			       {
			       System.out.println(words[i]);
			       }
		      	stringbuilder.append(line);
		        stringbuilder.append(System.lineSeparator());
		        line = bufferedreader.readLine();
		      
		       	      
		    }
		    
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	
		finally 
		{
		    bufferedreader.close();
		}
		
	}

}


