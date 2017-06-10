package com.example.hafizumerbinnasir.appointadoctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ambulance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);




        Button edhi;
        edhi=(Button) findViewById(R.id.edhi);
        edhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edhi=new Intent(Intent.ACTION_CALL);
                edhi.setData(Uri.parse("tel:115"));

                startActivity(edhi);

            }
        });
        Button chipa;
        chipa=(Button) findViewById(R.id.chipa);
        chipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chipa=new Intent(Intent.ACTION_CALL);
                chipa.setData(Uri.parse("tel:1020"));

                startActivity(chipa);

            }
        });
        Button aman;
        aman=(Button) findViewById(R.id.aman);
        aman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:1021"));

                startActivity(call);

            }
        });
        Button kkf;
        kkf=(Button) findViewById(R.id.kkf);
        kkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:1090"));

                startActivity(call);

            }
        });


    }
}
