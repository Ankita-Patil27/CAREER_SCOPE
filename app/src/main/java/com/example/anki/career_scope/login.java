package com.example.anki.career_scope;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    EditText email, password;
    Button b1, b2;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper=new DatabaseHelper(this);
        db=openHelper.getReadableDatabase();
        email=(EditText)findViewById(R.id.Email);
        password=(EditText)findViewById(R.id.Password);
        b1=(Button)findViewById(R.id.LOGIN);
        b2=(Button)findViewById(R.id.REGISTER);
        register_detail();
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String em=email.getText().toString();
                        String pass=password.getText().toString();
                        cursor=db.rawQuery("select * from "+DatabaseHelper.TABLE_NAME+" where "+DatabaseHelper.COL_3 +" =?  and "+DatabaseHelper.COL_4+" =? ",new String[]{em,pass});
                        if(cursor!=null){
                            if(cursor.getCount()>0){
                                Toast.makeText(login.this, "Login Successfully", Toast.LENGTH_LONG).show();
                                Intent i1=new Intent(login.this,field_choose.class);
                                startActivity(i1);
                                finish();
                            } else {
                                Toast.makeText(login.this, "Invalid Email or Password", Toast.LENGTH_LONG).show();
                            }}
                            if(em.equals("ankita")&& pass.equals("ankita")){
                                Intent i2=new Intent(login.this,admin.class);
                                startActivity(i2);
                                finish();}
                    }}
                );}
    public void register_detail(){
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(login.this, register.class);
                        startActivity(i3);
                        finish();
            }
        });
    }

}
