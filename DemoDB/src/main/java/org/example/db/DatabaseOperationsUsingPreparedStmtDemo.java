package org.example.db;

import java.sql.*;

public class DatabaseOperationsUsingPreparedStmtDemo {
    public static void main(String[] args) {
    //    readRecords();
        insertRecords();
    }

    private static void readRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gentech", "root", "root");
            String query="select * from dept";
            PreparedStatement stmt=conn.prepareStatement(query);
            ResultSet rs=stmt.executeQuery();
            ResultSetMetaData rsdata =rs.getMetaData();
            String col1=rsdata.getColumnName(1);
            String col2=rsdata.getColumnName(2);
            String col3=rsdata.getColumnName(3);
            System.out.printf("%-12s",col1);
            System.out.printf("%-12s",col2);
            System.out.printf("%-12s",col3);
            System.out.printf("\n");
            while(rs.next())
            {
                String dno=rs.getString("DEPTNO");
                String deptname=rs.getString("DNAME");
                String place=rs.getString("LOC");
                System.out.printf("%-12s",dno);
                System.out.printf("%-12s",deptname);
                System.out.printf("%-12s",place);
                System.out.printf("\n");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void insertRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gentech", "root", "root");
            String query="insert into dept values(50,'HEALTH','BANGALORE')";
            PreparedStatement stmt=conn.prepareStatement(query);
            int v1=stmt.executeUpdate(query);
            System.out.println("Inserted  Record Value:"+v1);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
