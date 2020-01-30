package com.example.basicfunctions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("cat");
        list.add("mouse");
        list.add("dog");

        String word = "racecar";
        Palindrome pal = new Palindrome();
        if(pal.checkPalindrome(word))
        {
            Log.v("WTF", "It is a palindrome");
        }
        else
        {
            Log.v("WTF", "It is not a palindrome");
        }

        Duplicates duplicate = new Duplicates();
        duplicate.findDuplicates(list);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz(15);

        Anagrams anagram = new Anagrams();
        if(anagram.checkAnagram("coat", "taco"))
        {
            Log.v("WTF", "It is an anagram");
        }
        else
        {
            Log.v("WTF", "It is not an anagram");
        }

        Tables table = new Tables();
        table.printTable();

    }
}

class Duplicates
{
    void findDuplicates(List<String> strings)
    {
        for(int i = 0; i < strings.size(); i++)
        {
            for(int j = (i+1); j < strings.size(); j++)
            {
                if(strings.get(i) == strings.get(j))
                {
                    Log.v("WTF", strings.get(i));
                }
            }
        }
    }
}

class Palindrome
{
    boolean checkPalindrome(String word)
    {
        char charArray[] = word.toCharArray();
        for(int i = 0; i < charArray.length; i++)
        {
            if(charArray[i] != charArray[(charArray.length - 1 - i)])
            {
                return false;
            }
        }
        return true;
    }
}

class FizzBuzz
{
    void printFizzBuzz(int number)
    {
        if(number % 3 == 0)
        {
            if(number % 5 == 0)
            {
                Log.v("WTF", "fizzbuzz");
            }
            else {
                Log.v("WTF", "fizz");
            }
        }
        else if(number % 5 == 0)
        {
            Log.v("WTF", "buzz");
        }
    }

}

class Anagrams
{
    boolean checkAnagram(String word1, String word2)
    {
        char wordArray1[], wordArray2[];
        wordArray1 = word1.toCharArray();
        wordArray2 = word2.toCharArray();
        Arrays.sort(wordArray1);
        Arrays.sort(wordArray2);

        for(int i = 0; i < wordArray1.length; i++)
        {
            if(wordArray1[i] != wordArray2[i])
            {
                return false;
            }
        }
        return true;
    }
}

class Tables
{
    void printTable()
    {
        int array[][] = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                array[i][j] = (i+1) * (j+1);
            }
        }
        System.out.println("Table");
        for(int a = 0; a < 10; a++)
        {
            for(int b = 0; b < 10; b++)
            {
                System.out.print(array[a][b] + "\t");
            }
            System.out.print("\n");
        }
    }

}
