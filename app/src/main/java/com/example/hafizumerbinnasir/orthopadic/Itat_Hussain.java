package com.example.hafizumerbinnasir.orthopadic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.hafizumerbinnasir.appointadoctor.R;

public class Itat_Hussain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itat__hussain);
        Button call;
        call=(Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:0346-8229956"));

                startActivity(call);

            }
        });
    }
}
