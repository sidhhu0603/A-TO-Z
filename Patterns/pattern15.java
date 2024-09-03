public class pattern15{
  public static void main(String args[]){
    char ch='A';
    
    for(int i=5;i>=1;i--){
      for(char j=ch;j<ch+i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}