package hw8;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character of Alphabet");
        Scanner h = new Scanner(System.in);
        ch = h.next().charAt(0);

        if(ch =='a' || ch == 'e'|| ch == 'i'|| ch == 'o' || ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {

                System.out.println("Vowel");
            }else

            System.out.println("Consontant");
    }

    }







