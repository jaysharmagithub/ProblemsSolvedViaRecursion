import java.util.*;

public class NumConvDecToBin {
  public static ArrayList<Integer> converter(int num,ArrayList<Integer> arr) {
    if(num / 2==0)  return new ArrayList<>(0) ;
    
    
    arr.add(num%2);
    converter(num/2,arr);
    return arr;    
  }
  
  public static void main(String args[]){
      int n=15;
     ArrayList<Integer> arr = new ArrayList<>();
      System.out.println(converter(n,arr));
     
  }
}
