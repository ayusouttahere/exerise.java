import java.util.* ; 
public class ques03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
       
        System.out.print("Enter first number : ") ; 
        int num1 = sc.nextInt(); 

        System.out.print("Enter first number : ") ; 
        int num2 = sc.nextInt(); 
        
        int div = num1/num2 ; 
        
        System.out.print(num1 + "/" + num2 + "   =   " + div) ; 
        

        return ; 
    } 
}

// 3. Write a Java program to divide two numbers and print them on the screen.
// Test Data :
// 50/3
// Expected Output :
// 16