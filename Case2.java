import java.util.*;

public class Main {
    public static void main(String[] args) {
     int[] arr={5,3,-1,2,1,8};
     int missing=1;
     while(true){
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==missing){
          found=true;
          break;
        }
      }
      if(!found){
        System.out.println(missing);
        break;
      }
      missing++;
     }
    }
}

        
      
      