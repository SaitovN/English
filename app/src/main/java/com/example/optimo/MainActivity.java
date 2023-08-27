package com.example.optimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


   public static ArrayList<Modelclass>  list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=new ArrayList<>();
        list.add(new Modelclass("The Bronte sisters_____all writers.","was","were" ,"is","they","were"));
        list.add(new Modelclass("Where_____Shakespeare born?","was","were","is","you","was"));
        list.add(new Modelclass("_____the tickets expensive?","Was","Were","Did","we","Were"));
        list.add(new Modelclass("I_____a good film on TV last night.","watched","watch","watches","go","watched"));
        list.add(new Modelclass("They_____at Stamford Bridge stadium.","didn't arrived ","don't arrived","didn't arrive","did","didn't arrive"));
        list.add(new Modelclass("_____you see the football match last night?","Did","Do","Was","they","Did"));
        list.add(new Modelclass("We_____to Istanbul three years ago.","go","were","went","was","went"));
        list.add(new Modelclass("When_____in Los Angeles? ","you live","did you lived","did you live","Did","ans"));
        list.add(new Modelclass("I_____you at the party last night.","didn't saw","didn't see","don't saw","see","didn't see"));
        list.add(new Modelclass("What time_____home?","did you get","you did get","you got","you gey did","did you get"));
        list.add(new Modelclass("_____a big table in the living room.","There are","There is","It is","he is","There is"));
        list.add(new Modelclass("How many bedrooms_____?","there are","are there","are they","are you","are there"));
        list.add(new Modelclass("There aren't_____pictures on the walls.","any","some","a","an","any"));
        list.add(new Modelclass("_____only three guests in the dining room.","There was","There were","There is","Was there ","There were"));
        list.add(new Modelclass("How many people_____in the hotel?","there were","was there","were there","they are","were there"));
        list.add(new Modelclass("act_____","er","or","ist","ian","or"));
        list.add(new Modelclass("art_____","er","or","ist","ian","ist"));
        list.add(new Modelclass("paint_____","er","or","ist","ian","er"));
        list.add(new Modelclass("music_____","er","or","ist","ian","ian"));
        list.add(new Modelclass("scient_____","er","or","ist","ian","ist"));
        list.add(new Modelclass("_____a good time","have","go","get","","ist"));
        list.add(new Modelclass("_____an email","have","go","get","","ist"));
        list.add(new Modelclass("_____away for the weekend","have","go","get","","ist"));
        list.add(new Modelclass("_____a taxi","have","go","get","","ist"));
        list.add(new Modelclass("_____a holiday","have","go","get","","ist"));
        list.add(new Modelclass("I went _____ with my friends on Saturday","out","to","back","by","out"));
        list.add(new Modelclass("They went home  _____ car","out","in","back","by","by"));
        list.add(new Modelclass("What time did you get  _____ the restaurant ?","to","in","back","by","to"));
        list.add(new Modelclass("I was born _____ 1982.","to","in","back","by","in"));
        list.add(new Modelclass("After lunch I went _____ to work","out","in","back","by","back"));
        list.add(new Modelclass("I was born _____ 1982.","out","in","back","by","by"));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,layout.class));
                finish();
            }
        },3000);
    }
}