package dDT01;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingMode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\DataTesting01\\myfile.xlsx");
		 
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet= workbook.createSheet("Data");
		 
		 
						 /*for dynamic data 
						  *FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\DataTesting01\\myfile.xlsx");
						 
				//		
				//		XSSFWorkbook workbook = new XSSFWorkbook();
				//		 XSSFSheet sheet= workbook.createSheet("Data");
				///scanner sc = new Scanner(System.in);
				///		 System.out.println("Enter the number of rows you want to add:");
				///		 int rows = sc.nextInt();
				//////		 System.out.println("Enter the number of columns you want to add:");
				/////		 int cols = sc.nextInt();
				///
				///for(int r=9;r<=10;r++) {
				///{
				//      XSSFRow currentrow = sheet.createRow(r);
				//      
				///for(int c=0;c<=2;c++) {
				///XSSFCell cell = currentrow.createCell(c);
				///cell.setCellValue(sc.next());
				///
				///
				/// 
				///}
				///}
				///
				///		 
						 
						  */
		 
		 sheet.createRow(0).createCell(0).setCellValue("Name");
		 sheet.getRow(0).createCell(1).setCellValue("Age");
		 sheet.getRow(0).createCell(2).setCellValue("City");
		 sheet.createRow(1).createCell(0).setCellValue("John");
		 sheet.getRow(1).createCell(1).setCellValue("25");
		 sheet.getRow(1).createCell(2).setCellValue("New York");
		 sheet.createRow(2).createCell(0).setCellValue("Alice");
		 sheet.getRow(2).createCell(1).setCellValue("30");
		 	sheet.getRow(2).createCell(2).setCellValue("Los Angeles");
		 	sheet.createRow(3).createCell(0).setCellValue("Bob");
		 	sheet.getRow(3).createCell(1).setCellValue("28");
		 	sheet.getRow(3).createCell(2).setCellValue("Chicago");
		 	
		 	workbook.write(file);
		 	
		 	workbook.close();
		 	file.close();
		 	
		 	System.out.println("Data written successfully to myfile.xlsx");
		 	
		 	
		 	
		 	
		
	}

}
