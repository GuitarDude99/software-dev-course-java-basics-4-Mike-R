package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
       // Create and return an array of strings with the following values:
    //create
        //String[] fruits = new String[5];
        String[] fruits = new String[5];
        // "apple", "banana", "cherry", "date", "elderberry"
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";
        // Replace the line below with your implementation
        //return
        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)

        String[] fruitsArraySize = new String[size];
        for (int i = 0; i < size; i++){
            fruitsArraySize[i] = "apple";
               };
        // Use a loop to set every element to "apple"

        // Replace the line below with your implementation
        return fruitsArraySize;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        String[] topThreeFruits = new String[3];

        for (int i = 0; i < 3; i++){
             topThreeFruits[i] = fruits[i];
    };

    // Replace the line below with your implementation
        return topThreeFruits;
}

    public ArrayList<String> makeFruitList() {
        // Create and return an  array list of strings with the following values:
        ArrayList<String> fruitList = new ArrayList<>();


        // "apple", "banana", "cherry", "date", "elderberry"

        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");

        // Replace the line below with your implementation
        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values

        ArrayList<String> listOfThree= new ArrayList<>();

listOfThree.add(fruit1);
listOfThree.add(fruit2);
listOfThree.add(fruit3);
        // Replace the line below with your implementation


        return listOfThree;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:

        HashMap<String, String> fruitMap = new HashMap<>();

        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"


        // Replace the line below with your implementation
        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        return fruitMap.get("apple");

    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        HashSet<String> fruitSet = new HashSet<>();

        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        // Replace the line below with your implementation
        return fruitSet;
    }
}
