package com.example.hafizumerbinnasir.appointadoctor;

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
import com.example.hafizumerbinnasir.Debiatologist.Diabetologist;
import com.example.hafizumerbinnasir.GASTROENTEROLOGIST.GASTROENTEROLOGIST;
import com.example.hafizumerbinnasir.audiologist.Audiologist;
import com.example.hafizumerbinnasir.cardiologist.Cardiologist;
import com.example.hafizumerbinnasir.chestphysician.Chest_Physician;
import com.example.hafizumerbinnasir.dentalsurgeon.Dental_Surgeon;
import com.example.hafizumerbinnasir.dermatologist.Dermatologist;
import com.example.hafizumerbinnasir.eNDOCRINOLOGIST.ENDOCRINOLOGIST;
import com.example.hafizumerbinnasir.ent.ENT;
import com.example.hafizumerbinnasir.eyesourgen.Eye_Sourgen;
import com.example.hafizumerbinnasir.generalphysician.General_Physician;
import com.example.hafizumerbinnasir.gynacologist.Gynacologist;
import com.example.hafizumerbinnasir.nephrologist.Nephrologist;
import com.example.hafizumerbinnasir.neurologist.Neurologist;
import com.example.hafizumerbinnasir.neurosurgeon.Neurosureon;
import com.example.hafizumerbinnasir.orthopadic.Orthopadic;
import com.example.hafizumerbinnasir.pediatrician.Pediatrician;
import com.example.hafizumerbinnasir.physiotherapist.Physiotherapist;
import com.example.hafizumerbinnasir.psychiatrist.Psychiatrist;

public class Categories extends AppCompatActivity {

    public ListView listView;
    String[] listPlanet={
            "AUDIOLOGIST\n" ,
            "CARDIOLOGIST\n" ,
            "CHEST PHYSICIAN\n" ,
            "DENTAL SURGEON\n" ,
            "DERMATOLOGIST\n" ,
            "DIABETOLOGIST\n" ,
            "ENDOCRINOLOGIST\n" ,
            "ENT SURGEON\n" ,
            "EYE SURGEON\n" ,
            "GASTROENTEROLOGIST\n" ,
            "GENERAL PHYSICIAN\n" ,
            "GYNAECOLOGIST\n" ,
            "NEPHROLOGIST\n" ,
            "NEUROSURGEON\n" ,
            "NEUROLOGIST\n" ,
            "ORTHOPEDIC\n" ,
            "PEDIATRICIAN\n" ,
            "PHYSIOTHERAPIST\n" ,
            "PSYCHIATRIST\n" ,
            };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);



        listView = (ListView)findViewById(R.id.categories);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Audiologist.class);
                    startActivity(myIntent);
                }
                  else if (position == 1) {
                       Intent myintent=new Intent(view.getContext(),Cardiologist.class);
                       startActivity(myintent);
                    }
                    else if (position == 2) {
                        Intent myIntent = new Intent(view.getContext(), Chest_Physician.class);
                        startActivity(myIntent);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Dental_Surgeon.class);
                    startActivity(myIntent);
                }

                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Dermatologist.class);
                    startActivity(myIntent);
                }
                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(),Diabetologist.class);
                    startActivity(myIntent);
                }
                else if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(),ENDOCRINOLOGIST.class);
                    startActivity(myIntent);
                }

                else if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(),ENT.class);
                    startActivity(myIntent);
                }
                else if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(),Eye_Sourgen.class);
                    startActivity(myIntent);
                }
                else if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(),GASTROENTEROLOGIST.class);
                    startActivity(myIntent);
                }

                else if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(),General_Physician.class);
                    startActivity(myIntent);
                }

                else if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(),Gynacologist.class);
                    startActivity(myIntent);
                }

                else if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(),Nephrologist.class);
                    startActivity(myIntent);
                }
                else if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(),Neurosureon.class);
                    startActivity(myIntent);
                }

                else if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(),Neurologist.class);
                    startActivity(myIntent);
                }
                else if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), Orthopadic.class);
                    startActivity(myIntent);
                }


                else if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), Pediatrician.class);
                    startActivity(myIntent);
                }
                else if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), Physiotherapist.class);
                    startActivity(myIntent);
                }

                else if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), Psychiatrist.class);
                    startActivity(myIntent);
                }
            }


        });
    }
}