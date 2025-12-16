package Basic;

public class Basic_4_TypeCasting {
    public static void main (String[] args){
//        Java Type Casting
//        Type casting means converting one data type into another. For example, turning an int into a double.
//
//                In Java, there are two main types of casting:
//
//        Widening Casting (automatic) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double
//
//        Narrowing Casting (manual) - converting a larger type to a smaller type size
//        double -> float -> long -> int -> char -> short -> byte

        int exNum= 12;
       double exDouble = exNum;
        exNum = (int)exDouble;
        System.out.println(exNum);
        System.out.println(exDouble);
        char exChar= 'm';
        int exNum2= exChar;
        System.out.println(exNum2);
}}
