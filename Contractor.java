package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Contractor 
    extends Person {
    int ContractorID;
    double fee;

    //Constructor
    public Contractor() {
        //Data Fields
        ContractorID = 0;
        fee = 0;
    }
    
    //Setter Methods
    public void setContractorID(int contractorIDPassed){
        this.ContractorID = contractorIDPassed;
    }
    public void setFee(String feePassed){
        if (feePassed.equals(""))
            this.fee = 0;                                       //assign 0 if textbox empty
        else this.fee = Integer.parseInt(feePassed);            //assign int
    }
    
    //Getter Methods
    public Integer getContratorID(){
        return this.ContractorID;
    }
    public Double getFee(){ 
        return this.fee;
    }
}
