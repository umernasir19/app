package com.example.hafizumerbinnasir.cardiologist;

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
import com.example.hafizumerbinnasir.audiologist.*;

public class Cardiologist extends AppCompatActivity {




    public ListView listView;
    String[] listPlanet={
            "Dr. Arshad ali Shah\n" ,
            "Dr. Atif Ahmed Khan\n" ,
            "DR. Saeed Ahmed\n" ,
            "DR. Ahmed Salman Khan  \n",
            "DR. Mansoor Ahmed \n",
            "Dr Nadeem Rizvi"

    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiologist);

        listView = (ListView)findViewById(R.id.cardiolist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Arshad_Ali_Shah.class);
                    startActivity(myIntent);
                }
                else if (position == 1) {
                    Intent myintent=new Intent(view.getContext(),Dr_Atif_Ahmed_Khan.class);
                    startActivity(myintent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),Dr_saeed_Ahmed.class);
                    startActivity(myIntent);
                }
                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Ahmed_Salman_khan.class);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Mansoor_Ahmed.class);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Nadeem_RIzvi.class);
                    startActivity(myIntent);
                }
            }


        });



    }
}
