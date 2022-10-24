package hw8;

import java.util.Scanner;

public class Prog6 {

    public static void main(String[] args) {

        int i,j,n;
        System.out.print("input number of rows");

        Scanner h=new Scanner(System.in);
            n=h.nextInt();

            for(i=1;i<n;i++)
            {
                for(j=1;j<i;j++)
                    System.out.print(j);
                System.out.println("");
            }

    }
}
