/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVAmodel;

/**
 *
 * @author engsa
 */
public class userMake {
    public  user Doctor;
    private user secritary;
    private user patient;
    private user admin;
    
    public userMake(){
     Doctor=new Doctor();
     secritary=new  secritary();
     patient=new patient();
     admin=new admin();    
    }
    public void viewDoctor(){
        Doctor.view(){};
        
    }
    public void userSecritary(){
        
    }
    public void userAdmin(){
        
    }
    public void userpatient(){
        
    }
}
