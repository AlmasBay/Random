package com.example.random;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtShirota = (TextView) findViewById(R.id.txShirota);
        TextView txtDolgota = (TextView) findViewById(R.id.txDolgota);
        Button btnMap = (Button) findViewById(R.id.btnMap);

        View.OnClickListener oclbtnMap = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:" + txtShirota.getText().toString() + ", " + txtDolgota.getText().toString()));
                startActivity(intent);
            }
        };
        btnMap.setOnClickListener(oclbtnMap);
    }
}