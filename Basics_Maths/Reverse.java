public class Reverse {
  public static void main (String args[]){
    int num =12345;
    int result =0;

    while(num!=0){
      int temp = num % 10; 
      num = num /10; 
      result = result*10+temp;
    }
    System.out.print(result);
  }
}