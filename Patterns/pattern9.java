import java.util.*;
public class pattern9 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();

    
    int count=0;
    int temp=0;
    int counter=1;
    for(int i=1;i<=num1;i++){
      int space = (i<=num1/2) ? ((num1/2)-i) : count;
      int star = (i<=num1/2) ? (i+temp) : (num1 - counter);
      for(int j=1;j<=num1-1;j++){
        if(space!=0){
          System.out.print(" ");
          space--;
        }
        else if(star!=0){
          System.out.print("*");
          star--;
        }
        else{
          System.out.print(" ");
        }
      }
      temp++;
      if(i>num1/2){
        count++;
        counter= counter+2;
      }
      System.out.println();
    }
  }
}