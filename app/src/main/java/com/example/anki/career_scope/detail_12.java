package com.example.anki.career_scope;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class detail_12 extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    AlertDialog ad2;
    CharSequence[] values = {" Information","Video"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_12);
        t1=(TextView)findViewById(R.id.PCMB);
        t2=(TextView)findViewById(R.id.PCB);
        t3=(TextView)findViewById(R.id.PCM);
        t4=(TextView)findViewById(R.id.commerce);
        t5=(TextView)findViewById(R.id.arts);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callpcmb();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callpcb();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callpcm();
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callcommerce();
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callarts();
            }
        });
    }
    public void callpcmb(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_12.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_12.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_12.this,pcmb.class));

                        break;

                    case 1:
                        Toast.makeText(detail_12.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5GXQ3E_mIak")));
                        Log.i("Video", "Video Playing....");
                        break;
                }
                ad2.dismiss();
            }
        });
        ad2 = builder.create();
        ad2.show();
    }
    public void callpcb(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_12.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_12.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_12.this,pcb.class));

                        break;

                    case 1:
                        Toast.makeText(detail_12.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DnGTzfMW4Jo&t=57s")));
                        Log.i("Video", "Video Playing....");
                        break;
                }
                ad2.dismiss();
            }
        });
        ad2 = builder.create();
        ad2.show();
    }
    public void callpcm(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_12.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_12.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_12.this,pcm.class));

                        break;
                    case 1:
                        Toast.makeText(detail_12.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2rIEv1Uhtn4")));
                        Log.i("Video", "Video Playing....");
                        break;}
                ad2.dismiss();
            }});
        ad2 = builder.create();
        ad2.show();
    }
    public void callcommerce(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_12.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_12.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_12.this,commerce.class));

                        break;
                    case 1:
                        Toast.makeText(detail_12.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zPfZ0uiVO98")));
                        Log.i("Video", "Video Playing....");
                        break;}
                ad2.dismiss();
            }});
        ad2 = builder.create();
        ad2.show();
    }
    public void callarts(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_12.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_12.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_12.this,arts.class));

                        break;
                    case 1:
                        Toast.makeText(detail_12.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=akjZPnvAm3k")));
                        Log.i("Video", "Video Playing....");
                        break;}
                ad2.dismiss();
            }});
        ad2= builder.create();
        ad2.show();
    }}
