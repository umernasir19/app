package com.example.hafizumerbinnasir.audiologist;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.appointadoctor.R;

public class Audiologist extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "Dr. Amtullah Shaikh\n" ,
            "Dr. Tahira Aleem\n" ,
            "DR. ABDUL LATIF\n" ,
            "DR. MEHBOOB AHMED \n",
            "DR. RASHIDA HIRANI \n",
            "Dr AKMAL MUSTUFA"

    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiologist);

        listView = (ListView)findViewById(R.id.audiolist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_amtullah.class);
                    startActivity(myIntent);
                }
                else if (position == 1) {
                    Intent myintent=new Intent(view.getContext(),Dr_tahira_aleem.class);
                    startActivity(myintent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),DR_ABDUL_LATIF.class);
                    startActivity(myIntent);
                }
                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(),DR_MEHBOOB_AHMED.class);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(),DR_RASHIDA_HIRANI.class);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Akmal_mustufa.class);
                    startActivity(myIntent);
                }
            }


        });



    }
}
