package com.example.hafizumerbinnasir.gynacologist;

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
import com.example.hafizumerbinnasir.generalphysician.Dr_Maria_Shabbir;
import com.example.hafizumerbinnasir.generalphysician.Dr_Mumtaz_Manzor;
import com.example.hafizumerbinnasir.generalphysician.Farhat_Jalil;

public class Gynacologist extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "DR. RUBINA TAHIR\n" ,
            "Dr. Syeda Rabia\n" ,
            "Dr. Farheen Sheikh \n"


    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gynacologist);

        listView = (ListView)findViewById(R.id.gynalist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Rubina_Tahir.class);
                    startActivity(myIntent);
                }
              else  if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Syeda_Rabia.class);
                    startActivity(myIntent);
                }
              else   if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Farheen_Sheikh.class);
                    startActivity(myIntent);
                }

            }


        });

    }
}
