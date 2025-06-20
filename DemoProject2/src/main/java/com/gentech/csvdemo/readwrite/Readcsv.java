package com.gentech.csvdemo.readwrite;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class Readcsv {
    public static void main(String[] args) {
        readContent();
    }

    private static void readContent() {
        FileReader fr = null;
        CSVReader reader = null;
        try {
            fr = new FileReader("D:\\Excel\\EmployeesDetails.csv");
            reader = new CSVReader(fr);

            String[] data = null;
            while ((data = reader.readNext()) != null) {
                for (String cell : data) {
                    System.out.print(cell + ",");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


