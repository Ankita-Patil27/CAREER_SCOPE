package com.example.anki.career_scope;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin extends AppCompatActivity {
    Button b1;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        b1=(Button)findViewById(R.id.button);
        myDb=new DatabaseHelper(this);
        viewall();
    }
    public void viewall() {
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Cursor res=myDb.getAllData();
                                      if (res.getCount()==0) {
                                          showMessage("Error", "Nothing found");
                                          return;
                                      }
                                      StringBuffer buffer = new StringBuffer();
                                      while (res.moveToNext()) {
                                          buffer.append("Id :" +res.getString(0) + "\n");
                                          buffer.append("Name :" + res.getString(1) + "\n");
                                          buffer.append("Email :" + res.getString(2) + "\n");
                                          buffer.append("Password :" + res.getString(3) + "\n\n");
                                      }
                                      showMessage("Details", buffer.toString()); }});}
    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}


