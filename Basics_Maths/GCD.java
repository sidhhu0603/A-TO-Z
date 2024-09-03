public class GCD {
  public static void main (String args[]){
    int n1=20; 
    int n2=15;
    int temp=0;

    for(int i =2;i<Math.min(n1,n2);i++){
      if(n1 % i == 0 && n2 % i == 0){
        temp = i;
      }
    }
    System.out.print(temp);
  }
}
