package Basic;

public class Basic_8_SwitchStatements {
    public static void main(String[] args) {
       exForSwitchStatements(9);

    }
static     void exForSwitchStatements (int num){
        switch (num){

            case 1:
                System.out.println("You entered " + num);
                break;
            case 2:
                System.out.println("You entered " + num);
                break;
            case 3:
                System.out.println("You entered " + num);
                break;
            case 4:
                System.out.println("You entered " + num);
                break;
            default:
                System.out.println("You entered  Others");
        }
    }
}
