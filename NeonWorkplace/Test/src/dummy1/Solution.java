package dummy1;


import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt();
        for(int i=0;i<max;i++)
        {
            play(sc.nextInt());
        }
        sc.close();
    }
    public static void play(int n)
    {
        if( player1(n))
        {
            System.out.println("First");
        }
        else
        {
            System.out.println("Second");
        }
    }
    public static boolean player1(int n)
    {
        if(n==0||n==1)
            return false;
        else
        {
            if(n>6)
            return player2(n-2)||player2(n-3)||player2(n-5);
            else if(n==5||n==6)
            return true;
            else if(n==3)
            return true;
            else if(n==4)
            return true;
            else 
            return true;
        }
        
    }
    public static boolean player2(int n)
    {
        if(n==0||n==1)
            return true;
        else
        {
             if(n>6)
            return player1(n-2)&&player1(n-3)&&player1(n-5);
            else if(n==5||n==6)
            return false;
            else if(n==3)
            return false;
            else if(n==4)
            return false;
            else 
            return false;
        }
    }
}
