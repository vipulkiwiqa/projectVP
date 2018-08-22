package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static Sheet getExcelSheet(int sheetIndex) {
		
		  String dataFilePath = "resources/Workbook.xlsx";
		  File datafile = new File(dataFilePath);
		  String fullpath = datafile.getAbsolutePath();
		  Sheet firstSheet = null;

		  try {

		   System.out.println("full path " + datafile.getAbsolutePath() + " con " + datafile.getCanonicalPath());

		   FileInputStream inputStream = new FileInputStream(new File(fullpath));

		   Workbook workbook = new XSSFWorkbook(inputStream);
		   firstSheet = workbook.getSheetAt(sheetIndex);

		   workbook.close();
		   inputStream.close();

		  } catch (Exception e) {

		  }
		  return firstSheet;
		 }
	
	public static String firstname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(0).getCell(0).getStringCellValue();
		}
	
	public static String lastname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(1).getCell(0).getStringCellValue();
		}
	public static String phonenumber() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(2).getCell(0).getStringCellValue();
		}
	public static String username() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(3).getCell(0).getStringCellValue();
		}
	public static String emailid() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(4).getCell(0).getStringCellValue();
		}
	public static String aboutyourself() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(5).getCell(0).getStringCellValue();
		}
	public static String password() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(6).getCell(0).getStringCellValue();
		}
	public static String confirmpassword() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(7).getCell(0).getStringCellValue();
		}
	
	
	
	//Invalid data
	
	public static String invalidphonenumber() {

		  System.out.println("Call getURL.......");
		  
		  getExcelSheet(0).getRow(2).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
		  
		  return getExcelSheet(0).getRow(2).getCell(1).getStringCellValue();
		}
	
	
	public static String invalidpassword() {
		// TODO Auto-generated method stub
		 System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(6).getCell(1).getStringCellValue();
	}
	
	
	public static String donotmatchpassword() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(6).getCell(2).getStringCellValue();
		}
	public static String donotmatchconfirmpassword() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(7).getCell(2).getStringCellValue();
		}

	public static String invalidemailid() {
		// TODO Auto-generated method stub
		 System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(4).getCell(2).getStringCellValue();
	}

	public static String existusername() {
		// TODO Auto-generated method stub
		System.out.println("Call getURL.......");
		return getExcelSheet(0).getRow(3).getCell(3).getStringCellValue();
	}

	public static String notregisteremailid() {
		// TODO Auto-generated method stub
		System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(4).getCell(3).getStringCellValue();
	}
	
	public static String notexistusername() {
		// TODO Auto-generated method stub
		System.out.println("Call getURL.......");
		return getExcelSheet(0).getRow(3).getCell(4).getStringCellValue();
	}
	
	public static String registeremailid() {
		// TODO Auto-generated method stub
		System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(4).getCell(4).getStringCellValue();
		  
	}
	
	
	//Demo Sites
	
	public static String demo_firstname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(0).getCell(5).getStringCellValue();
		}
	
	public static String demo_lastname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(1).getCell(5).getStringCellValue();
		}
	
	public static String demo_address() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(2).getCell(5).getStringCellValue();
		}
	
	public static String demo_city() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(3).getCell(5).getStringCellValue();
		}
	
	public static String demo_state_province() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(4).getCell(5).getStringCellValue();
		}
	
	public static String demo_country() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(0).getRow(5).getCell(5).getStringCellValue();
		}
	public static String demo_postalcode() {

		  System.out.println("Call getURL.......");
		  getExcelSheet(0).getRow(6).getCell(5).setCellType(Cell.CELL_TYPE_STRING);
		  return getExcelSheet(0).getRow(6).getCell(5).getStringCellValue();
		}
	
	public static String demo_phonenumber() {

		  System.out.println("Call getURL.......");
		  getExcelSheet(0).getRow(7).getCell(5).setCellType(Cell.CELL_TYPE_STRING);
		  return getExcelSheet(0).getRow(7).getCell(5).getStringCellValue();
		}
	
	//Threads and Shirts
	public static String ts_firstname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(0).getCell(1).getStringCellValue();
		}
	
	public static String ts_lastname() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(1).getCell(1).getStringCellValue();
		}
	
	public static String ts_emailaddress() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(2).getCell(1).getStringCellValue();
		}
	
	public static String ts_phone() {

		  System.out.println("Call getURL.......");
		  getExcelSheet(1).getRow(3).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
		  
		  return getExcelSheet(1).getRow(3).getCell(1).getStringCellValue();
		}
	
	public static String ts_address() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(4).getCell(1).getStringCellValue();
		}
	
	public static String ts_city() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(5).getCell(1).getStringCellValue();
		}
	public static String ts_country() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(6).getCell(1).getStringCellValue();
		}
	
	public static String ts_state() {

		  System.out.println("Call getURL.......");
		  return getExcelSheet(1).getRow(7).getCell(1).getStringCellValue();
		}
	
	public static String ts_postalcode() {

		  System.out.println("Call getURL.......");
		  getExcelSheet(1).getRow(8).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
		  return getExcelSheet(1).getRow(8).getCell(1).getStringCellValue();
		}
}
