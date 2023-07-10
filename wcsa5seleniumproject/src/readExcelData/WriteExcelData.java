package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//
		  
	    
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("IPL");
         Row row = sheet.createRow(11);
		 //Row row = sheet.getRow(1);
         //create the cell by using Row (I)
         Cell cell = row.createCell(0);
         // write the data 
         cell.setCellValue("Pune");
         
         FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
         wb.write(fos);
         
        
	    }
	}


