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
public class patient extends user {
    
    public patient(String PName, address PAddress, int PAge, String PGender, passwordGenerator PPassWord) {
        super(PName, PAddress, PAge, PGender, PPassWord);
    }

    
}
