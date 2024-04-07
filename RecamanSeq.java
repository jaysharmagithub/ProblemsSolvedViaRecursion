import java.util.*;

public class RecamanSeq{
  public static void seqGen(int num,int index, int [] arr){
    if(index >= num) return ;
    if(index==0) {
      arr[index] =  0;
   }else {
      int prev = arr[index-1];
      int next = prev-index;
      if(next >=0 && !contains(num-prev,arr,index)){
         arr[index]=next;
      }else arr[index]=prev+index;
    }
    seqGen(num,index+1,arr);
  }
      public static boolean contains(int v, int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == v) {
                return true;
            }
        }
        return false;
    }
      public static void main(String[] args) {
        int n = 100; // Length of the sequence
        int[] arr = new int[n];
        seqGen(n, 0,arr);
        System.out.print(Arrays.toString(arr));
    }}
