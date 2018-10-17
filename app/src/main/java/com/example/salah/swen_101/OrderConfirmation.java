package com.example.salah.swen_101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderConfirmation extends AppCompatActivity {
    private Button button;
    private TextView cooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        button = (Button) findViewById(R.id.ConfirmButton);
        cooking = (TextView) findViewById(R.id.CookingText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingStart();
            }
        });
    }

    public void cookingStart(){
        cooking.setTextColor(0xFF24CE24);
    }
}
