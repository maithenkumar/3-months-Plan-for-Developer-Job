package Basic;

public class Basic_6_Math {
    public static void main(String[] args) {
//        The Math.max(x,y) method can be used to find the highest value of x and y:
        System.out.println("Max"+Math.max(1,2));
//        The Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println("Min "+ Math.min(1,2));
//        The Math.sqrt(x) method returns the square root of x:
        System.out.println("square root of x "+Math.sqrt(8));
//        The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println("absolute" + Math.abs(-12));
//        The Math.pow(x, y) method returns the value of x raised to the power of y:
//        Note: Math.pow(2, 8) means 2 multiplied by itself 8 times:
//        2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 = 256
//
//        Note: The Math.pow() method always returns a double, even if the result is a whole number. For example, Math.pow(2, 8) returns 256.0 (not 256).
        System.out.println("Power" +Math.pow(2,8));

//        ava has several methods for rounding numbers:
//
//        Math.round(x) - rounds to the nearest integer
//        Math.ceil(x) - rounds up (returns the smallest integer greater than or equal to x)
//        Math.floor(x) - rounds down (returns the largest integer less than or equal to x)


        System.out.println(Math.round(4.6));  // 5
        System.out.println(Math.ceil(4.1));   // 5.0
        System.out.println( Math.floor(4.9));  // 4.0
//        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println("random Num  "+(int)( Math.random() * 101));
    }
}
