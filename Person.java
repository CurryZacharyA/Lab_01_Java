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
        FirstName = null;
        LastName = null;
        MiddleInitial = null;
        HouseNumber = 0;
        Street = null;
        CityCounty = null;
        StateAbb = null;
        CountryAbb = null;
        ZipCode = null;
        LastUpdatedBy = null;
        LastUpdated = null;
    }
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....
    //Create Overload methods....
    
    //Setter Methods
    public void setFirstName(String firstNamePassed){
        this.FirstName = firstNamePassed;
    }
    public void setLastName(String lastNamePassed){
        this.LastName = lastNamePassed;
    }
    public void setMiddleInitial(String middleInitialPassed){
        this.MiddleInitial = middleInitialPassed;
    }
    public void setHouseNumber(int houseNumberPassed){
        this.HouseNumber = houseNumberPassed;
    }
    public void setStreet(String streetPassed){
        this.Street = streetPassed;
    }
    public void setCityCounty(String cityCountyPassed){
        this.CityCounty = cityCountyPassed;
    }
    public void setStateAbb(String stateAbbPassed){
        this.StateAbb = stateAbbPassed;
    }
    public void setCountryAbb(String countryAbbPassed){
        this.CountryAbb = countryAbbPassed;
    }
    public void setZipCode(String zipCodePassed){
        this.ZipCode = zipCodePassed;
    }
    public void setLastUpdatedBy(String lastUpdatedByPassed){
        this.LastUpdatedBy = lastUpdatedByPassed;
    }
    public void setLastUpdated(String lastUpdatedPassed){
        this.LastUpdated = lastUpdatedPassed;
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
