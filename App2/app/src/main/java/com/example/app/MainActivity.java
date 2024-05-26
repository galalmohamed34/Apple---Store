package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    MyDatabaseHelper DB;
    Button signup, signin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        signup =(Button) findViewById(R.id.buttonsignup);
        signin =(Button) findViewById(R.id.buttonsignin);
        DB =new MyDatabaseHelper(this);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user =username.getText().toString();
                String pass =password.getText().toString();
//              String repass = repassword.getText().toString();
                if(user.equals("")||pass.equals(""))
                    Toast.makeText(MainActivity.this, "please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=DB.checkusernamepassword(user,pass);
                    if (checkuserpass==true){
                        Toast.makeText(MainActivity.this, "sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent= new Intent(getApplicationContext(),HomePage.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(MainActivity.this, "invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void openSignUp(View view){
        Intent in=new Intent(this,MainActivity2.class);
        startActivity(in);
    }
    public void openHomePage(View view){

        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
    }


}
