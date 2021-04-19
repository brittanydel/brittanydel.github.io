package snhu.jukebox.playlist;
import java.io.FileOutputStream; 
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;

public class ExcelExporter{
    public static void main(String[]args) {
        try {
        	//Create new Excel File for Export, name sheet
            String filename = "C:/PlaylistExport.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Songlist");  
            
            //Create Rowhead for Song and Artist
            HSSFRow rowhead = sheet.createRow((short)0);
            rowhead.createCell(0).setCellValue("Song");
            rowhead.createCell(1).setCellValue("Artist");
            
            //Fill rows and cells with songlist
            HSSFRow row = sheet.createRow((short)1);
            row.createCell(0).setCellValue("Hour");
            row.createCell(1).setCellValue("Porches");
            
            HSSFRow row2 = sheet.createRow((short)2);
            row2.createCell(0).setCellValue("Permanent Loan");
            row2.createCell(1).setCellValue("Porches");
            
            HSSFRow row3 = sheet.createRow((short)3);
            row3.createCell(0).setCellValue("Dead of Night");
            row3.createCell(1).setCellValue("Orville Peck");
            
            HSSFRow row4 = sheet.createRow((short)4);
            row4.createCell(0).setCellValue("Queen of the Rodeo");
            row4.createCell(1).setCellValue("Orville Peck");
            
            HSSFRow row5 = sheet.createRow((short)5);
            row5.createCell(0).setCellValue("Roses are Falling");
            row5.createCell(1).setCellValue("Orville Peck");

           // Output excel file to user desktop, close file output, print success message
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Playlist Songlist Exported");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}