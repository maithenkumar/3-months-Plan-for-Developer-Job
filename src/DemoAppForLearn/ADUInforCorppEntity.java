package DemoAppForLearn;

public class ADUInforCorppEntity {

    private int EmpID;
    private String EmpName;
    private String EmpRole;
    private String Gender ;
    private String City;
    public ADUInforCorppEntity() {
    }



    public ADUInforCorppEntity(int empID, String empName, String empRole, String gender, String city) {
        EmpID = empID;
        EmpName = empName;
        EmpRole = empRole;
        Gender = gender;
        City = city;
    }


    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpRole() {
        return EmpRole;
    }

    public void setEmpRole(String empRole) {
        EmpRole = empRole;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }



}
