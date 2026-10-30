import java.util.*;

public class Main {
    public static void main(String[] args) {
     int[] arr={6,1,0,2,9,5,6,3,7,4};
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

        
      
      