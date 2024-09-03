import java.util.Scanner;

public class Prime {
  public static void main (String args[]){
    
    Scanner Sc = new Scanner(System.in);
    int num = Sc.nextInt();
    int count =0;
    
    for(int i =2;i<num;i++){
      if(num % 1 ==0 && num % num == 0 && num % i != 0){
        count++; 
      }
    }
    if(count == num -2){
      System.out.print("number is prime");
    }
    else{
      System.out.print("number is not prime");
    }
  }
}