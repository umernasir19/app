package com.example.hafizumerbinnasir.ent;

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
import com.example.hafizumerbinnasir.Debiatologist.Dr_Mustufa_Jabir;
import com.example.hafizumerbinnasir.appointadoctor.R;

public class ENT extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "Prof. Dr. Ismail Hirani\n" ,
            "Prof. Dr. Iqbal Hussain\n" ,
            "Dr. Abdul Qayoom\n"

    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent);

        listView = (ListView)findViewById(R.id.entlist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_ismail_hurani.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Dr_Iqbal_Hussain.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Dr__Iqbal_qayum.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
