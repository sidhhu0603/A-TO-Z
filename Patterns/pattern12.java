import java.util.*;
public class pattern12{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();

    int space=2*num-2;
    for(int i=1;i<=num;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      for(int q=1;q<=space;q++){
          System.out.print(" ");
      }
      for(int j=i;j>0;j--){
        System.out.print(j);
      }
      space=space-2;
      System.out.println();
    }
  }
}