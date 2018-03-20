package com.example.android.inclassassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText personNameText;
    private EditText ageText;
    private String personName;
    private int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        personNameText =findViewById(R.id.name_field);
        ageText=findViewById(R.id.nage_field);
    }
    public void submitPerson(View view) {

//      personName=person.getPersonName();
//         age=person.getPersonAge();


        personName= personNameText.getText().toString();
        String ageTxt=ageText.getText().toString();
        age=Integer.parseInt(ageTxt);
        Person person = new Person(personName,age );
        Intent data = new Intent();
        data.putExtra(Keys.PERSON, person);
        setResult(RESULT_OK, data);
        finish();



    }



//    public String displayText{
//
//
//        newtxt = (TextView) findViewById(R.id.display);
//
//        String personName =person.getPersonName();
//        int personAge = person.getPersonAge();
//
//
//        displayMessage = "Animal Name " + animalName + "\nNumber of legs " + legs + "\nDoes it have fur? " + hasFur + "\nAny other information " + otherInfo;
//
//        newtxt.setText(displayMessage);
//    }



}

