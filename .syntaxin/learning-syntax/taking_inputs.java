package Basics;
import java.util.* ;
public class taking_inputs {
    public static void main(String args[]){
    // smth we must write to take inputs. 
      Scanner scan_var = new Scanner(System.in) ; 
        
    // declaring variable to stro input values inside.  
      // String string_input = scan_var.nextLine() ; // this will ignore all the characters after blank space.  
        
    // output 
      // System.out.println(string_input);    
   
    // takin longer input 
      String longstr = scan_var.nextLine();  
      System.out.println(longstr) ; 

   }
}
