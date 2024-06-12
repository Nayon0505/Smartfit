package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Personalisierung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personalisierung);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void handleInput(View v){

        EditText n = findViewById(R.id.geschlechtinput);
        String geschlechtinput =  n.getText().toString();
        Log.d("Eingegebenes Geschlecht: ", geschlechtinput);
        EditText p = findViewById(R.id.alterinput);
        String alterinput = p.getText().toString();
        Log.d("Eingegebenes Alter: ", alterinput);
        EditText a = findViewById(R.id.größeinput);
        String größeinput = p.getText().toString();
        Log.d("Eingegebene Große: ", größeinput);
        EditText g = findViewById(R.id.gewichtinput);
        String gewichtinput = p.getText().toString();
        Log.d("Eingegebenes Gewicht: ", gewichtinput);
        findViewById(R.id.loginbutton).setEnabled(false);
    }
}