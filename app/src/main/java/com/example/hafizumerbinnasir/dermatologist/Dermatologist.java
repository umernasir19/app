package com.example.hafizumerbinnasir.dermatologist;

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
import com.example.hafizumerbinnasir.dentalsurgeon.*;

public class Dermatologist extends AppCompatActivity {
    public ListView listView;
    String[] listPlanet={
            "Dr. Sher Mohammed \n" ,
            "Dr. Yousuf Abid Mallick\n" ,
            "Dr. Mirza Asad Kazim\n" ,
            "Dr. S. M. Rizwan \n",
            "DR RABB \n"

    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dermatologist);

        listView = (ListView) findViewById(R.id.dermalist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Sher_Mohammad.class);
                    startActivity(myIntent);
                } else if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), Dr_Abid_Mallick.class);
                    startActivity(myintent);
                } else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Mirza_asad_kazim.class);
                    startActivity(myIntent);
                } else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Sana_Ahmed.class);
                    startActivity(myIntent);
                } else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Sana_Zain.class);
                    startActivity(myIntent);
                }

            }


        });

    }
}