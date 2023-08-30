package datadriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadadtafromcsvfile {

	public static void main(String[] args) throws IOException {
		//creation of file input stream or file reader
		FileReader fr=new FileReader("./TestData/testdata.csv");
		
		//creation of file type object
		//CSVReader reader=new CSVReader(fr);
		CSVReader reader=new CSVReader(fr);
		
		//read methods
		String[] firstlinedata=reader.readNext();
		for(String data:firstlinedata) {
			System.out.print(data+ ",");
		}
		System.out.println();
		
			List<String[]> alldata=reader.readAll();
			for(String[] data1:alldata) {
				for(String arr:data1)
				System.out.print(arr+ ",");
			
		}

	}

}
