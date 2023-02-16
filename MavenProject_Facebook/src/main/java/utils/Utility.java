package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.poi.EmptyFileException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	// take a ScreenShorts
	public static void getScreenShot(WebDriver driver, String name) throws IOException {
		Random number = new Random();
		int num = number.nextInt();
		SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date d = new Date();
		String date = dtf.format(d).replace("/", "-").replace(":", " ");

		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\AKASH\\OneDrive\\Pictures\\Screenshots\\" + name + " " + date + " " + num + ".jpeg");
		FileHandler.copy(src, dest);
	}

	public static String getExcelData(int rollNum, int cellNum) throws IOException {
		String path = "G:\\Akash\\Carrier\\Velocity\\Automation\\Excel data\\htmltable.xlsx";
		InputStream file = new FileInputStream(path);
		double data1;
		String data;
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet2 = workbook.getSheet("Sheet2");
		try {
			data = sheet2.getRow(rollNum).getCell(cellNum).getStringCellValue();
		} 
		catch (IllegalStateException i) {

			data1 = sheet2.getRow(rollNum).getCell(cellNum).getNumericCellValue();
			data = String.valueOf(data1);
		}

		return data;
	}
}
