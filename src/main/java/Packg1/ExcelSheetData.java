package Packg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelSheetData 
{
	public static void main(String[] args) throws JXLException, Exception {
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\sthaw\\Documents\\test1333.xls");
		System.out.println("test check");
		Workbook workbook =  Workbook.getWorkbook(fis);
		System.out.println("WorkBook1");
		Sheet sht= workbook.getSheet(1);
		System.out.println("test check sheet");
		Cell cl=sht.getCell(0,5);
		 sht.getRow(2);
		System.out.println("test check cell");
		String str=cl.getContents();
		System.out.println(str);
		
		
		
	}

}
