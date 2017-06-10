package com.example.hafizumerbinnasir.psychiatrist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.appointadoctor.R;
import com.example.hafizumerbinnasir.physiotherapist.Hina;
import com.example.hafizumerbinnasir.physiotherapist.Hira;
import com.example.hafizumerbinnasir.physiotherapist.Wasif_ali;

public class Psychiatrist extends AppCompatActivity {



    public ListView listView;
    String[] listPlanet={

            "DDr. Sameeha Aleem\n" ,
            "Dr. Washdev\n" ,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychiatrist);

        listView = (ListView)findViewById(R.id.psycolist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Sameeha_Aleem.class);
                    startActivity(myIntent);
                }

                else   if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Washdev.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
