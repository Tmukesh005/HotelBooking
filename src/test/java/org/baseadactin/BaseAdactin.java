package org.baseadactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAdactin {
	
	public static  WebDriver driver;

	public void  browse_Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public  static void select(WebElement element,String value) {
		Select s1=new Select(element);
		s1.selectByVisibleText(value);
				
	}
	
	public static void pause() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static String xcel_read(int row1,int col1) {
		String value=null;
		try {
			File f= new File("C:\\Users\\MIVAAN\\eclipse-workspace\\HotelBooking\\xcelSheet\\Adactin.xls");
			FileInputStream input = new FileInputStream(f);
		    HSSFWorkbook workbook =new HSSFWorkbook(input);
		    HSSFSheet sheet = workbook.getSheet("Sheet1");
		    HSSFRow row = sheet.getRow(row1);
		    HSSFCell cell = row.getCell(col1);
		     int cellType = cell.getCellType();
		    if(cellType==1) {
		    	 value = cell.getStringCellValue();
		    	System.out.println(value);
		    }
		    if(cellType==0) {
		    if(DateUtil.isCellDateFormatted(cell)){
		    	Date dateCellValue = cell.getDateCellValue();
		    	SimpleDateFormat format=new SimpleDateFormat("dd-mmm-yy");
		     value = format.format(dateCellValue);
		    }else {
		    	double numericCellValue = cell.getNumericCellValue();
		    	long l=(long)numericCellValue;
		       value = String.valueOf(l);
		    }
		   }
		}
		    catch(IOException e) {
		    	System.out.println(e.getStackTrace());
		    }
		return value;
	}
			
		
	public  void cLaunch() {
		driver.close();
	}

}
