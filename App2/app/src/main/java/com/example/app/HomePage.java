package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void openCartPage(View view){
        Intent in=new Intent(this, Cart.class);
        startActivity(in);
    }

    public void openHomePage(View view){
        Intent in=new Intent(this, HomePage.class);
        startActivity(in);

    }
    public void openiphone11promaxPage(View view){
        Intent in=new Intent(this, iphone11promax.class);
        startActivity(in);
    }
    public void openiphone12promax(View view){
        Intent in=new Intent(this, iphone12promax.class);
        startActivity(in);
    }
    public void openiphone13Page(View view){
        Intent in=new Intent(this, iphone13.class);
        startActivity(in);
    }
    public void openiphone13promaxPage(View view){
        Intent in=new Intent(this, iphone13promax.class);
        startActivity(in);
    }
    public void openiphone14promaxPage(View view){
        Intent in=new Intent(this, iphone14promax.class);
        startActivity(in);
    }
    public void openiphone15promaxPage(View view){
        Intent in=new Intent(this, iphone15promax.class);
        startActivity(in);
    }

    public void signout(View view){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }

}