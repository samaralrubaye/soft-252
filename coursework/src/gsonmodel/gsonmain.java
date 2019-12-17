/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsonmodel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import factoryModel.DoctorsConcrete;
import factoryModel.PatientConcrete;
import factoryModel.SecretaryConcreate;
import factoryModel.adminConcrete;
import factoryModel.usersConcrete;


/**
 *
 * @author engsa
 */
public class gsonmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson=new Gson();
      
      
      GsonBuilder builder = new GsonBuilder(); 
      builder.setPrettyPrinting(); 
      
      
      // serializing
      gsonfactory<Users> usersAdopterFactory = Runtimeusers.of(usersConcrete.class,
    .registerSubtype(DoctorsConcrete.class, "Doctors")
    .registerSubtype(PatientConcrete.class, "Patient")
    .registerSubtype(SecretaryConcreate.class, "Secretary")
    .registerSubtype(adminConcrete.class, "admin");
Gson gson = new GsonBuilder().registerTypeAdapterFactory(vehicleAdapterFactory).create();     
      
      Gson gson1 = builder.create();
      String Doctorsjson=gson.toJson(new DoctorsConcrete(), usersConcrete.class);
      String patientsjson=gson.toJson(new PatientConcrete(), usersConcrete.class);
      String Secretaryjson=gson.toJson(new SecretaryConcreate(), usersConcrete.class);
      String Adminjson=gson.toJson(new adminConcrete(), usersConcrete.class);
      
      
      // deselealize data
      usersConcrete Doctors =gson.fromJson(Doctorjson, usersConcrete.class);
       usersConcrete Patient =gson.fromJson(patientsjson, usersConcrete.class);
       usersConcrete Secretary =gson.fromJson(Secretaryjson, usersConcrete.class);
       usersConcrete Admin =gson.fromJson(Adminjson, usersConcrete.class);
       
       
      
      
      
      
      
   } 
    
    

