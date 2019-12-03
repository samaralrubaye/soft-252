/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVAmodel;
import java.lang.*;
/**
 *
 * @author engsa
 */
public class usesrFactory {
    public user getuser(String userType)
    {
        if(userType==null)
     
        return null;
    
        else if (userType.equalsIgnoreCase("DOCTOR")){
            return new Doctors();
                    }
        else if(userType.equalsIgnoreCase("SECRITARY")){
            return new secritarys();
      
                }
        else if(userType.equalsIgnoreCase("ADMIN")){
            return new admins();
        }
        else if(userType.equalsIgnoreCase("PATIENT")){
            return new patients();
        }
    return null;
    }

    
    }
  

