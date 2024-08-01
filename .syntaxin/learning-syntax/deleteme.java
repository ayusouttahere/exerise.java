package Basics;
import java.util.* ; 
public class deleteme {
    public static void main(String args[]){ 
        Scanner scan = new Scanner(System.in) ; 
        
        int radius = scan.nextInt() ; 

        double area ; 
        double pi = 3.14 ; 

        area = pi * radius * radius ; 
        
        System.out.print(area) ; 
    }
}
