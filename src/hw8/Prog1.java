package hw8;

import java.util.Scanner;

public class Prog1 {


    public static void  main(String[] args) {
        Scanner h= new Scanner(System.in);
        int count =1; int sum=0;
        while(count<10) {
            System.out.println("Enter numbers *" + count);
          boolean vaildateNumber=h.hasNext();
           if (vaildateNumber){
               int Number =h.nextInt();
               sum+= Number;
               count++;

           }else{
               System.out.println("Invalid Number");
           }
           h.nextLine();
        }
        System.out.println("Sum of all numbers"+sum);
        h.close();
    }


}
