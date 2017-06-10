package com.example.hafizumerbinnasir.GASTROENTEROLOGIST;

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
import com.example.hafizumerbinnasir.eyesourgen.Dr_Inayatullah;
import com.example.hafizumerbinnasir.eyesourgen.Dr_Syed_Asad;

public class GASTROENTEROLOGIST extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "Dr. Faisal Ziauddin\n" ,
            "Dr. Shahid Mahmood\n" ,
            "Dr. Rajesh Kumar Wadhwa \n"


    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastroenterologist);

        listView = (ListView)findViewById(R.id.gastrolist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Faisal_Ziauddin.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Shahid_Mehmod.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Rajesh_kumar.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
