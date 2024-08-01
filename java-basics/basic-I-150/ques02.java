import java.util.* ; 

public class ques02{
    public static void main(String args[]){
        Scanner scann = new Scanner(System.in) ;  

        int sum, num1, num2 ; 

        System.out.print("Enter first number : ") ; 
        num1 = scann.nextInt(); 

        System.out.print("Enter Second number : ") ; 
        num2 = scann.nextInt(); 
        
        sum = num1+num2 ; 

        System.out.print("Sum is : " + sum) ; 


        return ; 
    }
}