package com.example.hafizumerbinnasir.pediatrician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.appointadoctor.R;
import com.example.hafizumerbinnasir.orthopadic.Amir_Jamil;
import com.example.hafizumerbinnasir.orthopadic.Itat_Hussain;
import com.example.hafizumerbinnasir.orthopadic.Saeed_Alam;

public class Pediatrician extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={

            "Dr. Riffat Wasiullah\t\n" ,
            "DDr. Masroor Zaheer\n" ,
            "Dr. Farrukh Naseem\n" ,


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediatrician);


        listView = (ListView)findViewById(R.id.pedilist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Riffat.class);
                    startActivity(myIntent);
                }

                else   if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Masroor.class);
                    startActivity(myIntent);
                }
                else   if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Farrukh.class);
                    startActivity(myIntent);
                }

            }


        });

    }
}
