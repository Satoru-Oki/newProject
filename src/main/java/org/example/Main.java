package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> customerMap = new HashMap<>();
        customerMap.put("name", "大和");
        customerMap.put("age", "35");
        customerMap.put("birthPlace", "福岡県");
        
        System.out.println(customerMap);
        for (Map.Entry<String, String> customerInfo : customerMap.entrySet()) {
            System.out.println(customerInfo);
        }
        System.out.println(customerMap.get(0).length()); //Mapにindexが無いので値はnullとなり長さを戻せない
    }
}

