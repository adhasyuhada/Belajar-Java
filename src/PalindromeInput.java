import java.util.Scanner;

class PalindromeInput{
    public static void main(String args[]){  
     int r,sum=0,temp;    
     Scanner input = new Scanner(System.in); 
     PalindromeInput print = new PalindromeInput();
     int n = input.nextInt();
     temp=n;    
     
     while(n>0){    
      r=n%10;  //getting remainder
      System.out.println(r);
      sum=(sum*10)+r;
      System.out.println(sum);
      n=n/10;    
      System.out.println(n);
     }    
     
     if(temp==sum)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
}  