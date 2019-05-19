package com.ankit.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semesters extends AppCompatActivity {

    Button sem1,sem2,sem3,sem4,sem5,sem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semesters);


        sem1=(Button) findViewById(R.id.sem1);
        sem2=(Button) findViewById(R.id.sem2);
        sem3=(Button) findViewById(R.id.sem3);
        sem4=(Button) findViewById(R.id.sem4);
        sem5=(Button) findViewById(R.id.sem5);
        sem6=(Button) findViewById(R.id.sem6);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem1");
                startActivity(intent);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem2");
                startActivity(intent);
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem3");
                startActivity(intent);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem4");
                startActivity(intent);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem5");
                startActivity(intent);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semesters.this,subjects.class);
                intent.putExtra("id", "Sem6");
                startActivity(intent);
            }
        });


    }
}
