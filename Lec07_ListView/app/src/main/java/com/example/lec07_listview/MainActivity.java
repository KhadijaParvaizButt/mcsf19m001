package com.example.lec07_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> frndArrayList;
    String [] friendList;
    EditText txt;
    ListView listView;
    ArrayAdapter<String>  arryListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         listView= findViewById(R.id.myListView);
       //string [] friendList= {"all","sana", "sofia", "thor"};
        // arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,friendList);
        //listView.setAdapter(arrayAdapter);
       frndArrayList= new ArrayList<>();
        frndArrayList.add("Staphen");
        frndArrayList.add("Damon");
        frndArrayList.add("Aleena");
        frndArrayList.add("Caroline");
        arryListAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,frndArrayList);
        //to find the position of an itmme i  the adapter
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(" you  clicked ", frndArrayList.get(position));
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                intent.putExtra("Frnd Name", frndArrayList.get(position));

            }
        });
       listView.setAdapter(arryListAdapter);
        //make instance of button and textView
        Button btn= findViewById(R.id.btn);
        txt= findViewById(R.id.txt);



    }

    public void AddFriend(View view) {
        frndArrayList.add(txt.getText().toString());    //get data from PlainView and add in list
        listView.setAdapter(arryListAdapter);
        arryListAdapter.notifyDataSetChanged();
        Collections.sort(frndArrayList); //to sort the list
    }
}