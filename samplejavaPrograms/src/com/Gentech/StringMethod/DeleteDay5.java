package com.Gentech.StringMethod;

public class DeleteDay5 {

	public static void main(String[] args) 
	{
	    String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length()-2; i++) 
        {
            if(s.charAt(i) == 'D' && s.charAt(i+1) == 'A' && s.charAt(i+2) =='Y')
            {
                i+=2;
            }
            else sb.append(s.charAt(i));
        }
        System.out.println(sb);

	}

}
