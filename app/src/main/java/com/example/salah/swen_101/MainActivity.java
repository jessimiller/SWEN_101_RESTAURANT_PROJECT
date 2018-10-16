package com.example.salah.swen_101;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.CustomerButton);
        button2 = findViewById(R.id.OwnerButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCustomerHome();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openOwnerHome();
            }
        });
    }
    public void openCustomerHome(){
        Intent intent = new Intent(this, CustomerHome.class);
        startActivity(intent);
    }
    public void openOwnerHome(){
        Intent intent = new Intent(this, OwnerHome.class);
        startActivity(intent);
    }
}
