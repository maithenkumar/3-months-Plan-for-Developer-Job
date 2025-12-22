package DemoAppForLearn;

public  class ADUInfoCorpImplement implements  ADUInfoCorpInterFace{
   ADUInforCorppEntity [] allAduEmpData=new ADUInforCorppEntity[100];
//   ADUInforCorppEntity aduEmp;
  static  int index=0;
    public String StroreAduEmp(ADUInforCorppEntity aduEmp

    ) {

        if(aduEmp != null ){
          if (allAduEmpData[aduEmp.getEmpID()] ==null){
              allAduEmpData[index++] = aduEmp;

              System.out.println( "This\t" + aduEmp.getEmpID()+ "\tEmployee Stored Successfully ");

          }else {
              System.out.println( "This\t" + aduEmp.getEmpID()+ "\tEmployee Already Exists ");

          }
        }else {
            System.out.println("Please Enter The Employee details");
        }

return "";
    }

    @Override
    public String GetAllAduEmpDetails() {
        String Result="";
        if (allAduEmpData.length == 0 )
            return "Employee Data has Empty";
            System.out.println("=====================================================");
        System.out.println("Here All Employee Details \n");

        for (int i = 0; i <allAduEmpData.length ; i++) {
            if (allAduEmpData[i]!= null){
                System.out.println("=====================================================");
                System.out.println("EmployeeID :"+ allAduEmpData[i].getEmpID() +"\n");
                System.out.println("EmployeeName :"+ allAduEmpData[i].getEmpName() +"\n");
                System.out.println("EmployeeRole :"+ allAduEmpData[i].getEmpRole() +"\n");
                System.out.println("EmployeeCity :"+ allAduEmpData[i].getCity() +"\n");
                System.out.println("EmployeeGender :"+ allAduEmpData[i].getGender() +"\n");
                System.out.println("=====================================================");

            }


        }
//        return "=====================================================";
return "Have you seen the Data ?";

    }

    @Override
    public String GetOneAduEmpDetail(int ADUEmpID) {

    if (allAduEmpData[ADUEmpID] != null){
        System.out.println("=====================================================");
        System.out.println("EmployeeID :"+ allAduEmpData[ADUEmpID].getEmpID() +"\n");
        System.out.println("EmployeeName :"+ allAduEmpData[ADUEmpID].getEmpName() +"\n");
        System.out.println("EmployeeRole :"+ allAduEmpData[ADUEmpID].getEmpRole() +"\n");
        System.out.println("EmployeeCity :"+ allAduEmpData[ADUEmpID].getCity() +"\n");
        System.out.println("EmployeeGender :"+ allAduEmpData[ADUEmpID].getGender() +"\n");
        System.out.println("=====================================================");

    }else {
        System.out.println("Employee Does not Exist");
    }


        return "";
    }

    @Override
    public String DeleteOneAduEmpDetail(int ADUEmpID) {
        if (allAduEmpData[ADUEmpID] != null){
            allAduEmpData[ADUEmpID] =null;
            System.out.println("Employee has Deleted");
        }else{
            System.out.println("Employee Does not Exist");

        }
        return "";
    }

    @Override
    public String UpdateOneAduEmpDetail(ADUInforCorppEntity aduEmp) {
        if (allAduEmpData[aduEmp.getEmpID()] != null){
            allAduEmpData[aduEmp.getEmpID()]   = aduEmp;
        }
        else{
            System.out.println("Employee Does not Exist");

        }

        return "";
    }
}
