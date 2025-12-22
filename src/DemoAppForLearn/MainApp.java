package DemoAppForLearn;

public class MainApp {
    public static void main(String[] args) {

ADUInfoCorpInterFace ADU = new ADUInfoCorpImplement();
        ADUInforCorppEntity ADUData1 = new ADUInforCorppEntity(
                1,
                "Maitheen",
                "Software Developer",
                "Male",
                "Cuddalore"
        );
        ADUInforCorppEntity ADUData2 = new ADUInforCorppEntity(
                2,
                "Kumar",
                "Software Developer",
                "Male",
                "Coimbatore"
        );
        ADUInforCorppEntity ADUData3 = new ADUInforCorppEntity(
                3,
                "Kamesh",
                "Testing Developer",
                "Male",
                "Kumbagonam"
        );
        ADU.StroreAduEmp(ADUData1);
        ADU.StroreAduEmp(ADUData2);
        ADU.StroreAduEmp(ADUData3);
//        ADU.GetAllAduEmpDetails();
        ADU.GetOneAduEmpDetail(1);
        ADU.DeleteOneAduEmpDetail(2);
        ADU.GetOneAduEmpDetail(2);

    }


}
