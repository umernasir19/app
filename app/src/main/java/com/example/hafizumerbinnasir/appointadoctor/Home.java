package com.example.hafizumerbinnasir.appointadoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void change(View view){
        Intent intent=new Intent(this,Categories.class);
        startActivity(intent);

    }

    public void change2(View view){
        Intent intent=new Intent(this,Ambulance.class);
        startActivity(intent);

    }
    public void change3(View view){
        Intent intent=new Intent(this,About_Us.class);
        startActivity(intent);

    }


    public void change4(View view){
        Intent intent=new Intent(this,SignUp.class);
        startActivity(intent);

    }

}
