package com.example.sqllite1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnAdd, btnView;
EditText editName, editAge;
ListView listView;
Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
btnView=findViewById(R.id.buttonView);
btnAdd=findViewById(R.id.buttonAdd);
editAge=findViewById(R.id.editAge);
editName=findViewById( R.id.editName);
aSwitch=findViewById(R.id.switch1);
btnAdd.setOnClickListener(new View.OnClickListener() {
    CustomerModel customerModel;    //creat instant of class
    @Override
    public void onClick(View v) {
      customerModel=new CustomerModel(editName.getText().toString(), Integer.parseInt(editAge.getText().toString()),1,aSwitch.isChecked());
        Toast.makeText(MainActivity.this,customerModel.toString(), Toast.LENGTH_SHORT).show();
       // Toast.makeText(MainActivity.this, "Button add is clicked", Toast.LENGTH_SHORT).show();
    }

});
btnView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Button view is clicked", Toast.LENGTH_SHORT).show();
    }
});
    }
}