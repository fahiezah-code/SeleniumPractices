package javaexercises;

public class AddressMutableClass {

    private String city;
    private String zip;

    public AddressMutableClass(){

    }
    public AddressMutableClass(String city, String zip){
        this.city = city;
        this.zip = zip;
    }

    public void setCity(String ct){
        this.city = ct;
    }
    public void setZip(String zp){
        this.zip = zp;
    }
    public String getCity(){
        return city;
    }


    @Override
    public String toString() {
        return "AddressMutableClass{" +
                "city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public String getZip(){
        return zip;
    }




}
