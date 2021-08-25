package com.example.pingme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mob_number;
    private Button ping;
    private String url, mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mob_number=findViewById(R.id.mobile_number);
        ping=findViewById(R.id.ping);
        url="http://wa.me/+91";


        ping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mob="";
                mob=mob_number.getText().toString().trim();
                mob_number.getText().clear();
                url=url+mob;
                //Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, mob, Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}