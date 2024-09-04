package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.excel.xlsx");
		
		//step 2: Open Workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		// step 3: Go to particular sheet
		Sheet sheet=wb.getSheet("Sheet1");
		
		//step 4": Go to particular row
		Row row=sheet.getRow(0);
		
		// step 5: Go to particular Cell
		Cell cell=row.getCell(1);
		
		//step 6: Fetch Data
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		//step 7: close Workbook
		wb.close();
	}

}
