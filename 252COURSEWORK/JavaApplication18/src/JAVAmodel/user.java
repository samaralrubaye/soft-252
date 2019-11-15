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
public class user {
    public  String Name;
   public  address Address;
   public  int Age;
   public String Gender;
   public passwordGenerator PassWord;

    
    user(String PName,address PAddress,int PAge ,String PGender,passwordGenerator PPassWord){
        Name=PName;
        Address=PAddress;
        Age=PAge;
        Gender=PGender;
        PassWord=PPassWord;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public address getAddress() {
        return Address;
    }

    public void setAddress(address Address) {
        this.Address = Address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public passwordGenerator getPassWord() {
        return PassWord;
    }

    public void setPassWord(passwordGenerator PassWord) {
        this.PassWord = PassWord;
    }
    public void view(){}
    public void create(){}
    public void add(){}
    public  void remove(){}
    public void login(){}
   
   
}
