package com.example.fragment_and_recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //dichiariamo le variabili
    TextView tvName, tvNumber;
    EditText etName, etNumber;
    ImageView ivPhone;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assegniamo i componenti alle variabili
        tvName = findViewById(R.id.tvName);
        tvNumber = findViewById(R.id.tvNumber);
        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        ivPhone = findViewById(R.id.ivPhone);
        btnAdd = findViewById(R.id.btnAdd);

        //definiamo il click sul bottone
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            String name, number;
            name = etName.toString().trim();
            number = etNumber.toString().trim();

            }
        });




    }
}
