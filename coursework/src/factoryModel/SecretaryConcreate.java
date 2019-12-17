/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryModel;

import java.util.ArrayList;

/**
 *
 * @author engsa
 */
public class SecretaryConcreate extends usersConcrete {

    public SecretaryConcreate(String UserID, address Address, String Name, String password) {
        super(UserID, Address, Name, password);
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

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public  void Delete(){
        
    ArrayList<PatientConcrete> Patient =new ArrayList<>();
          
         String ID = reeder.nextLine();
       
   
       for(int i=0 ;i<= Patient.size();i++){
       if(ID== Patient.get(i).getUserID()){
           Patient.remove(i);
           System.out.println("the doctor is removed");
           return;
       }
       }
   }  
}
