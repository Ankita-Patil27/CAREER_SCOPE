package com.example.anki.career_scope;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class detail_10 extends AppCompatActivity {
        TextView b1,b2,b3,b4;
        AlertDialog ad;
        CharSequence[] values = {" Information","Video"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_10);
        b1=(TextView) findViewById(R.id.intermedate);
        b2=(TextView) findViewById(R.id.polytechnic);
        b3=(TextView) findViewById(R.id.iti);
        b4=(TextView) findViewById(R.id.other);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callintermidate();}});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callpolythechnic() ;}});
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calliti();}});
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(detail_10.this,other.class));
                finish();
                }});}
    public void callpolythechnic(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_10.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_10.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_10.this,polytechnic.class));

                        break;

                    case 1:
                        Toast.makeText(detail_10.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=-iyeusF06K0&t=528s")));
                        Log.i("Video", "Video Playing....");
                        break;
                }
                ad.dismiss();
            }
        });
        ad = builder.create();
        ad.show();
    }
    public void callintermidate(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_10.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_10.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_10.this,intermediate.class));

                        break;

                    case 1:
                        Toast.makeText(detail_10.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oUfHwurW-nc")));
                        Log.i("Video", "Video Playing....");
                        break;
                }
                ad.dismiss();
            }
        });
        ad = builder.create();
        ad.show();
    }
    public void calliti(){
        AlertDialog.Builder builder = new AlertDialog.Builder(detail_10.this);
        builder.setTitle("Select Your Choice");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Toast.makeText(detail_10.this, "Information will be displayed", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(detail_10.this,iti.class));

                        break;
                    case 1:
                        Toast.makeText(detail_10.this, "Videos will be shown", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KH8v42z8w_0")));
                        Log.i("Video", "Video Playing....");
                        break;}
                ad.dismiss();
            }});
        ad = builder.create();
        ad.show();
    }}
