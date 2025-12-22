package OOPS;

public class OOP_1_Class {
    String demo="";
    OOP_1_Class(){
        System.out.println("i did First ");
    }
    final String demoConst ="you Can't Change Me ";

    public static void main(String[] args) {
        System.out.println( new OOP_1_Class().demoConst);

        //creating the Object for accessing the Methods.
        OOP_1_Class oop1Class =new OOP_1_Class();
        oop1Class.method1();

    }

    void  method1 (){

        System.out.println("this demo for Method Example");
    }
}
