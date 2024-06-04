package org.example;

import org.example.ListProcessor.LisTProcessorImpl;
import org.example.ListProcessor.ListProcessor;
import org.example.ShapeCalculator.RectangleCalculator;
import org.example.ShapeCalculator.ShapeCalculator;
import org.example.ShapeCalculator.SquarerCalculator;
import org.example.ShapeCalculator.TriangleCalculator;

import java.awt.*;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /////////////////////////////////////////////////////////
        ///////// Simple box

        String mėnesioPavadinimas = "Gruodžio";
        SimpleBox<String> stringBox = new SimpleBox<>();
        stringBox.setElementInTheBox(mėnesioPavadinimas);
        System.out.println(stringBox.getElementInTheBox());

        Integer laimingaVerte = 7;
        SimpleBox<Integer> intergerBox = new SimpleBox<>();
        intergerBox.setElementInTheBox(laimingaVerte);
        System.out.println(intergerBox.getElementInTheBox());

        /////////////////////////////////////////////////////////
        // 1.1 Uzduotis: Pair
        System.out.println("*******************************************************");
        System.out.println("1.1 Uzduotis: Pair");
        System.out.println();

        Pair<String, String> manoPair = new Pair<>("Pirma", "Antra");
        System.out.println(manoPair);
        manoPair.setParameters("Trecia","Ketvirta");
        System.out.println(manoPair);
        System.out.println(manoPair.getFirst());
        System.out.println(manoPair.getSecond());

        /////////////////////////////////////////////////////////
        // 1.2 Uzduotis: ListOperations

        System.out.println("*******************************************************");
        System.out.println("1.2 Uzduotis: ListOperations");
        System.out.println();

        ListOperations<String> listOperations = new ListOperations<>();
        listOperations.addElement("Pirmas");
        listOperations.addElement("Antras");
        System.out.println(listOperations);

        listOperations.removeElement(0);
        System.out.println(listOperations);

        listOperations.removeElement(6);

        /////////////////////////////////////////////////////////
        // 1.3 Uzduotis: ListOperations

        System.out.println("*******************************************************");
        System.out.println("1.3 Uzduotis: PairList");
        System.out.println();

        PairList<Integer,String> pairList = new PairList<>();
        pairList.addPair(7,"Mano String");
        pairList.addPair(8,"Man String");
        pairList.addPair(7,"Mano čia");

        System.out.println(pairList.getPairList());
        pairList.removePair(1);
        System.out.println(pairList.getPairList());
        pairList.getPair(4);

        /////////////////////////////////////////////////////////
        // 2.1 Uzduotis: printArray
        System.out.println("*******************************************************");
        System.out.println("2.1 Uzduotis: printArra");
        System.out.println();

        Integer[] IntegerMasyvas = new Integer[]{45,2,78,9,123};
        String[] StringMAsyvas = new String[]{"Vienas","Du","Trys","Keturi","Penki"};
        ExercisesGenericMethods.printArray(IntegerMasyvas);
        ExercisesGenericMethods.printArray(StringMAsyvas);

        ExercisesGenericMethods.printArray(ExercisesGenericMethods.generateCharacters());
        ExercisesGenericMethods.printArray(ExercisesGenericMethods.generateIntegers());
        ExercisesGenericMethods.printArray(new Integer[0]);
        ExercisesGenericMethods.printArray(null);

        /////////////////////////////////////////////////////////
        // 2.2 Uzduotis: arrayToList
        System.out.println("*******************************************************");
        System.out.println("2.2 Uzduotis: arrayToList");
        System.out.println();

        List<Character> charList = ExercisesGenericMethods.arrayToList(new Character[]{'a','b','c','d','e','f',});
        System.out.println(charList);
        List<Character> emptyList = ExercisesGenericMethods.arrayToList(new Character[0]);
        System.out.println(emptyList);
        Character[] referenceCharArray = null;
        List<Character> referenceCharList = ExercisesGenericMethods.arrayToList(referenceCharArray);
        System.out.println(referenceCharList);

        /////////////////////////////////////////////////////////
        // 2.3 Uzduotis: swap indexes
        System.out.println("*******************************************************");
        System.out.println("2.3 Uzduotis: swap indexes");
        System.out.println();

        String[] stringMasyvasAntras = new String[]{"Pirmas","Antras","Trečias","Ketvirtas","Penktas"};
        System.out.println("Pradinis masyvas");
        ExercisesGenericMethods.printArray(stringMasyvasAntras);

        String[] swapedMasyvas = ExercisesGenericMethods.swap(stringMasyvasAntras,0,stringMasyvasAntras.length-1);
        System.out.println("Swap masyvas");
        ExercisesGenericMethods.printArray(swapedMasyvas);

        System.out.println("Paduodami blogi indeksai:");
        String[] swapedMasyvasOutOfBound = ExercisesGenericMethods.swap(stringMasyvasAntras,0,stringMasyvasAntras.length);
        System.out.println("Gratažina");
        ExercisesGenericMethods.printArray(swapedMasyvasOutOfBound);

        System.out.println();
        System.out.println("Paduodamas Empty List");
        String[] swapedMasyvasOutOfBoundWithEmptyList = ExercisesGenericMethods.swap(new String[0],0,1);
        System.out.println("Gratažina");
        ExercisesGenericMethods.printArray(swapedMasyvasOutOfBoundWithEmptyList);


        System.out.println("Paduodama null vertė");
        try {
            String[] swapedMasyvasNull = ExercisesGenericMethods.swap(null, 0, 1);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }


        /////////////////////////////////////////////////////////
        // 3.1 Uzduotis: compareArrays

        System.out.println("*******************************************************");
        System.out.println("3.1 Uzduotis: compareArrays");
        System.out.println();

        Integer[] arrayInt01 = {1,2,3,4};
        Integer[] arrayInt02 = {1,2,3,4};
        Integer[] arrayInt03 = {1,2,3,3};
        Integer[] arrayInt04 = {1,2,3};

        System.out.println("Tikrinam Integer");
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt02));
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt03));
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt04));


        Double[] arrayDbl01 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl02 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl03 = {1.0,2.0,3.0,3.0};
        Double[] arrayDbl04 = {1.0,2.0,3.0};

        System.out.println("Tikrinam Double");
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl02));
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl03));
        System.out.println(ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl04));

        /////////////////////////////////////////////////////////
        // 3.2 Uzduotis: sumEvenAndOdd

        System.out.println("*******************************************************");
        System.out.println("3.2 Uzduotis: sumEvenAndOdd");
        System.out.println();

        List<Integer> listInt01 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> listDbl01 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);

        System.out.println("Skaičiuojam odd Even sumas");
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd(listDbl01));

        /////////////////////////////////////////////////////////
        // 3.3 Uzduotis: findIndex

        System.out.println("*******************************************************");
        System.out.println("3.3 Uzduotis: findIndex");
        System.out.println();

        List<String> stringList = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt02 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Tikrinam");
        System.out.println(ExercisesGenericsBoundedTypes.findIndex(stringList, "cherry"));
        System.out.println(ExercisesGenericsBoundedTypes.findIndex(stringList, "kiwi"));
         // System.out.println(ExercisesGenericsBoundedTypes.findIndex(listInt02, 2));

        /////////////////////////////////////////////////////////
        // 3.4 Uzduotis: reversList

        System.out.println("*******************************************************");
        System.out.println("3.4 Uzduotis: reversList");
        System.out.println();

        List<String> stringList02 = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt03 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(ExercisesGenericsBoundedTypes.reverseList(stringList02));
        // System.out.println(ExercisesGenericsBoundedTypes.reverseList(listInt03));

        /////////////////////////////////////////////////////////
        // 3.5 Uzduotis: mergeEverySecondElement

        System.out.println("*******************************************************");
        System.out.println("3.5 Uzduotis: mergeEverySecondElement");
        System.out.println();

        List<String> stringList03 = List.of("apple", "banana", "cherry", "orange");
        List<String> stringList04 = List.of("kiwi", "fig", "melon", "mango", "mandarin","grapes" );
        System.out.println(ExercisesGenericsBoundedTypes.mergeEverySecondElement(stringList03,stringList04));

        /////////////////////////////////////////////////////////
        // 4.1 Uzduotis: ListProcessor

        System.out.println("*******************************************************");
        System.out.println("4.1 Uzduotis: ListProcessor");
        System.out.println();

        ListProcessor<String> listProcessor = new LisTProcessorImpl();
        System.out.println("Ar listas tusčias? " + listProcessor.isEmpty());
        listProcessor.addElement("Pirmas");
        listProcessor.addElement("Antras");
        listProcessor.addElement("Trečias");
        listProcessor.removeElement("Antras");
        System.out.println("listo vertės: " + listProcessor);


        /////////////////////////////////////////////////////////
        // 4.2 Uzduotis: ListProcessor

        System.out.println("*******************************************************");
        System.out.println("4.2 Uzduotis: ListProcessor");
        System.out.println();

        ShapeCalculator<Double> shapeCalculatorRec  = new RectangleCalculator();
        ShapeCalculator<Double> shapeCalculatorTri  = new TriangleCalculator();
        ShapeCalculator<Double> shapeCalculatorSqu  = new SquarerCalculator();

        double parametras1 = 4;
        double parametras2 = 3;

        System.out.println("Vertės: " + parametras1 + " " + parametras2);
        System.out.println("Stačiakampio plotas: " + shapeCalculatorRec.calculateArea(parametras1,parametras2));
        System.out.println("Stačiakampio perimetras: " + shapeCalculatorRec.calculatePerimeter(parametras1,parametras2));

        System.out.println("Trikampio plotas: " + shapeCalculatorTri.calculateArea(parametras1,parametras2));
        System.out.println("Trikampio perimetras: " + shapeCalculatorTri.calculatePerimeter(parametras1,parametras2));

        System.out.println("Kvadrato plotas: " + ((SquarerCalculator)shapeCalculatorSqu).calculateArea(parametras1));
        System.out.println("kvadrato perimetras: " + ((SquarerCalculator)shapeCalculatorSqu).calculatePerimeter(parametras1));



        System.out.println("Plotas:");



        /////////////////////////////////////////////////////////
        // 5.1 Uzduotis: wildcards to sumEvenAndOdd
        System.out.println("*******************************************************");
        System.out.println("5.1 Uzduotis: wildcards to sumEvenAndOdd");
        System.out.println();

        System.out.println("Skaičiuojam odd Even sumas 5.1a");
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd01(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd01(listDbl01));

        System.out.println("Skaičiuojam odd Even sumas 5.1b");
       // System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd02(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd02(listDbl01));

        System.out.println("Skaičiuojam odd Even sumas 5.1c");
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd03(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd03(listDbl01));

        /////////////////////////////////////////////////////////
        // 5.2 Uzduotis: wildcards to reverseList
        System.out.println("*******************************************************");
        System.out.println("5.2 Uzduotis: wildcards to reverseList");
        System.out.println();


        System.out.println("Wildcards to reverseList 5.1a");
        System.out.println(ExercisesGenericsBoundedTypes.reverseList01(stringList02));

        System.out.println("Wildcards to reverseList 5.2a");
        System.out.println(ExercisesGenericsBoundedTypes.reverseList02(stringList02));

    }
}