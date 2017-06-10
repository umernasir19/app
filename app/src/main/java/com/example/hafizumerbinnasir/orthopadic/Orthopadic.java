package com.example.hafizumerbinnasir.orthopadic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.appointadoctor.R;
import com.example.hafizumerbinnasir.gynacologist.Farheen_Sheikh;
import com.example.hafizumerbinnasir.neurosurgeon.Dr_Ghazanfar_Tahir;

public class Orthopadic extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={

            "Dr. Syed Itaat Hussain\n" ,
            "Dr. Aamir Jalil\n" ,
            "Dr. S. M. Saeed Alam\n" ,


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orthopadic);


        listView = (ListView)findViewById(R.id.ortholist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Itat_Hussain.class);
                    startActivity(myIntent);
                }

                else   if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Amir_Jamil.class);
                    startActivity(myIntent);
                }
                else   if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Saeed_Alam.class);
                    startActivity(myIntent);
                }

            }


        });
    }
}
