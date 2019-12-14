package com.OHRM.TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OHRM.TestBase.TestBase;

public class XLUtils extends TestBase {
	
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static FileInputStream fi;
	public static FileOutputStream fo;
	
	
	public String readDataFromExcel(String xlfile, String sheet, int r, int c){
		String s=null;
		try {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(sheet);
			row=ws.getRow(r);
			cell=row.getCell(c);
			 s=cell.getStringCellValue();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static int rowCountFromExcel(String xlfile, String sheet){
		int rc=0;
		try {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(sheet);
			rc=ws.getLastRowNum()-ws.getFirstRowNum();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rc;
	}
	
	public static int colCountFromExcel(String xlfile, String sheet){
		int cc=0;
		try {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(sheet);
			row=ws.getRow(0);
			
			cc=row.getLastCellNum();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cc;
	}
	
	public void writeDataInToExcel(String xlfile, String sheet, int j, String val){
		
		try {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(sheet);
			row=ws.getRow(0);
			//Row newRow = ws.createRow(rowCountFromExcel(xlfile, sheet)+1);	
			//cell=row.getCell(c);
			/*s=cell.getStringCellValue();*/
	        Cell cell = row.createCell(j);
        
		        cell.setCellValue(val);
		        
		        fi.close();
		        fo=new FileOutputStream(xlfile);
		       wb.write(fo);
		       fo.close();
		    

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
