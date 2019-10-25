package com.example.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewActivityMain extends AppCompatActivity {

    public void chooseGender(View view){
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        int selectedId= radioGroup.getCheckedRadioButtonId();

        RadioButton radioButton=findViewById(selectedId);
        Toast.makeText(this, "Your gender:"+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_main);
        Toast.makeText(this, "You moved to new activity", Toast.LENGTH_SHORT).show();

    }
}
