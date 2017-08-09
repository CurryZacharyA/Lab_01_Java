package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Person {
    private int personID, houseNumber;
    private int personIDCounter = 0;
    private String firstName, lastName, middleInitial, street, cityCounty, stateAbb,
            countryAbb, zipCode, lastUpdatedBy, lastUpdated;
    
    //Constructor
    public Person() {
        //Data Fields
        personID = ++personIDCounter;
        firstName = "a";
        lastName = "b";
        middleInitial = "c";
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
        this.middleInitial = middleInitialPassed;
    }
    public void setHouseNumber (String houseNumberPassed){          //String input
        this.houseNumber = Integer.parseInt(houseNumberPassed);
    }
    public void setHouseNumber (int houseNumberPassed){             //int input
        this.houseNumber = houseNumberPassed;
    }
    public void setStreet(String streetPassed){
        this.street = streetPassed;
    }
    public void setCityCounty(String cityCountyPassed){
        this.cityCounty = cityCountyPassed;
    }
    public void setStateAbb(Object stateAbbPassed){
        try{
            this.stateAbb = stateAbbPassed.toString();                  //assign abbrevation to person
        }catch (NullPointerException npe){
            this.stateAbb = "'NULL'";                                     //assign 'NULL' if empty
        }
    }
    public void setCountryAbb(Object countryAbbPassed){
        try{
            this.countryAbb = countryAbbPassed.toString();              //assign abbrevation to person
        }catch (NullPointerException npe){
            this.countryAbb = "'NULL'";                                   //assign 'NULL' if empty
        }
    }
    public void setZipCode(String zipCodePassed){
        this.zipCode = zipCodePassed;
    }
    public void setLastUpdatedBy(String lastUpdatedByPassed){
        this.lastUpdatedBy = lastUpdatedByPassed;
    }
    public void setLastUpdated(String lastUpdatedPassed){
        this.lastUpdated = lastUpdatedPassed;
    }
    
    //Getter Methods
    public Person getPerson(){
        return this;
    }
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