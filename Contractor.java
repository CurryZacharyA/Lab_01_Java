package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Contractor 
    extends Person {
    private int contractorID;
    private static int contractorIDCount;
    double fee;

    //Constructor
    public Contractor() {
        //Data Fields
        contractorID = ++contractorIDCount;
        fee = 0;
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
    public Double getFee(){ 
        return this.fee;
    }
}
