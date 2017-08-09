package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work

UPDATED 8/8/17 8:30pm
*/

public class Driver extends Person {
    private int driverID, contractorID;
    private int driverIDCount = 0;
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
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleInitial("");
        this.setHouseNumber(0);
        this.setStreet("");
        this.setCityCounty("");
        this.setStateAbb("");
        this.setCountryAbb("");
        this.setZipCode("");
        this.setLastUpdatedBy("");
        this.setLastUpdated("");
    }
    
    //Setter Methods
    public void setDriverID(int driverIDPassed){                        //Required - DriverID
        this.driverID = driverIDPassed;
    }
    public void setContractorID(Object contractorIDPassed){             //Required - ContractorID
        this.contractorID = Integer.parseInt(contractorIDPassed.toString());
    }
    public void setSalary(String salaryPassed){
        if (salaryPassed.equals(""))
            this.salary = 0;                                            //assign 0 if textbox empty
        else this.salary = Integer.parseInt(salaryPassed);              //assign int
    }
    public void setDateOfBirth(String dateOfBirthPassed){
        if (dateOfBirthPassed.equals(""))
            this.dateOfBirth = "'NULL'";
        else this.dateOfBirth = dateOfBirthPassed;
    }
    public void setCDL(String driverCDLPassed){
        if (driverCDLPassed.equals(""))
            this.driverCDL = "'NULL'";
        else this.driverCDL = driverCDLPassed;
    }
    public void setCDLDate(String driverCDLDatePassed){
        if (driverCDLDatePassed.equals(""))
            this.driverCDLDate = "'NULL'";
        else this.driverCDLDate = driverCDLDatePassed;
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