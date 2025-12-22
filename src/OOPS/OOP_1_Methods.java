package OOPS;

public class OOP_1_Methods {
    public static void main(String[] args) {
        OOP_1_Methods mainClass = new OOP_1_Methods();
        System.out.println(mainClass.demoMethod1(2,3));
        System.out.println(mainClass.demoMethod2("Maithenkumar"));

    }

    int  demoMethod1 (int num1 , int num2){
        return  num1 + num2;
    }
    String demoMethod2 (String myName){
        return "Hi This is "+ myName;
    }
}
