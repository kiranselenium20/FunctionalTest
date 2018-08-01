package com.csam.CommonLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExFunctions {
	
	static String resultFile=null;
	static int rowNum=2;
	
	public static void createOutPutfile() throws Exception{
		resultFile="C:\\Practise\\Result\\Results" + "_" + DateFormats.addDate("MM_dd_YYYY_HH_mm_ss")+".xlsx";
		try{
			File resultsfile= new File(resultFile);
			XSSFWorkbook wBook= new XSSFWorkbook();
			XSSFSheet wSheet = wBook.createSheet("Results");
			Row row =wSheet.createRow(rowNum);
			
			row.createCell(rowNum).setCellValue("Test Case Number");
			row.createCell(rowNum+1).setCellValue("Result");
			row.createCell(rowNum+2).setCellValue("Screen shot");
			wSheet.autoSizeColumn((short)23);
			rowNum++;
			// creating new work book with above values	 
			  FileOutputStream fout= new FileOutputStream(resultFile);
			  wBook.write(fout);
			  fout.flush();
			  fout.close();	
		}catch(Exception e){
			System.out.println("Can not create output file");
		}
	}
	
	public static void writeResults(String TestCasenumber,String Result,String screenShot){
		try{
			File rFile= new File(resultFile);
			 FileInputStream fis= new FileInputStream(rFile);
			   	XSSFWorkbook wbook= new XSSFWorkbook(fis);
			   	XSSFSheet sheet= wbook.getSheet("Results");
			   	
			   	XSSFCreationHelper helper= wbook.getCreationHelper();
			   	XSSFCellStyle linkStyle=wbook.createCellStyle();
			    XSSFFont linkFont=wbook.createFont();
			    linkFont.setUnderline(XSSFFont.U_SINGLE);
			    //XSSFColor(linkFont.setColor((short) 1));
			    //linkFont.setUnderline(XSSFColorlinkFont.setColor((short) 1)));
			    linkStyle.setFont(linkFont); 	
			    //System.out.println(screenShot);
			    
	            //fileLink.setTooltip("Click to open the file");
		       	Row row = sheet.createRow(rowNum);
		        Cell cell = row.createCell(0);
		       	cell.setCellValue(TestCasenumber);
		       	Cell cell1 = row.createCell(1);
		       	cell1.setCellValue(Result);
		     	Cell cell2 = row.createCell(2);
		       	cell2.setCellValue("Click here");
		        XSSFHyperlink fileLink=helper.createHyperlink(Hyperlink.LINK_FILE);
		       	//fileLink.setLocation(screenShot);
		        screenShot=screenShot.replace("\\", "/");
		        
		        //System.out.println(screenShot);
		       	fileLink.setAddress(screenShot);
		       	
                cell2.setHyperlink(fileLink);
                cell2.setCellStyle(linkStyle);                
		    	rowNum++;
		    	  FileOutputStream fout= new FileOutputStream(resultFile);
				  wbook.write(fout);
				  fout.flush();
				  fout.close();			 
	    	
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	}

}
