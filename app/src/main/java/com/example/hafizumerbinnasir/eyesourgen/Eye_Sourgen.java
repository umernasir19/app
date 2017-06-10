package com.example.hafizumerbinnasir.eyesourgen;

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
import com.example.hafizumerbinnasir.ent.Dr_Iqbal_Hussain;
import com.example.hafizumerbinnasir.ent.Dr__Iqbal_qayum;
import com.example.hafizumerbinnasir.ent.Dr_ismail_hurani;

public class Eye_Sourgen extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "Dr. Syed Shahid Asad\n" ,
            "Dr. Inayatullah\n" ,


    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye__sourgen);

        listView = (ListView)findViewById(R.id.eyelist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Syed_Asad.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Inayatullah.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
