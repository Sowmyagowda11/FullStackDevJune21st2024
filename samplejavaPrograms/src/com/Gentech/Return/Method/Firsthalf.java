package com.Gentech.Return.Method;
class halffirst
{
    int[] FirstElement( int st[])
    {
        int b[] = new int[st.length/2];
        for (int i = 0; i <b.length; i++)
        {
            b[i]=st[i];
        }

            return b;

    }
}
public class Firsthalf {
    public static void main(String args[])
    {
        halffirst o1=new halffirst();
        int s[]={10,12,14,16,18,20};
        int k[]=o1.FirstElement(s);
        for(int kk:k)
        {
            System.out.print(kk+" ");
        }
    }
}

