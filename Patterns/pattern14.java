public class pattern14{
  public static void main(String args[]){
    char ch = 'A';
    for(int i =1;i<=5;i++){
      for(char j=ch;j<ch+i;j++){
        System.out.print(j);
      }
      
      System.out.println();
    }
  }
}