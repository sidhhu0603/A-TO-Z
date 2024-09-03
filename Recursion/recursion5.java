import java.util.*;

public class recursion5{
  Scanner sc = new Scanner(System.in);
  int sc1= sc.nextInt();

  int num=1;
  int sum=0;

  public void numbers(){
    if(num>sc1){
      return ;
    }
    else{
      sum=sum+num;
      num++;
    }
    System.out.println(sum);
    numbers();
  }

  public static void main(String args[]){
    recursion5 r1 = new recursion5();
    r1.numbers();
  }
}