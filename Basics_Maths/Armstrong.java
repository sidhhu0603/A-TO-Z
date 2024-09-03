public class Armstrong {
  public static void main (String args[]){
    int num = 125;
    int result =0;
    int n= num;

    while(num!=0){
      int temp = num % 10; 
      num = num /10; 
     result = result + temp*temp*temp;
    }
    if(result==n){
     System.out.print("Number is Armstrong");
    }
    else{
    System.out.print("Number is not Armstrong");
    }
  }
}