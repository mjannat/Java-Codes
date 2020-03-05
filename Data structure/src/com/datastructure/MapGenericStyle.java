package com.datastructure;

import java.util.*;

public class MapGenericStyle {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Shampa");
        map.put(201, "Sharmin");
        map.put(310, "Raka");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
