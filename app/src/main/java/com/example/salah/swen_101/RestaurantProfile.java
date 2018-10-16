package com.example.salah.swen_101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantProfile extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_profile);

        button = (Button) findViewById(R.id.ViewMenuButton);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openViewMenu();
            }
        });
    }
    public void openViewMenu(){
        Intent intent = new Intent(this, ViewMenu.class);
        startActivity(intent);
    }
}
