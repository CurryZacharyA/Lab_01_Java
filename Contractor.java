package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Contractor 
    extends Person {
    int ContractorID;
    double Fee;

    //Constructor
    public Contractor() {
        //Data Fields
        ContractorID = 0;
        Fee = 0;
    }
    
    //Setter Methods
    public void setContractorID(int i){
        this.ContractorID = i;
    }
    public void setFee(Double d){
        this.Fee = d;
    }
    
    //Getter Methods
    public Integer getContratorID(){
        return this.ContractorID;
    }
    public Double getFee(){ 
        return this.Fee;
    }
}
