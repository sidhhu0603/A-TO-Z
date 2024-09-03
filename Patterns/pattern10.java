import java.util.*;
public class pattern10{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    
    for(int i =1;i<=(2*num-1);i++){
      int star=(i<=num)?i:(2*num-i);
      for(int j=1;j<=num;j++){
        if(star!=0){
          System.out.print("*");
          star--;
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}