package ProductStoreExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProductStoreExcel {

	public int row_count() throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/testdata.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		//To get the count of last row
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		return rowcount;
	}
	public String excelUsername(int x) throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/testdata.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		//To read username from Testdata excel
        XSSFRow row=sheet.getRow(x);
    	XSSFCell cell=row.getCell(0);
    	String un=cell.getStringCellValue();
    	return un;
	}
	public String excelPassword(int y) throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/TestData/testdata.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		//To read password from Testdata excel
		XSSFRow row=sheet.getRow(y);
		XSSFCell cell1=row.getCell(1);
    	String pwd=cell1.getStringCellValue();
    	return pwd;
	}
}
