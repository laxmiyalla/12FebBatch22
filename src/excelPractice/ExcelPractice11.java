package excelPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice11 
{
 public static void main(String[] args) throws IOException 
{
	 String path = "E:\\Testinng course\\laxmi excel practice.xlsx";
	 FileInputStream file = new FileInputStream(path);
	 XSSFWorkbook book = new XSSFWorkbook(file);
	 XSSFSheet sheet = book.getSheet("forloop");
//	 XSSFRow row = sheet.getRow(0);
//	 XSSFCell cell = row.getCell(0);
//	 String print = cell.getStringCellValue();
//	 System.out.println("Value of laxmi excel practice is"+print);
//	 
//	 XSSFRow row1 = sheet.getRow(0);
//	 XSSFCell Cell=row.getCell(1);
//	 String print1 = cell.getStringCellValue();
//	 System.out.println("value of laxmi excel practice is-"+print1);
	 int rowCount = sheet.getLastRowNum();
	 System.out.println("total row-"+rowCount);
	for(int i=0;i<=rowCount; i++)
	 {
		String data= sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username is-"+data);
	 }
		for(int i=0; i<=rowCount; i++)
		{
			String data1 = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password is-"+data1);
	 }
	 
	 
	 

}
} 