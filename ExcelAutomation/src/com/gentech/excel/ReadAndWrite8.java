package com.gentech.excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite8 {
    public static void main(String[] args) {
        Workbook workbookWrite = new XSSFWorkbook();
        Sheet sheetWrite = workbookWrite.createSheet("Sheet2");

        try {
            FileInputStream fis = new FileInputStream("D:\\Excel\\Country1.xlsx");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheetRead = workbook.getSheetAt(0);

            Row rowWriteCountry = sheetWrite.createRow(3); // 4th row (index 3)
            Row rowWriteCapital = sheetWrite.createRow(4); // 5th row (index 4)

            int cellNo = 0;

            for (Row row : sheetRead) {
                Cell countryCell = row.getCell(0); // 1st column for country names
                Cell capitalCell = row.getCell(1); // 2nd column for capital city names

                if (countryCell != null && capitalCell != null) {
                    String country = countryCell.getStringCellValue();
                    String capital = capitalCell.getStringCellValue();

                    Cell cellWriteCountry = rowWriteCountry.createCell(cellNo);
                    Cell cellWriteCapital = rowWriteCapital.createCell(cellNo);

                    cellWriteCountry.setCellValue(country);
                    cellWriteCapital.setCellValue(capital);

                    cellNo++;
                }
            }

            FileOutputStream fos = new FileOutputStream("D:\\Excel\\Country2.xlsx");
            workbookWrite.write(fos);
            fos.close();

            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Success");
    }
}

