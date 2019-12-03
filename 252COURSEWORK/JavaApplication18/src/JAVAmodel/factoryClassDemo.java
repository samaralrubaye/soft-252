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
public class factoryClassDemo {

    
     
    public static void main(String[] args) {
   
    }
    usesrFactory userFactory=new usesrFactory();
    user user1=userFactory.getuser("Doctor");
    user1.view();
    
}
