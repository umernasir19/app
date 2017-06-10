package com.example.hafizumerbinnasir.dentalsurgeon;

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
import com.example.hafizumerbinnasir.chestphysician.Dr_Asif_Asghar;
import com.example.hafizumerbinnasir.chestphysician.Dr_Bilal_Salahudin;
import com.example.hafizumerbinnasir.chestphysician.Dr_Uzma;
import com.example.hafizumerbinnasir.chestphysician.Dr_Zahid_Hussain;

public class Dental_Surgeon extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "Dr. Sana Zain\n" ,
            "Dr. Mehreen Khan\n" ,
            "Dr. Sana Ahmed\n" ,
            "Dr. Omair Majeed \n",
            "Dr. Aqeel Ahmed Shaikh \n"

    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dental__surgeon);

        listView = (ListView)findViewById(R.id.dentallist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Sana_Zain.class);
                    startActivity(myIntent);
                }
                else if (position == 1) {
                    Intent myintent=new Intent(view.getContext(),Dr_Mehreen.class);
                    startActivity(myintent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Sana_Ahmed.class);
                    startActivity(myIntent);
                }
                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Omair_Majeed.class);
                    startActivity(myIntent);
                }

                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(),Dr_Aqeel_Ahmed.class);
                    startActivity(myIntent);
                }

            }


        });

    }
}
