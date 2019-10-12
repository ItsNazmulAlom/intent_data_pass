package com.nazmul.intentdatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFather,btnMother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFather=findViewById(R.id.btn_father);
        btnMother=findViewById(R.id.btn_mother);


        btnFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,details.class);
                intent.putExtra("id","father");
                startActivity(intent);
            }
        });

        btnMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,details.class);
                intent.putExtra("id","mother");
                startActivity(intent);
            }
        });
    }
}
