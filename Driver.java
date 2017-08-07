package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Driver
  extends Person {
    private int driverID, contractorID;
    private static int driverIDCount = 0;
    private String dateOfBirth, driverCDL, driverCDLDate, hireDate,
            terminationDate;
    private double salary ;
    
    public Driver(){
        //Data Fields
        driverID = ++driverIDCount;
        salary = 0.0;
        contractorID = 0;
        dateOfBirth = "";
        driverCDL = "";
        driverCDLDate = "";
        hireDate = "";
        terminationDate = "";
    }
    
    //Setter Methods
    public void setDriverID(int driverIDPassed){
        this.driverID = driverIDPassed;
    }
    public void setContractorID(int contractorIDPassed){
        this.contractorID = contractorIDPassed;
    }
    public void setSalary(Double salaryPassed){
        this.salary = salaryPassed;
    }
    public void setDateOfBirth(String dateOfBirthPassed){
        this.dateOfBirth = dateOfBirthPassed;
    }
    public void setCDL(String driverCDLPassed){
        this.driverCDL = driverCDLPassed;
    }
    public void setCDLDate(String driverCDLDatePassed){
        this.driverCDLDate = driverCDLDatePassed;
    }
    public void setHireDate(String hireDatePassed){
        this.hireDate = hireDatePassed;
    }
    public void setTerminationDate(String terminationDatePassed){
        this.terminationDate = terminationDatePassed;
    }
    
    //Getter Methods
    public int getDriverID(){
        return this.driverID;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getContractorID(){
        return this.contractorID;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;   
    }
    public String getCDL(){
        return this.driverCDL;
    }
    public String getCDLDate(){
        return this.driverCDLDate;
    }
    public String getHireDate(){
        return this.hireDate;
    }
    public String getTerminationDate(){
        return this.terminationDate;
    }
    
    public void reset(){
        driverID = 0;
        salary = 0.0;
        contractorID = 0;
        dateOfBirth = null;
        driverCDL = null;
        driverCDLDate = null;
        hireDate = null;
        terminationDate = null;
    }
}
