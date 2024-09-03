import java.util.*;

public class recursion2{
  Scanner sc = new Scanner(System.in);
  int sc1 =sc.nextInt();
  
  int num=0;
  
  public void print(){
    if(num==sc1)
      return;
    System.out.println("SIDDHANT");
    num++;
    print();
  }
  
  public static void main(String args[]){
    recursion2 r1 = new recursion2();
    r1.print();
  }
}