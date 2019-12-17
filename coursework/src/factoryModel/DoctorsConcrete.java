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
public class DoctorsConcrete extends usersConcrete {
    String notes;
    medicine medicin;
    
    public DoctorsConcrete( address pAddress, String pName,medicine pmedicine) {
        super( pAddress, pName);
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public medicine getMedicin() {
        return medicin;
    }

    public void setMedicin(medicine medicin) {
        this.medicin = medicin;
    }

    /**
     *
     */
     ArrayList<String> Doctor =new ArrayList<>();
    @Override
   public  void create(ArrayList<String > precicriptin){
         
   }
   
     }
