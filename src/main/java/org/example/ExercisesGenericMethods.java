package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExercisesGenericMethods{


    public static <T> void printArray(T[] array){

        if(array == null){
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for(int i = 0; i < array.length;i++){
            if(i==array.length-1){
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
    }

    public static Character[] generateCharacters(){
        Random random = new Random();
        Character[] randomCharacters = new Character[random.nextInt(0,128)];
        for(int i = 0; i < randomCharacters.length; i++){
            randomCharacters[i] = (char)random.nextInt(32,128);
        }
        return randomCharacters;
    }

    public static Integer[] generateIntegers(){
        Random random = new Random();
        Integer[] randomIntegers = new Integer[random.nextInt(0,100)];
        for(int i = 0; i < randomIntegers.length; i++){
            randomIntegers[i] = random.nextInt(0,100);
        }
        return randomIntegers;
    }



    public static <T> List<T> arrayToList(T[] array){
        if(array == null) return new ArrayList<>();

        List<T> arrayList = new ArrayList<>();
        for(int i = 0; i < array.length;i++){
            arrayList.add(array[i]);
        }

        return arrayList;
    }

    public static <T> T[] swap(T[] array, int firstIndex, int secondIndex) throws NullPointerException {
        if(array == null) throw new NullPointerException("NullPointerException");

        try{
        T[] tempArray = array.clone();
        T temp = array[firstIndex];
        tempArray[firstIndex] = tempArray[secondIndex];
        tempArray[secondIndex] = temp;
        return tempArray;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Please check an instance of array or indices");
            return array;
        }
    }

}
