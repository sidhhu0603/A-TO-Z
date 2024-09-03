import java.util.*;

public class recursion4{
  Scanner sc = new Scanner(System.in);
  int sc1= sc.nextInt();

  public void numbers(){
    if(sc1==0)
      return;
    System.out.println(sc1);
    sc1--;
    numbers();
  }

  public static void main(String args[]){
    recursion4 r1 = new recursion4();
    r1.numbers();
  }
}