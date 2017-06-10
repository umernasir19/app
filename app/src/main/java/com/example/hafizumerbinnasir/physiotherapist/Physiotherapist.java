package com.example.hafizumerbinnasir.physiotherapist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.appointadoctor.R;
import com.example.hafizumerbinnasir.pediatrician.Dr_Farrukh;
import com.example.hafizumerbinnasir.pediatrician.Dr_Masroor;
import com.example.hafizumerbinnasir.pediatrician.Dr_Riffat;

public class Physiotherapist extends AppCompatActivity {


    public ListView listView;
    String[] listPlanet={

            "Dr. Syed Wasif Ali\t\n" ,
            "Dr. Hina Malik Khan\n" ,
            "Dr. Hira Liaquat\n" ,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiotherapist);


        listView = (ListView)findViewById(R.id.physiolist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Wasif_ali.class);
                    startActivity(myIntent);
                }

                else   if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Hina.class);
                    startActivity(myIntent);
                }
                else   if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Hira.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
