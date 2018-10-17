package com.example.salah.swen_101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ViewMenu extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_menu);

        button = (Button) findViewById(R.id.OrderButton);

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
