package com.example.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewInfo;
    private Button buttonGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        String firstName = getIntent().getStringExtra("firstName");
        String secondName = getIntent().getStringExtra("secondName");
        String age  = getIntent().getStringExtra("age");

        textViewInfo = findViewById(R.id.textViewInfo);
        buttonGoBack = findViewById(R.id.button);

        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

        textViewInfo.setText(firstName+"\n"+secondName+"\n"+age);



    }

}