import java.util.*;

public class TwoNumsProduct {

  public static int product(int a, int b) {
   if(a<0 || b<0) return -1;
   if(a == 0 || b == 0) return 0;
   if(a==1) return b;
   if(b==1) return a;
   return a>b ? a +product(a,b-1): b+product(b,a-1);
  }
  
  public static void main(String[] args) {
    
        System.out.println(product(20,20));
    
  }
}
