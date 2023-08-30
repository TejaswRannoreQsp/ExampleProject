package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Toreaddatafromexcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//creation of fR/FIS
		FileInputStream fis=new FileInputStream("./TestData/Book4.xlsx");
		
		//object for file type
		Workbook workbook = WorkbookFactory.create(fis);
		
		//read methods
		String testdata = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        System.out.println(testdata);
        
        String testdata1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
        System.out.println(testdata1);
       
        	
        }
	}


