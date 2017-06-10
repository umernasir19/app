package com.example.hafizumerbinnasir.nephrologist;

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

public class Nephrologist extends AppCompatActivity {


    public ListView listView;
    String[] listPlanet={

            "Dr. Khurram Daniyal\n" ,
            "Dr. Asifa Khurram \n"


    };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nephrologist);





        listView = (ListView)findViewById(R.id.nephrolist);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),Khuram_Daniyal.class);
                    startActivity(myIntent);
                }
              else  if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Asifa_Khurram.class);
                    startActivity(myIntent);
                }


            }


        });
    }
}
