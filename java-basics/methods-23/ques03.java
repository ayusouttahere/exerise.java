public class ques03 {

    public static String findMiddleChar(String test){
        int size = test.length() ; 
        int length ; 
        int middle ; 

        if(size%2 == 0 ){ // for even
            middle = test.length()/2-1 ; 
            length = 2 ; 

        }else{ //for odd 
            middle = test.length()/2-1  ; 
            length = 1 ;  
        }
        
        return test.substring(middle, middle+length) ; 
        

    }

    public static void main(String args[]){
        String newStr = findMiddleChar("Ayush") ; 
        System.out.print(newStr) ; 

    }   
}

// 3. Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd there will be two middle characters.
// b) If the length of the string is even there will be one middle character.
// Test Data:
// Input a string: 350
// Expected Output:

                                                                          
// The middle character in the string: 5