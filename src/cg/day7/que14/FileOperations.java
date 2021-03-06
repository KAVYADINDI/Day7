package cg.day7.que14;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileOperations {
	public static boolean operations(String path1,String path2, int choice) {
		LinkedList<Character> elements1 = new LinkedList<Character>();
		LinkedList<Character> elements2 = new LinkedList<Character>();
		File file1=new File(path1);
		File file2=new File(path2);
		File resultFile=new File("C:\\Users\\KAKALIDI\\notes\\D3.txt");
		if(choice==1)
		{
			int temp=0;
			try(FileReader filereader=new FileReader(file1);
					BufferedReader reader=new BufferedReader(filereader);)
			{
				while((temp=reader.read())!=-1)
				{
					
					elements1.add((char) temp);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
			System.out.println(elements1);
			
			
			try(FileOutputStream fos=new FileOutputStream(resultFile);
					DataOutputStream printer= new DataOutputStream(fos);)
			{
				for(int i=elements1.size()-1;i>=0;i--)
				printer.writeChar(elements1.get(i));
				
				
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		
		
		if(choice==2)
		{
			int temp=0;
			try(FileReader filereader=new FileReader(file1);
					BufferedReader reader=new BufferedReader(filereader);)
			{
				while((temp=reader.read())!=-1)
				{
					
					elements1.add((char) temp);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			try(FileReader filereader=new FileReader(file2);
					BufferedReader reader=new BufferedReader(filereader);)
			{
				while((temp=reader.read())!=-1)
				{
					
					elements2.add((char) temp);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			if(elements1.equals(elements2))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		if(choice==3)
		{
			int temp=0;
			try(FileReader filereader=new FileReader(file1);
					BufferedReader reader=new BufferedReader(filereader);)
			{
				while((temp=reader.read())!=-1)
				{
					
					elements1.add((char) temp);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
			System.out.println(elements1);
			
			
			try(FileOutputStream fos=new FileOutputStream(resultFile);
					DataOutputStream printer= new DataOutputStream(fos);)
			{
				for (int i=0;i<elements1.size();i++) {
					printer.writeChar(Character.toUpperCase(elements1.get(i)));

				}
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		return true;
	}

}
