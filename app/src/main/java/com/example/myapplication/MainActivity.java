package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void disable(View v) {
     findViewById(R.id.Startbutton).setEnabled(false);
     ((Button)findViewById(R.id.Startbutton)).setText("...");

        Log.d("erfolgreich", "disabled");
    }
    public void inputHandler(View v){
        EditText t = findViewById(R.id.Nutzernameneingabe);
        String Nutzername = t.getText().toString();
        ((TextView)findViewById(R.id.HalloUser)).setText("Hallo " + Nutzername +"!");
        Toast.makeText(this, "fast fertig...!", Toast.LENGTH_LONG).show();
        Log.d("Nutzer:",Nutzername);
    }
    public void launchActivity(View v) {
        Intent i = new Intent(this, register.class); //man kann this sagen weil unsere derzeitige Activity von context inherited
        startActivity(i);
    }
}