package com.example.salah.swen_101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class OrderConfirmation extends AppCompatActivity {
    private Button button;
    private TextView cooking;
    private TextView readyForPickup;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        button = (Button) findViewById(R.id.ConfirmButton);
        progressBar = (ProgressBar) findViewById(R.id.ProgressBar);
        cooking = (TextView) findViewById(R.id.CookingText);
        readyForPickup = (TextView) findViewById(R.id.Pickup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingStart();
            }
        });
    }

    public void cookingStart() {
        if (cooking.getCurrentTextColor() == 0xffaaaaaa) {
            cooking.setTextColor(0xFF24CE24);
            progressBar.incrementProgressBy(25);
        } else {
            cooking.setTextColor(0xffaaaaaa);
            readyForPickup.setTextColor(0xFF24CE24);
            progressBar.incrementProgressBy(75);
        }

    }
}
