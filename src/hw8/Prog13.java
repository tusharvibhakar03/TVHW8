package hw8;

public class Prog13 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(25,65));
    }




    public static boolean hasSharedDigit(int numA,int numB){
        if((numA<10||numA>99)||(numB<10||numB>99)){
            return false;
        }
        int realNumB=numB;
        while(numA>0){
            int numADig=numA%10;
            while(numB>0){
                int numBDig=numB%10;
                if(numADig==numBDig){
                    return true;
                }
                numB=numB/10;
            }
            numA=numA/10;
            numB=realNumB;
        }
        return false;
    }
}


