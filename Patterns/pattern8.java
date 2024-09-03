import java.util.Scanner;  
public class pattern8{
  public static void main(String args[]){
    Scanner num1 = new Scanner(System.in);
    int no= num1.nextInt();
  
    int count=1;
    for(int i=0;i<no;i++){
      int space=i;
      int star =(2*no)-i-count;
      for(int j=1;j<=(2*no-1);j++){
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
      count++;
      System.out.println();
    }
  }
}