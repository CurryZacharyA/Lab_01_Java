package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work

UPDATED 8/8/17 10:30pm
*/

public class Contractor extends Person {
    private int contractorID;
    private int contractorIDCount = 0;
    private double fee;

    //Constructor
    public Contractor() {
        //Data Fields
        contractorID = 0;
        fee = 0;
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
    public void setContractorID(int contractorIDPassed){        //Required - ContractorID
        this.contractorID = contractorIDPassed;
    }
    public void setFee(String feePassed){
        if (feePassed.equals(""))
            this.fee = 0;                                       //assign 0 if textbox empty
        else this.fee = Integer.parseInt(feePassed);            //assign int
    }
    
    //Getter Methods
    public Integer getContratorID(){
        return this.contractorID;
    }
    public double getFee(){ 
        return this.fee;
    }
}