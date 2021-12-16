package com.example.anki.career_scope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class field_choose extends AppCompatActivity {
    TextView b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_choose);
        b1=(TextView)findViewById(R.id.after10);
        b2=(TextView)findViewById(R.id.after12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(field_choose.this,detail_10.class));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(field_choose.this,detail_12.class));

            }
        });
    }

}
