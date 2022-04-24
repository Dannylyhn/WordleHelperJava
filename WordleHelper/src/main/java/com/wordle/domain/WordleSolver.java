package com.wordle.domain;


import com.wordle.controller.WordleHelper;
import org.controlsfx.control.WorldMapView;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordleSolver {

    public static ArrayList<String> insertWordsIntoList(){
        ArrayList<String> list = new ArrayList<>();

        try {
            File file = new File("src/main/resources/words-list.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;

    }

    public static ArrayList<String> sortedWordsList(ArrayList<String> list, String placeholder){
        ArrayList<String> result = new ArrayList<>();
        result = list;




        return result;
    }

     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        sortedWordsList(insertWordsIntoList(), input.toString());

         for(String word :sortedWordsList(insertWordsIntoList(), input.toString())){
             System.out.println(word);
         }
     }



}
