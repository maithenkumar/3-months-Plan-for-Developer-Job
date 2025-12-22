package DemoAppForLearn;

public  interface ADUInfoCorpInterFace {

public  String StroreAduEmp(  ADUInforCorppEntity aduEmp);
//        int EmpID
//        , String EmpName
//        , String EmpRole
//        , String Gender
//        , String City);
public  String GetAllAduEmpDetails();
public  String GetOneAduEmpDetail(int ADUEmpID);
public  String DeleteOneAduEmpDetail(int ADUEmpID);
public  String UpdateOneAduEmpDetail( ADUInforCorppEntity aduEmp);

}
