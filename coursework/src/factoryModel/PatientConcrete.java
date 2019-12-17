/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryModel;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author engsa
 */
public class PatientConcrete extends usersConcrete {
    int Age;
    String gender;
   
    
   
    

    public PatientConcrete( address pAddress, String pName, int pAge, String pgender ) {
        super( pAddress, pName);
    }

   
    

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //request
    @Override
    public  void create(ArrayList<String > newuser){
         
         
         
     }
    
    public void patientID(){
    char ID_s='p';
    Random r = new Random();
    String randomNumber = String.format("%04d", (Object) r.nextInt(1001));
    System.out.println(ID_s + randomNumber);
    
    
}
         
    
}
