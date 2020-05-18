package com.amstudios.arkhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static androidx.core.content.ContextCompat.startActivity;

public class mbakmaudy extends AppCompatActivity {
    Button apaaja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbakmaudy);
        intent2();
    }

    private void intent2() {
        apaaja = findViewById(R.id.button2);
        apaaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent tutupapps = new Intent(getSupportParentActivityIntent().ACTION_MAIN);
                tutupapps.addCategory(Intent.CATEGORY_HOME);
                tutupapps.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(tutupapps);
            }
        });

    }
}


