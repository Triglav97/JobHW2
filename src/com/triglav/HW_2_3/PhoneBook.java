package com.triglav.HW_2_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private Map<String, String> phoneBook;
    private static final String reg = "^(\\+)(\\d{1})(\\(\\d{3}\\))(\\d{3}-\\d{2}-\\d{2}$)";

    PhoneBook(){
        phoneBook = new HashMap<>();
    }

    private void ValidPhone(String number) throws MyValidE {
        Pattern pattern = Pattern.compile (reg);
        Matcher matcher = pattern.matcher(number);
        if (!matcher.find()){
            throw new MyValidE("не верный формат номера телефона");
        }
    }

    public void add(String number, String name){
        try {
            ValidPhone(number);
            phoneBook.put(number, name);
        } catch (MyValidE e) {
            System.out.println(name + " " + e.getMessage());
        }
    }

    public void get(String name) {
        if (phoneBook.containsValue(name)) {
            Set<Map.Entry<String, String>> set = phoneBook.entrySet();
            for (Map.Entry<String, String> me : set) {
                if (me.getValue().equals(name)) {
                    System.out.println(me.getValue() + " " + me.getKey());
                }
            }
        } else {
            System.out.println("Имя " + name + " не найдено в тел. Книге");
        }
    }
}
