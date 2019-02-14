package com.cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_6");
        System.out.println("Task_1");
        String[] stringArray = {"bob+bob@gmail.com", "bob.bob+bu@gmail.com", "test+rec@gmail.yandex.com", "buka.buka+bubu@yahoo.com", "bob.bob+ka@gmail.com"};
        System.out.println(Arrays.toString(stringArray));
        System.out.println("Quantity of unique emails is " + numUniqueEmails(stringArray));
        System.out.println("Task_2");
        String[] morseString = {"buka", "bubu", "test", "aaa", "hay", "hay"};
        System.out.println("Quantity of unique Morse`s codes is " + uniqueMorseCode(morseString));
    }

    private static int numUniqueEmails(String[] emails) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].contains(".")) {
                emails[i] = emails[i].replace(".", "");
            }
            if (emails[i].contains("+")) {
                emails[i] = emails[i].replace(emails[i].substring(emails[i].indexOf("+"), emails[i].indexOf("@")), "");
            }
        }
        System.out.println(Arrays.toString(emails));
        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(Arrays.asList(emails));
        System.out.println(stringSet);
        return stringSet.size();
    }

    private static int uniqueMorseCode(String[] morse) {
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put("a", ".-");
        morseMap.put("b", "-...");
        morseMap.put("c", "-.-.");
        morseMap.put("d", "-..");
        morseMap.put("e", ".");
        morseMap.put("f", "..-.");
        morseMap.put("g", "--.");
        morseMap.put("h", "....");
        morseMap.put("i", "..");
        morseMap.put("j", ".---");
        morseMap.put("k", "-.-");
        morseMap.put("l", ".-..");
        morseMap.put("m", "--");
        morseMap.put("n", "-.");
        morseMap.put("o", "---");
        morseMap.put("p", ".--.");
        morseMap.put("q", "--.-");
        morseMap.put("r", ".-.");
        morseMap.put("s", "...");
        morseMap.put("t", "-");
        morseMap.put("u", "..-");
        morseMap.put("v", "...-");
        morseMap.put("w", ".--");
        morseMap.put("x", "-..-");
        morseMap.put("y", "-.--");
        morseMap.put("z", "--..");
        System.out.println(Arrays.toString(morse));
        for (int i = 0; i < morse.length; i++) {
            for (int j = 0; j < morse[i].length(); j++) {
                String morseString = morse[i].substring(j, j + 1);
                if (morseMap.containsKey(morseString)) {
                    morse[i] = morse[i].replace(morseString, morseMap.get(morseString));
                }
            }
        }
        System.out.println(Arrays.toString(morse));
        Set<String> morseSet = new HashSet<>();
        morseSet.addAll(Arrays.asList(morse));
        System.out.println(morseSet);
        return morseSet.size();
    }
}
