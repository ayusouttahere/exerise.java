import java.util.* ; 
public class ques01 {
    public static int largestAmongThree(int n1, int n2, int n3){
     if(n1 > n2){
        if(n1>n3){
            System.out.print(n1+" is greatest !") ; 
        }else{
            System.out.print(n3+" is greatest !") ; 
        }
        }else{
            if(n2>n3){
                System.out.print(n2+" is greatest !") ; 
            }else{
                System.out.print(n3+" is greatest !") ; 
            }
        }       
        return 0 ; 
    } 

    public static void main(String args[]){
        System.out.print(largestAmongThree(55, 6, 99)); 
    }
}

// 1. Write a Java method to find the smallest nber among three nbers.
// Test Data:
// Input the first nber: 25
// Input the Second nber: 37
// Input the third nber: 29
// Expected Output:

// The smallest value is 25.0