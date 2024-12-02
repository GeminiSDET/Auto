import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrive {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("/Users/azarahmed/Downloads/TestAuto.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) 
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();

				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) 
				{
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) 
					{
						coloumn = k;
					}
					k++;
				}
				System.out.println(coloumn);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase")) 
					{
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) 
						{
							System.out.println(cv.next().getStringCellValue());
						}
					}
				}
			}
		}
	}
}
