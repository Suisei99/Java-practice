

import java.util.Scanner;

public class P2_9 {

    
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
       System.out.println("Enter v0,v1,and t: ");
       double a,v1,v0,t;
       v0=input.nextDouble();
       v1=input.nextDouble();
       t=input.nextDouble();
       a=(v1-v0)/t;
       System.out.println("The average acceleration is  "+a);
    }

}
