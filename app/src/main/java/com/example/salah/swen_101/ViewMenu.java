package com.example.salah.swen_101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewMenu extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_menu);

        button = (Button) findViewById(R.id.buttonz);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openOrder();
            }
        });

    }
    public void openOrder(){
        Intent intent = new Intent(this, OrderConfirmation.class);
        startActivity(intent);
    }
}
