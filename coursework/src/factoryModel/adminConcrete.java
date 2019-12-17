/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryModel;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author engsa
 */
public class adminConcrete extends usersConcrete {
    char ID_s='A';
    int ID_d=0000;

    public adminConcrete(String UserID, address Address, String Name, String password ,char ID_S , int ID_d ) {
        super(UserID, Address, Name, password);
        this.ID_s =ID_s;
        this.ID_d =ID_d;
    }

    public char getID_s() {
        return ID_s;
    }

    public void setID_s(char ID_s) {
        this.ID_s = ID_s;
    }

    public int getID_d() {
        return ID_d;
    }

    public void setID_d(int ID_d) {
        this.ID_d = ID_d;
    }
    
    /**delete patient
     *
     */
  
    

 
    
    
    
    /* ctrate doctor*/

    
    
    
    

    /**
     *
     * @param newadmin
     */
 
   
    
      
      

Scanner reeder = new Scanner(System.in);
   
      
   
   public void create() {
           ArrayList<adminConcrete> admin =new ArrayList<>();
           System.out.println("please enter the user number");
           Name=reeder.nextLine();
           UserID=admin.get(admin.size()).getUserID()+1;
          

  }

    /**
     *GETTING ADMIN USER ID 
     */
  
    
   
   

       @Override
       public void view(){
           
       }
       
    /**delet admin
     *
     */
    public  void DeleteAdmin(){
        
    ArrayList<adminConcrete> admin =new ArrayList<>();
          
         String ID = reeder.nextLine();
       
   
       for(int i=0 ;i<= admin.size();i++){
       if(ID== admin.get(i).getUserID()){
           admin.remove(i);
           System.out.println("the admen is removed");
           return;
       }
       
       

   }
}
public  void DeleteDoctor(){
        
    ArrayList<DoctorsConcrete> doctor =new ArrayList<>();
          
         String ID = reeder.nextLine();
       
   
       for(int i=0 ;i<= doctor.size();i++){
       if(ID== doctor.get(i).getUserID()){
           doctor.remove(i);
           System.out.println("the  is removed");
           return;
       }
       
       

   }
}
}
  
 
        
    

    

   
    
    
     
    

