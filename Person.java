package Lab_01_Java;

/*
Zachary Curry

On my honor, I have neither given nor received any unauthorized assistance on
this academic work
*/

public class Person {
    private int PersonID, HouseNumber;
    private String FirstName, LastName, MiddleInitial, Street, CityCounty, StateAbb,
            CountryAbb, ZipCode, LastUpdatedBy, LastUpdated;
    private Double Fee;
    
    //Constructor
    public Person() {
        //Data Fields
        FirstName = "";
        LastName = "";
        MiddleInitial = "";
        HouseNumber = 0;
        Street = "";
        CityCounty = "";
        StateAbb = "";
        CountryAbb = "";
        ZipCode = "";
        LastUpdatedBy = "";
        LastUpdated = "";
    }
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....?
    
    //Setter Methods
    public void setFirstName(String firstNamePassed){                   //Required - First Name
        this.FirstName = firstNamePassed;
    }
    public void setLastName(String lastNamePassed){                     //Required - Last Name
        this.LastName = lastNamePassed;
    }
    public void setMiddleInitial(String middleInitialPassed){
        if (middleInitialPassed.equals(""))
            this.MiddleInitial = "NULL";
        else this.MiddleInitial = middleInitialPassed;
    }
    public void setHouseNumber (String houseNumberPassed){
        if (houseNumberPassed.equals(""))
            this.HouseNumber = 0;                                       //assign 0 if textbox empty
        else this.HouseNumber = Integer.parseInt(houseNumberPassed);    //assign int
    }
    public void setStreet(String streetPassed){
        if (streetPassed.equals(""))
            this.Street = "NULL";
        else this.Street = streetPassed;
    }
    public void setCityCounty(String cityCountyPassed){
        if (cityCountyPassed.equals(""))
            this.CityCounty = "NULL";
        else this.CityCounty = cityCountyPassed;
    }
    public void setStateAbb(Object stateAbbPassed){
        try{
            this.StateAbb = stateAbbPassed.toString();                  //assign abbrevation to person
        }catch (NullPointerException npe){
            this.StateAbb = "NULL";                                     //assign NULL if empty
        }
    }
    public void setCountryAbb(Object countryAbbPassed){
        try{
            this.CountryAbb = countryAbbPassed.toString();              //assign abbrevation to person
        }catch (NullPointerException npe){
            this.CountryAbb = "NULL";                                   //assign NULL if empty
        }
    }
    public void setZipCode(String zipCodePassed){
        if (zipCodePassed.equals(""))
            this.ZipCode = "NULL";
        else this.ZipCode = zipCodePassed;
    }
    public void setLastUpdatedBy(String lastUpdatedByPassed){
        if (lastUpdatedByPassed.equals(""))
            this.LastUpdatedBy = "NULL";
        else this.LastUpdatedBy = lastUpdatedByPassed;
    }
    public void setLastUpdated(String lastUpdatedPassed){
        if (lastUpdatedPassed.equals(""))
            this.LastUpdated = "NULL";
        else this.LastUpdated = lastUpdatedPassed;
    }
    
    //Getter Methods
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public String getMiddleInitial(){
        return this.MiddleInitial;
    }
    public Integer getHouseNumber(){
        return this.HouseNumber;
    }
    public String getStreet(){
        return this.Street;
    }
    public String getCityCounty(){
        return this.CityCounty;
    }
    public String getStateAbb(){
        return this.StateAbb;
    }
    public String getCountryAbb(){
        return this.CountryAbb;
    }
    public String getZipCode(){
        return this.ZipCode;
    }
    public String getLastUpdatedBy(){
        return this.LastUpdatedBy;
    }
    public String getLastUpdated(){
        return this.LastUpdated;
    }
    
}
