import java.util.*;
public class Main{
public static void main(String [] args){
  Scanner kbd=new Scanner(System.in);
  int x,y;
   x=kbd.nextInt();
   y=kbd.nextInt();
  if(x>0 && y>0)
    System.out.print("1");
  else if(x<0 && y >0){
    System.out.print("2");
  }
  else if(x<0 &&y<0){
    System.out.print("3");
  }
  else if(x>0 && y<0){
    System.out.print("4");
  }
}
}