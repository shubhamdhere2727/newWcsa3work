package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//read the data from excel file
	public String readExcelData(String Excelpath, String SheetName,int rowCount,int CellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(CellCount);
		String data = cell.getStringCellValue();
		return data;

	}

	//get the row Count from ExcelSheet
	public int  getRowCount(String Excelpath,String SheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}

	//write the data from Excel file
	public void  writeExcelData(String Excelpath,String SheetName,int rowCount,int cellCount,String Data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Excelpath);	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(Data);

		FileOutputStream fos = new FileOutputStream(Excelpath);
		wb.write(fos);
	}

	//read the data from property file

	public String readpropertfile(String PropPath,String key) throws IOException {
		FileInputStream fis = new FileInputStream(PropPath);	
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;

	}
}











