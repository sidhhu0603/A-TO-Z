
public class Count {
  public static void main(String[] args) {
    int num = 234567;
    int count =0;

    while(num!=0){
     int temp = num % 10; 
     count++;
     num = num / 10;
    }
    System.out.println(count);
  }
}