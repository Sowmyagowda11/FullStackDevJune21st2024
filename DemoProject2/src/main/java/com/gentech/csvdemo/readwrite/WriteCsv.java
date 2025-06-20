package com.gentech.csvdemo.readwrite;


import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class WriteCsv {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileWriter fw=null;
        CSVWriter writer=null;
        try
        {
            fw=new FileWriter("D:\\Excel\\EmployeesDetails.csv");
            writer=new CSVWriter(fw);

            String header[]={"empid","ename","jobname","salary","dname","location"};
            writer.writeNext(header);

            String row1[]={"7211","Santosh","Manager","24000","Research","Bangalore"};
            writer.writeNext(row1);

            String row2[]={"7211","Santosh","Manager","24000","Research","Bangalore"};
            writer.writeNext(row2);

            String row3[]={"7211","Santosh","Manager","24000","Research","Bangalore"};
            writer.writeNext(row3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                writer.flush();
                writer.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}