import java.util.*;

public class recursion6{
  Scanner sc = new Scanner(System.in);
  int sc1= sc.nextInt();

  int num=1;
  int sum=1;

  public void numbers(){
    if(num>sc1){
      return ;
    }
    else{
      sum=sum*num;
      num++;
    }
    System.out.println(sum);
    numbers();
  }

  public static void main(String args[]){
    recursion6 r1 = new recursion6();
    r1.numbers();
  }
}