public class recursion1{

  int count=0;

  public void print(){
    if(count==3)
      return;
    System.out.println("SIDDHANT");
    count++;
    print();
  }
  
  public static void main(String args[]){

    recursion1 r1 = new recursion1();
    r1.print();
  }
}