import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		
		System.out.println("writing process starts");
		
		String outputFilePath = "resources/outputFile2.txt";
		
		String fileContents = "abcdefgijklomn";
		
		try{
			
			FileWriter fileWriter = new FileWriter(outputFilePath);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			
			printWriter.println("the contents is:");
			
			printWriter.print(fileContents);
			
			printWriter.println();
			
			printWriter.println("the contents is over.");
			
			printWriter.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("writing process ends");
		
		
		System.out.println("reading process starts");
		
		String inputFilePath = "resources/outputFile.txt";
		
		File inputFile = new File(inputFilePath);
		
		BufferedReader br = null;
		
		ArrayList<String> result = new ArrayList<String>();
		
		try{
			
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			
			br = new BufferedReader(inputStreamReader);
			
			String line = null;
			
			while((line = br.readLine())!=null){
				String [] splits = line.split(" ");
				
				for(String str: splits){
					result.add(str);
				}
			}
			
			br.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("reading process ends");
		
		System.out.println(result);
		
		System.out.print("the result is:");
		
		for(String str: result){
			System.out.print(str);
		}
		
		
		
		
		
	}
	
	
}
