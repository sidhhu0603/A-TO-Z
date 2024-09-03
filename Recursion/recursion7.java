import java.util.*;

public class recursion7{
  Scanner sc = new Scanner(System.in);
  int sc1= sc.nextInt();

  int prev=0;
  int n =1;
  int sum=0;

  int num=0;

  public void numbers(){
    if(num>sc1){
      return ;
    }
    else{
      System.out.println(prev);
      sum=prev+n;
      prev = n;
      n=sum;
      num++;
    }
    numbers();
  }

  public static void main(String args[]){
    recursion7 r1 = new recursion7();
    r1.numbers();
  }
}