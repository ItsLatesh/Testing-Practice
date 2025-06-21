package dDT01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDT01 {

	public static void main(String[] args) throws IOException {
		// Apache poi library 
//		data driven testing 
		
//		 provided by apache poi 
//		XSSWorkbook
//		XSSheet
//		XSSFRow
//		XSSFCell
		
		
		//reading data from excel
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\DataTesting01\\Latesh_Dev_Bug_error.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("devBUg");
		
		//XSSF Sheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows: " + totalRows);
		System.out.println("Total columns: " + sheet.getRow(1).getLastCellNum());
		
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) {
				XSSFCell cell = currentRow.getCell(c);
				cell.toString();
				System.out.print(cell.toString());
				
				
			}
			System.out.println();
			
		}
		
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://Dev1:DevImm354@@devlms.immverse.ai");
//        driver.manage().window().maximize();
//        
        
        
        
        

	}

}
