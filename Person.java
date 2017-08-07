package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Person {
    private int personID = 0, houseNumber;
    private String firstName, lastName, middleInitial, street, cityCounty, stateAbb,
            countryAbb, zipCode, lastUpdatedBy, lastUpdated;
    
    //Constructor
    public Person() {
        //Data Fields
        personID = ++personID;
        firstName = "";
        lastName = "";
        middleInitial = "";
        houseNumber = 0;
        street = "";
        cityCounty = "";
        stateAbb = "";
        countryAbb = "";
        zipCode = "";
        lastUpdatedBy = "";
        lastUpdated = "";
    }
    
    //Setter Methods
    public void setFirstName(String firstNamePassed){                   //Required - First Name
        this.firstName = firstNamePassed;
    }
    public void setLastName(String lastNamePassed){                     //Required - Last Name
        this.lastName = lastNamePassed;
    }
    public void setMiddleInitial(String middleInitialPassed){
        if (middleInitialPassed.equals(""))
            this.middleInitial = "NULL";
        else this.middleInitial = middleInitialPassed;
    }
    public void setHouseNumber (String houseNumberPassed){
        if (houseNumberPassed.equals(""))
            this.houseNumber = 0;                                       //assign 0 if textbox empty
        else this.houseNumber = Integer.parseInt(houseNumberPassed);    //assign int
    }
    public void setStreet(String streetPassed){
        if (streetPassed.equals(""))
            this.street = "NULL";
        else this.street = streetPassed;
    }
    public void setCityCounty(String cityCountyPassed){
        if (cityCountyPassed.equals(""))
            this.cityCounty = "NULL";
        else this.cityCounty = cityCountyPassed;
    }
    public void setStateAbb(Object stateAbbPassed){
        try{
            this.stateAbb = stateAbbPassed.toString();                  //assign abbrevation to person
        }catch (NullPointerException npe){
            this.stateAbb = "NULL";                                     //assign NULL if empty
        }
    }
    public void setCountryAbb(Object countryAbbPassed){
        try{
            this.countryAbb = countryAbbPassed.toString();              //assign abbrevation to person
        }catch (NullPointerException npe){
            this.countryAbb = "NULL";                                   //assign NULL if empty
        }
    }
    public void setZipCode(String zipCodePassed){
        if (zipCodePassed.equals(""))
            this.zipCode = "NULL";
        else this.zipCode = zipCodePassed;
    }
    public void setLastUpdatedBy(String lastUpdatedByPassed){
        if (lastUpdatedByPassed.equals(""))
            this.lastUpdatedBy = "NULL";
        else this.lastUpdatedBy = lastUpdatedByPassed;
    }
    public void setLastUpdated(String lastUpdatedPassed){
        if (lastUpdatedPassed.equals(""))
            this.lastUpdated = "NULL";
        else this.lastUpdated = lastUpdatedPassed;
    }
    
    //Getter Methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMiddleInitial(){
        return this.middleInitial;
    }
    public Integer getHouseNumber(){
        return this.houseNumber;
    }
    public String getStreet(){
        return this.street;
    }
    public String getCityCounty(){
        return this.cityCounty;
    }
    public String getStateAbb(){
        return this.stateAbb;
    }
    public String getCountryAbb(){
        return this.countryAbb;
    }
    public String getZipCode(){
        return this.zipCode;
    }
    public String getLastUpdatedBy(){
        return this.lastUpdatedBy;
    }
    public String getLastUpdated(){
        return this.lastUpdated;
    }
}