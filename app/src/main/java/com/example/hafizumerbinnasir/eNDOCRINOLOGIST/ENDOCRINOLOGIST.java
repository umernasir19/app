package com.example.hafizumerbinnasir.eNDOCRINOLOGIST;

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
import com.example.hafizumerbinnasir.Debiatologist.*;
import com.example.hafizumerbinnasir.Debiatologist.Dr_Mustufa_Jabir;
import com.example.hafizumerbinnasir.appointadoctor.R;
import com.example.hafizumerbinnasir.audiologist.Audiologist;
import com.example.hafizumerbinnasir.cardiologist.Cardiologist;
import com.example.hafizumerbinnasir.chestphysician.Chest_Physician;
import com.example.hafizumerbinnasir.dentalsurgeon.Dental_Surgeon;
import com.example.hafizumerbinnasir.dermatologist.Dermatologist;

public class ENDOCRINOLOGIST extends AppCompatActivity {
    public ListView listView;
    String[] listPlanet={
            "Dr. Mustafa Jabir\n" ,

            };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endocrinologist);

        listView = (ListView)findViewById(R.id.endoclist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Mustufa_Jabir.class);
                    startActivity(myIntent);
                }

            }


        });
    }
    }

