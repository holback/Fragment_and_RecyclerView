package com.example.fragment_and_recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import static com.example.fragment_and_recyclerview.ApplicationClass.people;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {

    //dichiariamo le variabili
    TextView tvName, tvNumber;
    EditText etName, etNumber;
    ImageView ivPhone;
    Button btnAdd;

    //per la gestione degli update
    List list;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assegniamo i componenti alle variabili
        tvName = findViewById(R.id.tvName);
        tvNumber = findViewById(R.id.tvNumber);
        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        btnAdd = findViewById(R.id.btnAdd);

        tvName.setText(people.get(0).getName());
        tvNumber.setText(people.get(0).getNumber());

        fragmentManager = this.getSupportFragmentManager();
        list = (List) fragmentManager.findFragmentById(R.id.listFrag);

        //definiamo il click sul bottone
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            String name, number;
            if(etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty())
                Toast.makeText(MainActivity.this, "Verifica di aver compilato tutti i campi",Toast.LENGTH_SHORT).show();
            else
            {
            people.add(new Person(etName.getText().toString().trim(), etNumber.getText().toString().trim()));
            Toast.makeText(MainActivity.this, "Numero aggiunto in rubrica",Toast.LENGTH_SHORT).show();
            etName.setText(null);
            etNumber.setText(null);


                list.notifyDataChanged();
            }

            }
        });




    }

    @Override
    public void onItemClicked(int index) {

        tvName.setText(people.get(index).getName());
        tvNumber.setText(people.get(index).getNumber());    }
}
