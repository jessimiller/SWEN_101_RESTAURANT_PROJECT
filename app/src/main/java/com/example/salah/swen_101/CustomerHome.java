package com.example.salah.swen_101;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CustomerHome extends AppCompatActivity {
    private ImageButton MCDButton;
    private ImageButton INOButton;
    private ImageButton TBButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        MCDButton = findViewById(R.id.MCDButton);
        INOButton = findViewById(R.id.INOButton);
        TBButton = findViewById(R.id.TBButton);

        MCDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openRestaurantProfile();
            }
        });
        INOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openRestaurantProfile();
            }
        });
        TBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openRestaurantProfile();
            }
        });
    }
    public void openRestaurantProfile(){
        Intent intent = new Intent(this, RestaurantProfile.class);
        startActivity(intent);
    }
}
