package com.triglav.HW_2_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<String> words = new ArrayList<>(randMassWords(rand.nextInt(20-10)+10));
//        repeatsWord(words);
        repeatsWord2(words);
    }

    public static void repeatsWord(List<String> words) {
        Set<String> setWords = new HashSet<>(words);
        for (String setw : setWords){
            int i = 0;
            for (String s : words){
                if (setw.equals(s)){
                    i++;
                }
            }
            System.out.println("Слово: \"" + setw + "\" повторяется " + i + " раз(а)");
        }
        System.out.println();
    }

    public static void repeatsWord2(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : words){
            map.put(i, Collections.frequency(words,i));
        }
//        while(map.entrySet().iterator().hasNext()){
//            System.out.println("Слово: \"" + map.entrySet().iterator().next().getKey() + "\" повторяется " + map.entrySet().iterator().next().getValue() + " раз(а)");
//        }
        map.forEach((key, value) ->
                System.out.println("Слово: \"" + key + "\" повторяется " + value + " раз(а)")
                    );
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("Слово: \"" + entry.getKey() + "\" повторяется " + entry.getValue() + " раз(а)");
//        }
        System.out.println();
    }

    public static List<String> randMassWords(int countWords) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        int randClone = r.nextInt(6-2)+2;  //сколько будет слов-повторов

        List<String> words = new ArrayList<>(countWords);

        for (int i = 0; i < countWords - randClone; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 10; j++){
                int num = r.nextInt(62);
                sb.append(str.charAt(num));
            }
            words.add(sb.toString());
        }

        for (int i = 0; i< randClone; i++){
            words.add(words.get(r.nextInt(countWords - randClone)));
        }
        Collections.shuffle(words);

        System.out.println("Слов в массиве: " + countWords);
        System.out.println("Слов-повторов: " + randClone);
        System.out.println("Получившийся массив:");
        int i = 0;
        for(var s: words){
            System.out.println(++i + " " + s);
        }
        System.out.println();
        return words;
    }
}
