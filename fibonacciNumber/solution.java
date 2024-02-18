public class main{
  public static void main(String []args){
    int n=5;
    System.out.print(print(n));
  }
  static int print(int n){
    if(n<=1) return n;
    int last=print(n-1);
    int slast=print(n-2);
    return last+slast;
  }
}
