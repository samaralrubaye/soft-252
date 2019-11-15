/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVAmodel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static java.util.stream.IntStream.builder;

/**
 *
 * @author engsa
 */
public class gson {
    GsonBuilder builder = new GsonBuilder(); 
    //  builder.setPrettyPrinting(); 
      
      Gson gson = builder.create(); 
}
