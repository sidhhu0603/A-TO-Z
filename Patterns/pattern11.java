import java.util.*;
public class pattern11{
  public static void main(String args[]){
    int num;
    for(int i=1;i<=5;i++){
        int star=i;
      if(star%2!=0){
        num=1;
      }
      else{
        num=0;
      }
        for(int j=1;j<=5;j++){
          if(star!=0){
             System.out.print(num);
            if(num==1){
              num=0;
            }
            else{
              num=1;
            }
            star--;
          }
        }
      System.out.println();
    }
  }
}