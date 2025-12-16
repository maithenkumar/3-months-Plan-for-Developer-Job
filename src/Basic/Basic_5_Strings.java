package Basic;

public class Basic_5_Strings {
    public static void main(String[] args) {
        String greeting = "Welcome Maitheen";
        System.out.println("Orginal Word - "+  greeting);
        System.out.println("Length OF Greeting VAR - " + greeting.length() );
        System.out.println("Uppercase OF Greeting VAR - " + greeting.toUpperCase() );
        System.out.println("LowerCase OF Greeting VAR - " + greeting.toLowerCase() );
        System.out.println("Index OF Greeting VAR - " + greeting.indexOf("Maitheen") );
        System.out.println("Char  OF Greeting VAR - " + greeting.charAt(0) );
//        The trim() method removes whitespace from the beginning and the end of a string:
        System.out.println("trim  OF Greeting VAR - " + greeting.trim() );
//        To compare two strings, you can use the equals() method:
        System.out.println("equal  OF Greeting VAR - " + greeting.equals("Maitheen") );



    }
}
