package hw8;

public class Prog5 {
    public static void main(String[] args) {
        System.out.println("is Pallindrome(12221)should be "+isPalindrome(12221));
        System.out.println("is Pallindrome(707)should be "+isPalindrome(707));
        System.out.println("is Pallindrome(11212)should be "+isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int reverse=0;
        int originalNumber= number;

        while (number!=0){
            int lastDigit=number%10;
            reverse =(reverse*10)+lastDigit;
            number/=10;
        }
        return originalNumber==reverse;

    }

}
