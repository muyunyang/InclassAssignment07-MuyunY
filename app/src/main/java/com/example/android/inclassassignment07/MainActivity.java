package com.example.android.inclassassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView newtxt;
    private String finalMessage;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newtxt= (TextView)findViewById(R.id.display);
        finalMessage="";

    }


    public void addPerson(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, Keys.REQUEST_ADD_PERSON);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.REQUEST_ADD_PERSON && resultCode == RESULT_OK) {
            Person person = (Person) data.getSerializableExtra(Keys.PERSON);
            String name=person.getPersonName();
            int age=person.getPersonAge();
            String display="Name: "+name+"\nAge: "+age+"\n"+"\n"+"\n";
            finalMessage=finalMessage+display;
            newtxt.setText(finalMessage);
        }

    }


//
//    private  String y(String name,int price,boolean addWhippedCream,boolean addChocolate){
//        String priceMessage= getString(R.string.order_summary_name,name);
//
//        priceMessage+="\nAdd Chocolate? "+addChocolate;
//        priceMessage+="\nAdd whipped Cream? "+addWhippedCream;
//        priceMessage +="\nQuantity: "+quantity;
//        priceMessage +="\nTotal: "+price;
//        priceMessage +="\n"+getString(R.string.thank_you);
//        return priceMessage;
//    }


}
