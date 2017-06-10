package com.example.hafizumerbinnasir.generalphysician;

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
import com.example.hafizumerbinnasir.GASTROENTEROLOGIST.Faisal_Ziauddin;
import com.example.hafizumerbinnasir.GASTROENTEROLOGIST.Rajesh_kumar;
import com.example.hafizumerbinnasir.GASTROENTEROLOGIST.Shahid_Mehmod;
import com.example.hafizumerbinnasir.appointadoctor.R;

public class General_Physician extends AppCompatActivity {


    public ListView listView;
    String[] listPlanet={
            "Dr. Farhat Jalil\n" ,
            "Dr. Mumtaz Manzoor\n" ,
            "Prof. Dr. Maria Shabbir \n"


    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__physician);



        listView = (ListView)findViewById(R.id.generallist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Farhat_Jalil.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Mumtaz_Manzor.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Maria_Shabbir.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
