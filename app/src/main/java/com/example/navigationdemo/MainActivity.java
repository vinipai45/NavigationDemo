package com.example.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void nextPage(View view){

        Intent intent=new Intent(this,NewActivityMain.class);
        startActivity(intent);
    }

    public void showToast(View view){

        EditText editText=findViewById(R.id.editText);
        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
