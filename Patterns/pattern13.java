public class pattern13{
  public static void main(String args[]){
    int count=1;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){      
          System.out.print(count);
        count++;
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}