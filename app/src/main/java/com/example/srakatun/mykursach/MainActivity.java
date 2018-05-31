package com.example.srakatun.mykursach;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startAdd());
            }
        };
        btnAdd.setOnClickListener(onClickListener);
    }
    private Intent startAdd(){
        Intent intent = new Intent(this, form.class);
        return intent;
    }
}
