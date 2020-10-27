package com.company.mapSet;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Collections.addAll(names, "Дмитрий", "Дмитрий", "Дмитрий", "Артур", "Артур", "Лев", "Илья", "Василий", "Оксана", "Оксана", "Вел");

        HashMap<String, Integer> mapNames = new HashMap<>();
        HashSet<String> setNames = new HashSet<>();
        for (int i = 0; i < names.size(); i++) {
            int quantity = 0;
            String targetNames = names.get(i);
            for (int j = i; j < names.size(); j++) {
                if (targetNames.equals(names.get(j))) {
                    quantity++;
                    if (i != names.size() - 1 && (targetNames.equals(names.get(j + 1)))) {
                        i = i + 1;
                    }
                }
            }
            for (int j = 0; j < names.size(); j++) {
                mapNames.put(targetNames, quantity);
                if (mapNames.containsValue(1)) {
                    setNames.add(targetNames);
                    mapNames.remove(targetNames);
                }
            }
        }
        System.out.println("<---------------------| ArrayList : |-------------------->");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("<---------------------| HASH : |------------------------->");

        for (Map.Entry<String, Integer> nameAndQuantity : mapNames.entrySet()) {
            System.out.println(nameAndQuantity.getKey() + " -> " + nameAndQuantity.getValue());
        }

        System.out.println("<---------------------| SET : |-------------------------->");
        for (String name : setNames) {
            System.out.println(name);
        }
    }
}
