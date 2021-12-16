package com.example.anki.career_scope;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class register extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editName, editEmail, editPassword;
    Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        myDb = new DatabaseHelper(this);
        editName = (EditText) findViewById(R.id.NAME);
        editEmail = (EditText) findViewById(R.id.EMAIL);
        editPassword = (EditText) findViewById(R.id.PASSWORD);
        btnAddData = (Button) findViewById(R.id.ok);
        AddData();
    }
    public boolean emailcheckValidation() {
        final String email1 = editEmail.getText().toString();
        if (!isValidEmail(email1)) {
            editEmail.setError("Invalid Email");
            return false;
        }
        return true;
    }
    public boolean passcheckValidation(){
        final String pass1=editPassword.getText().toString();
        if (!isValidPassword(pass1))
        {
            editPassword.setError("min length :6");
            return false;
        }
        return true;
   }private boolean isValidEmail(String email1) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email1);
        return matcher.matches();
    }private boolean isValidPassword(String pass1) {
        if (pass1 != null && pass1.length() > 6) {
            return true;
        }
        return false;
    }public void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if((emailcheckValidation()==true) && (passcheckValidation()==true)){
                            boolean isInserted = myDb.insertData(editName.getText().toString(),
                                    editEmail.getText().toString(),editPassword.getText().toString());
                            if (isInserted == true)
                                Toast.makeText(register.this, "Register Successfully", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(register.this, "Invalid Deatils", Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(register.this,login.class);
                            startActivity(intent);
                            finish();}
                        else{
                            Toast.makeText(register.this, " Not Registered", Toast.LENGTH_LONG).show();
                        }}});}}











