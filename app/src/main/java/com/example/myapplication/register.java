package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void handleInput(View v){

        EditText n = findViewById(R.id.registername);
        String usernameInput =  n.getText().toString();
        Log.d("Eingegebener Nutzername: ", usernameInput);
        EditText p = findViewById(R.id.registerpasswort);
        String passwortInput = p.getText().toString();
        Log.d("Eingegebenes Passwort: ", passwortInput);
        findViewById(R.id.registerbutton).setEnabled(false);
        Intent i = new Intent(this, Personalisierung.class);
        startActivity(i);
    }

}