/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryModel;

/**
 *
 * @author engsa
 */
public class address {
    String firtLineAddress;
    String streetName;
    String postalCode;

public address(String firstLineAddess,String streetName ,String PostalCode){
    this.firtLineAddress = firtLineAddress;
    this.streetName= streetName;
    this.postalCode = postalCode;
    
}

    public String getFirtLineAddress() {
        return firtLineAddress;
    }

    public void setFirtLineAddress(String firtLineAddress) {
        this.firtLineAddress = firtLineAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "address{" + "firtLineAddress=" + firtLineAddress + ", streetName=" + streetName + ", postalCode=" + postalCode + '}';
    }

   
}
  
   
    

