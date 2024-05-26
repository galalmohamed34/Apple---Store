package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CheckOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
    }
    public void openHomePagecheckout(View view){
        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
        Intent intent = new Intent(this, NotificationService.class);
        startService(intent);
    }
}