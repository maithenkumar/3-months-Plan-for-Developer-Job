package OOPS;

public class OOP_3_ThisKeyWord extends  SubClassDemo {
    String demoVar="Maitheen";

    public static void main(String[] args) {
        OOP_3_ThisKeyWord oop3ThisKeyWord = new OOP_3_ThisKeyWord();
    oop3ThisKeyWord.callingAntotherMethod();
        System.out.println();
//        SubClassDemo subClassDemo = new SubClassDemo();
//        subClassDemo.demoMethod();
    }
    String  anotherMethod(){
        String name =this.demoVar;
        demoMethod();

        return  name;
    }
    void callingAntotherMethod(){
        System.out.println( this.anotherMethod());
    }

}
class  SubClassDemo {
      void demoMethod(){
        System.out.println("I am comming from Sub Class ");
    }
}
