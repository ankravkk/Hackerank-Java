import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
       if(N%2!=0)
       {
    System.out.print("Weird");
       }
        if(N>=1&&N<=100){
if(N%2==0)
    {
        if(2<=N && N<=5)
        {
                System.out.print("Not Weird");
            }
       else if ( 6<=N && N<=20)
       {  
           System.out.print("Weird");
          }
        else if (N>20){
               System.out.print("Not Weird");
        }
       }
       }
    }
};
