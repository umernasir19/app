package com.example.hafizumerbinnasir.neurologist;

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
import com.example.hafizumerbinnasir.neurosurgeon.Dr_Ghazanfar_Tahir;

public class Neurologist extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={

            "Prof. Dr. Syed Wasim Akhtar\n" ,
            "Dr. Sadaf Iqbal Khan\n" ,
            "Dr. M. Amir Umer\n" ,


    };


    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurologist);



        listView = (ListView)findViewById(R.id.neurololist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Wasim_akhter.class);
                    startActivity(myIntent);
                }
                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(),Sadaf_Iqbal.class);
                    startActivity(myIntent);
                }
               else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),Amir_Umer.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
