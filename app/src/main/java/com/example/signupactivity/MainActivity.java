package com.example.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFirstName, editTextSecondName, editTextAge;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFristName);
        editTextSecondName = findViewById(R.id.editTextSecondName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("firstName", editTextFirstName.getText().toString());
                intent.putExtra("secondName", editTextSecondName.getText().toString());
                intent.putExtra("age", editTextAge.getText().toString());

                startActivity(intent);

            }
        });
    }
}