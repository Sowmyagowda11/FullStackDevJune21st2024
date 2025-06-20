package com.gentech.excel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteFlowers6 {
    public static void main(String[] args) {
        readAndWriteExcel();
    }

    private static void readAndWriteExcel() 
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream("D:\\Excel\\book1.xlsx");
            workbook = new XSSFWorkbook(fis);
            Sheet firstSheet = workbook.getSheetAt(0);
            Sheet secondSheet = workbook.createSheet("SecondSheet");

            int rowCount = firstSheet.getLastRowNum();
            for (int i = 0; i <= rowCount; i++) 
            {
                Row sourceRow = firstSheet.getRow(i);
                if (sourceRow != null) {
                    Cell sourceCell = sourceRow.getCell(0);
                    if (sourceCell != null) 
                    {
                        String firstName = sourceCell.getStringCellValue();
                        Row newRow = secondSheet.createRow(i);
                        Cell newCell = newRow.createCell(0);
                        newCell.setCellValue(firstName);
                    }
                }
            }
            fos = new FileOutputStream("D:\\Excel\\book2.xlsx");
            workbook.write(fos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                {
                    fis.close();
                }
                if (fos != null)
                {
                    fos.close();
                }
                if (workbook != null) 
                {
                    workbook.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

