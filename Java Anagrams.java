import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    }
    public static void isAnagram(String x,String y){
       int counter =0;
       int a[]=new int[5];
     for(int i=0;i<x.length();i++)
{
      for(int j=0;j<x.length();j++){
    if(x.charAt(i).toUpperCase==x.charAt(j+1).toUpperCase)
    {

counter++;
    a[i]=counter;      
             }


}


    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
