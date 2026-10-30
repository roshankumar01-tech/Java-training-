import java.util.*;
public class Main2{
public static void main(String[] args){
int mark[]=new int[5];
Scanner scan=new Scanner(System.in);
for(int i=0;i<mark.length;i++){
System.out.println("enter the "+i+" index:");
mark[i]=scan.nextInt();
}
System.out.println(Arrays.toString(mark));
}
}


