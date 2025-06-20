package com.gentech.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite7 {
    public static void main(String[] args) {
        Workbook workbookWrite = new XSSFWorkbook();
        Sheet sheetWrite = workbookWrite.createSheet();

        try {
            FileInputStream fis = new FileInputStream("D:\\Excel\\vegatble1.xlsx");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheetRead = workbook.getSheetAt(0);

            Row rowWrite = sheetWrite.createRow(4);
            int cellNo = 0;

            for (Row row : sheetRead) {
                Cell cell = row.getCell(0);
                if (cell != null) {
                    String data = cell.getStringCellValue();
                    Cell cellWrite = rowWrite.createCell(cellNo++);
                    cellWrite.setCellValue(data);
                }
            }

            FileOutputStream fos = new FileOutputStream("D:\\Excel\\Vegetable2.xlsx");
            workbookWrite.write(fos);
            fos.close();

            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Success");
    }
}
