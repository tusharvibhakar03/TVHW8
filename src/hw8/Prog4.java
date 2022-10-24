package hw8;

public class Prog4 {

    public static void main(String[] args) {
        // should be value 1+2+5=8
        System.out.println("Sum of 125 is="+sumDigits(125));
       // Should return 12 => 9 + 2 + 1 = 12
        System.out.println("Sum of 921 is = " + sumDigits(921));
        // Should return 12 => 4 + 8 = 12
        System.out.println("Sum of 98 is = " + sumDigits(98));
        // Should return -1
        System.out.println("Sum of -3 is = " + sumDigits(-3));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sumDigits = 0;
        // for converting number to sting
        String numberToString = Integer.toString(number);
        for (char c : numberToString.toCharArray()) {
            // for converting char to number
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
}





