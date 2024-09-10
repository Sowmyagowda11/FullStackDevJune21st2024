package org.example.reflection2;

public class SampleDemo {
    public static void main(String[] args) {

        try
        {
            Class.forName("org.example.reflection2.Sample");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
