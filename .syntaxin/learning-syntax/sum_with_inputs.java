package Basics;
import java.util.* ; 

public class sum_with_inputs {

    static void main(String args[]){
     // including scanner class
        Scanner scan = new Scanner(System.in) ; 
        
     // user input 
        int num1 = scan.nextInt() ; 
        int num2 = scan.nextInt() ; 

     // calculation and print ; 
        int sum = num1 + num2 ; 
        System.out.print(sum) ; 

    }
}