package org.example;

import java.util.*;

public class ExercisesGenericsBoundedTypes {

    public static <N extends Number>  boolean compareArrays(N[] firstArray, N[] secondArray){
        if(firstArray.length != secondArray.length) return false;

        for(int i = 0; i < firstArray.length; i++)
            if (!firstArray[i].equals(secondArray[i]))
                return false;

        return true;
    }

    public static <N extends Number> Map<String, Double> sumEvenAndOdd(List<N> numberList) {
        HashMap<String, Double> sumEvenAndOddsMap = new HashMap<>();
        sumEvenAndOddsMap.put("Even", 0.0);
        sumEvenAndOddsMap.put("Odd", 0.0);

        Iterator<N> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            N number = iterator.next();
            if (number.intValue() % 2 == 0) {
                sumEvenAndOddsMap.put("Even", sumEvenAndOddsMap.get("Even") + number.doubleValue());
            } else if (number.intValue() % 2 == 1) {
                sumEvenAndOddsMap.put("Odd", sumEvenAndOddsMap.get("Odd") + number.doubleValue());
            }
        }
        return sumEvenAndOddsMap;
    }

    public static Map<String, Double> sumEvenAndOdd01(List<? extends Number> numberList) {
        HashMap<String, Double> sumEvenAndOddsMap = new HashMap<>();
        sumEvenAndOddsMap.put("Even", 0.0);
        sumEvenAndOddsMap.put("Odd", 0.0);

        Iterator<? extends Number> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            Number number = iterator.next();
            if (number.intValue() % 2 == 0) {
                sumEvenAndOddsMap.put("Even", sumEvenAndOddsMap.get("Even") + number.doubleValue());
            } else if (number.intValue() % 2 == 1) {
                sumEvenAndOddsMap.put("Odd", sumEvenAndOddsMap.get("Odd") + number.doubleValue());
            }
        }
        return sumEvenAndOddsMap;
    }

    public static Map<String, Double> sumEvenAndOdd02(List<? super Double> numberList) {
        HashMap<String, Double> sumEvenAndOddsMap = new HashMap<>();
        sumEvenAndOddsMap.put("Even", 0.0);
        sumEvenAndOddsMap.put("Odd", 0.0);

        Iterator<? super Double> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            Number number = (Number) iterator.next();
            if (number.intValue() % 2 == 0) {
                sumEvenAndOddsMap.put("Even", sumEvenAndOddsMap.get("Even") + number.doubleValue());
            } else if (number.intValue() % 2 == 1) {
                sumEvenAndOddsMap.put("Odd", sumEvenAndOddsMap.get("Odd") + number.doubleValue());
            }
        }
        return sumEvenAndOddsMap;
    }
    public static Map<String, Double> sumEvenAndOdd03(List<?> numberList) {
        HashMap<String, Double> sumEvenAndOddsMap = new HashMap<>();
        sumEvenAndOddsMap.put("Even", 0.0);
        sumEvenAndOddsMap.put("Odd", 0.0);

        Iterator<?> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            Number number = (Number) iterator.next();
            if (number.intValue() % 2 == 0) {
                sumEvenAndOddsMap.put("Even", sumEvenAndOddsMap.get("Even") + number.doubleValue());
            } else if (number.intValue() % 2 == 1) {
                sumEvenAndOddsMap.put("Odd", sumEvenAndOddsMap.get("Odd") + number.doubleValue());
            }
        }
        return sumEvenAndOddsMap;
    }



    public static <T extends CharSequence> int findIndex(List<T> charSequencelist, T charSequence){
        for(int i = 0; i < charSequencelist.size(); i++){
            if(charSequencelist.get(i).equals(charSequence))  return i;
        }
        return -1;
    }

    public static  List<CharSequence>  reverseList01(List<? extends CharSequence> charSequencelist){
        List<CharSequence> reverseList = new ArrayList<>();
        for (int i = charSequencelist.size()-1; 0 <= i; i--){
            reverseList.add(charSequencelist.get(i));
        }
        return reverseList;
    }
    public static List<CharSequence>  reverseList02(List<? super String> charSequencelist){
        List<CharSequence> reverseList = new ArrayList<>();
        for (int i = charSequencelist.size()-1; 0 <= i; i--){
            reverseList.add((CharSequence)charSequencelist.get(i));
        }
        return reverseList;
    }
    public static <T extends CharSequence> List<T>  reverseList(List<T> charSequencelist){
        List<T> reverseList = new ArrayList<>();
        for (int i = charSequencelist.size()-1; 0 <= i; i--){
            reverseList.add(charSequencelist.get(i));
        }
        return reverseList;
    }



    public static <T extends CharSequence> List<T> mergeEverySecondElement(List<T> charSequencelist1,List<T> charSequencelist2){
        List<T> combinedList = new ArrayList<>();
        Iterator<T> iterator1 = charSequencelist1.iterator();
        Iterator<T> iterator2 = charSequencelist2.iterator();

        while(iterator1.hasNext() || iterator2.hasNext()){
           if(iterator1.hasNext()) combinedList.add(iterator1.next());
           if(iterator2.hasNext()) combinedList.add(iterator2.next());
        }
        return combinedList;
    }



}
