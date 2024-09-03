import java.util.*;
public class recursion3{
  Scanner sc = new Scanner(System.in);
  int sc1= sc.nextInt();
  
  int num=1;
  public void numbers(){
    if(num==sc1+1)
      return;
    System.out.println(num);
    num++;
    numbers();
  }
  
  public static void main(String args[]){
    recursion3 r1 = new recursion3();
    r1.numbers();
  }
}