package com.datastructure;

import java.util.*;

public class MapComparingBykey {

   public static void main(String args[]){  
Map<Integer,String> map = new HashMap<>();          
      map.put(100,"Mim");    
      map.put(101,"Nipa");    
      map.put(102,"Sejo");    
      map.entrySet()  
      .stream()  
      .sorted(Map.Entry.comparingByValue())  
      .forEach(System.out::println);  
 }  
}  
