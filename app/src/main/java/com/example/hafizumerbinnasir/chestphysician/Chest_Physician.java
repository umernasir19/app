package com.example.hafizumerbinnasir.chestphysician;

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
import com.example.hafizumerbinnasir.cardiologist.*;

public class Chest_Physician extends AppCompatActivity {




        public ListView listView;
        String[] listPlanet={
                "Dr. Zahid Hussain\n" ,
                "Dr. Uzma Faheem\n" ,
                "Dr. Bilal Salahuddin\n" ,
                "DR. ASIF ASGHAR \n"

        };

        @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chest__physician);

            listView = (ListView)findViewById(R.id.chestlist);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(), Dr_Zahid_Hussain.class);
                        startActivity(myIntent);
                    }
                    else if (position == 1) {
                        Intent myintent=new Intent(view.getContext(),Dr_Uzma.class);
                        startActivity(myintent);
                    }

                    else if (position == 2) {
                        Intent myIntent = new Intent(view.getContext(),Dr_Bilal_Salahudin.class);
                        startActivity(myIntent);
                    }
                    else if (position == 3) {
                        Intent myIntent = new Intent(view.getContext(),Dr_Asif_Asghar.class);
                        startActivity(myIntent);
                    }

                }


            });



        }
}
