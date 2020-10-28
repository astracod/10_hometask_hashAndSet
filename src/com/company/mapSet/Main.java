package com.company.mapSet;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Collections.addAll(names, "Илья", "Дмитрий", "Артур", "Артур", "Лев", "Дмитрий", "Василий", "Оксана", "Оксана", "Вел", "Дмитрий");

        HashMap<String, Integer> mapNames = new HashMap<>();
        HashMap<String, Integer> mapNames2 = new HashMap<>();
        HashSet<String> setNames = new HashSet<>();

        for (String name : names) {
            if (mapNames.containsKey(name)) mapNames.put(name, mapNames.get(name) + 1);
            if (!(mapNames.containsKey(name))) mapNames.put(name, 1);
        }

        for (Map.Entry<String, Integer> item : mapNames.entrySet()) {
            if (item.getValue() == 1) setNames.add(item.getKey());
            if (item.getValue() >= 2) mapNames2.put(item.getKey(), item.getValue());
        }


        System.out.println("<---------------------| ArrayList : |-------------------->");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("<---------------------| HASH : |------------------------->");
        for (Map.Entry<String, Integer> nameAndQuantity : mapNames2.entrySet()) {
            System.out.println(nameAndQuantity.getKey() + " -> " + nameAndQuantity.getValue());
        }

        System.out.println("<---------------------| SET : |-------------------------->");
        for (String name : setNames) {
            System.out.println(name);
        }
    }
}