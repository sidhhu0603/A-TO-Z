public class Palindrome {
  public static void main(String args[]){
    int num = 12345;
    int result =0;
    int n = num;

    while(num !=0){
      int temp = num % 10; 
      num = num / 10; 
      result = result*10+temp;
    }
    if(result==n){
      System.out.print("Number is Palindrome");
    }
    else{
      System.out.print("Number is not Palindrome");
    }
  }
}