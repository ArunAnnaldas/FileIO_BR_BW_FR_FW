package readString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StringReader {

	public static void main(String[] args) throws Exception {

		ArrayList<String> al = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		while(!str.equals("end"))
		{
			al.add(str);
			str = br.readLine();
		}
		

		BufferedReader fis = new BufferedReader(
				new FileReader(
						new File("C:\\Users\\aannaldas\\Desktop\\ReadData.txt")
				)
		);
		
		str = fis.readLine();
		while(str!=null)
		{
			al.add(str);
			str = fis.readLine();
		}
		
		PrintWriter fos = new PrintWriter(
								new BufferedWriter(
										new FileWriter(new File("C:\\Users\\aannaldas\\Desktop\\output.txt"),true)
								),true
						  );
		
		for(String s : al)
		{
			System.out.println(s);
			fos.println(s); 
		}
		
		

	}
}
