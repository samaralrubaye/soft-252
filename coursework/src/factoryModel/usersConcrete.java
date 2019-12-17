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
public  class  usersConcrete {
    String UserID;
    address Address;
    String Name;
    String password;

    public usersConcrete(String UserID, address Address, String Name, String password) {
        this.UserID = UserID;
        this.Address = Address;
        this.Name = Name;
        this.password = password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public address getAddress() {
        return Address;
    }

    public void setAddress(address Address) {
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "usersConcrete{" + "UserID=" + UserID + ", Address=" + Address + ", Name=" + Name + ", password=" + password + '}';
    }
    public  void Create (){};
      
    public  void Delete(){};
    public  void view(){};
    
}
  
    
    
    

    

  
    



   
    
    
  
    
    
    

    

  
    



   
    
    
  
    
    
    

    

  
    



   
    
    
  
    
    
    

    

  
    



   
    
    

  

