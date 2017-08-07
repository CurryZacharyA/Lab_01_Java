package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Equipment {
    private int equipmentID, equipmentYear, driverID;
    private static int equipmentIDCounter = 0;
    private String vinNumber, make, model, licensePlateNumber, lastUpdatedBy, lastUpdated;
    private double priceAcquired;
    
    public Equipment(){
        equipmentID = ++equipmentIDCounter;
        vinNumber = "";
        make = "";
        model = "";
        equipmentYear = 0;
        priceAcquired = 0.0;
        licensePlateNumber = "";
        driverID = 0;
        lastUpdatedBy = "";
        lastUpdated = "";
    }
    
    //Setter Methods
    public void setID(int equpimentIDPassed){                           //Required - Equipment ID
        this.equipmentID = equpimentIDPassed;
    }
    public void setVinNumber(String vinNumberPassed){                   //Required - Vin Number
        this.vinNumber = vinNumberPassed;
    }
    public void setMake(String makePassed){
        if (makePassed.equals(""))
            this.make = "'NULL'";
        else this.make = makePassed;
    }
    public void setModel(String modelPassed){
        if (modelPassed.equals(""))
            this.model = "'NULL'";
        else this.model = modelPassed;
    }
    public void setDriverID(Object driverIDPassed){                                 //Required - Driver ID
        this.driverID = Integer.parseInt(driverIDPassed.toString());
    }
    public void setEquipmentYear(String equipmentYearPassed){
        if (equipmentYearPassed.equals(""))
            this.equipmentYear = 0;                                                 //assign 0 if textbox empty
        else this.equipmentYear = Integer.parseInt(equipmentYearPassed);            //assign int
    }
    public void setPriceAcquired(String priceAcquiredPassed){
        if (priceAcquiredPassed.equals(""))
            this.priceAcquired = 0;                                                 //assign 0 if textbox empty
        else this.priceAcquired = Double.parseDouble(priceAcquiredPassed);          //assign double
    }
    public void setLicensePlateNumber(String licenseNumberPassed){
        if (licenseNumberPassed.equals(""))
            this.licensePlateNumber = "'NULL'";
        else this.licensePlateNumber = licenseNumberPassed;
    }
    public void setLastUpdatedBy(String lastUpdatedByPassed){
        if (lastUpdatedByPassed.equals(""))
            this.lastUpdatedBy = "'NULL'";
        else this.lastUpdatedBy = lastUpdatedByPassed;
    }
    public void setLastUpdated(String lastUpdatedPassed){
        if (lastUpdatedPassed.equals(""))
            this.lastUpdated = "'NULL'";
        else this.lastUpdated = lastUpdatedPassed;
    }
    
    //Getter Methods
    public Integer getID(){
        return this.equipmentID;
    }
    public String getVinNumber(){
        return this.vinNumber;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public Integer getEquipmentYear(){
        return this.equipmentYear;
    }
    public Double getPriceAcquired(){
        return this.priceAcquired;
    }
    public String getLicensePlateNumber(){
        return this.licensePlateNumber;
    }
    public Integer getDriverID(){
        return this.driverID;
    }
    public String getLastUpdatedBy(){
        return this.lastUpdatedBy;
    }
    public String getLastUpdated(){
        return this.lastUpdated;
    }
   
    public void reset(){
        equipmentID = 0;
        vinNumber = "";
        make = "";
        model = "";
        equipmentYear = 0;
        priceAcquired = 0.0;
        licensePlateNumber = "";
        driverID = 0;
        lastUpdatedBy = "";
        lastUpdated = "";
    }
}
