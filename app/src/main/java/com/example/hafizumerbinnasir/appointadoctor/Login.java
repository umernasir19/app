package com.example.hafizumerbinnasir.appointadoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void change6(View view){
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);

    }
}
