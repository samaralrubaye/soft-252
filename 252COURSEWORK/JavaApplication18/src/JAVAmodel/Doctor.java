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
public class Doctor extends user {
    medicine Medicine;
    String notes;

    public Doctor(String PName, address PAddress, int PAge, String PGender, passwordGenerator PPassWord , medicine Pmedicine, String Pnotes) {
        super(PName, PAddress, PAge, PGender, PPassWord );
        Medicine=Pmedicine;
        notes=Pnotes;
        
    }
    public void setMedicine(medicine Pmedicine)
    {
    Medicine=Pmedicine;
    }
    public medicine getMedicine(){
        return Medicine;
        
    }
    public void setnotes(String Pnotes){
        notes =Pnotes;
    }
    public String getnotes(){
   return notes;
    }
    public void writenotes(){};
    public void writeprecicription(){};
    public void view(){}
   
        
    
}
