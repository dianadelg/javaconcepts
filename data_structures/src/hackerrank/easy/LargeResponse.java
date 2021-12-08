package hackerrank.easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class LargeResponse {
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\diana\\Documents\\javaconcepts\\data_structures\\src\\Test1.txt");
		File output = fileName(file);
		//System.out.println(output.getAbsolutePath());
		
		try(BufferedReader br = new BufferedReader(new FileReader(output))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	System.out.println(line);
		    }
		    // line is not visible here.
		} 
	}
	
	//input --> File filename with records in the file
	//output --> an output file named bytes_<filename> which stores information about the Large Responses
	//in the output file, write the following --> 
		// first line must contain the number of requests that have more than 5000 bytes sent in their response
		// second line must contain the total sum of bytes sent by all responses sending more than 5000 bytes
	
	//NOTE: output file must be written to the current directory
	
	public static File fileName(File filename) throws FileNotFoundException, IOException {
		String outputPath = filename.getParent();
		outputPath = outputPath.substring(filename.getName().length());

		long byteTotal = 0;
		int fileNum = 0;
		String outputFileName = "bytes_" + filename.getName();
		
		//System.out.println("File should go to: " + outputPath);
		//System.out.println("output file name is: " + outputFileName);
		
		String newPath = "C:\\Users\\"+outputPath+"\\";
		
		//System.out.println(newPath);
        File outputFile = new File(newPath, outputFileName);
        


        //below works
        //File outputFile = new File("C:\\Users\\diana\\Documents\\javaconcepts\\data_structures\\src\\", outputFileName);

		outputFile.createNewFile();
		

		//System.out.println("Path of new outputFile is : " + outputFile.getAbsolutePath());
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        //process the line.
		    	//System.out.println(line);
		    	String[] tokens = line.split(" ");
		    	if(Integer.parseInt(tokens[tokens.length-1]) > 5000){
		    		byteTotal += Integer.parseInt(tokens[tokens.length-1]);
		    		fileNum++;
		    	}
		    }
		    // line is not visible here.
		}
		
		
		//once we iterated through all lines
		
		try {
		    final Path path = Paths.get(outputFile.getAbsolutePath());
		    Files.write(path, Arrays.asList(Integer.toString(fileNum)), StandardCharsets.UTF_8,
		        Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
		    Files.write(path, Arrays.asList(Long.toString(byteTotal)), StandardCharsets.UTF_8,
			        Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
		} catch (final IOException ioe) {
			System.out.println("An error occurred.");
            ioe.printStackTrace();
		}
        return outputFile;
		
		
		
		
	}
	
	

}
