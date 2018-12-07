import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String l=A.substring(0);
        String Reverse="";

            for(int i=A.length()-1;i>=0;i--){

Reverse=Reverse+A.charAt(i); 
            }

       // String m=B.substring(A.length(),0);
        if(l.equals(Reverse)){
            System.out.println("Yes");

        /* Enter your code here. Print output to STDOUT. */
        
    }
    else
    {
                    System.out.println("No");

    }
    }
}



