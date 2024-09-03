public class pattern7{
  public static void main(String args[]){
    int count=2;
    for(int i =4;i>=0;i--){
      int left =i;
      int right=i+count;
      for(int j=1;j<=9;j++){
        if(left!=0){
          System.out.print(" ");
          left--;
        }
        else if(j==right){
          while(right<=9){
            System.out.print(" ");
            right++;
            break;
          } 
        }
        else{
          System.out.print("*");
        }
      }
      count=count+2;
      System.out.println();
    }
  }
}