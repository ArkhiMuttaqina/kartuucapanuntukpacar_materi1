package com.amstudios.arkhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static androidx.core.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {
    Button kitabisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent();
    }

    private void intent() {
        kitabisa = findViewById(R.id.button);
        kitabisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intensatukelainnya = new Intent(MainActivity.this, mbakmaudy.class);
                startActivity(intensatukelainnya);
                MainActivity.this.onPause();
            }
        });
    }

}










