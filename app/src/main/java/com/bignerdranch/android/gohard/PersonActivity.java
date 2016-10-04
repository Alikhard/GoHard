package com.bignerdranch.android.gohard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class PersonActivity extends AppCompatActivity {

    CheckBox ckB;
    TextView seInfo;
    Button btLogOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        ckB = (CheckBox)findViewById(R.id.checkBox);
        seInfo = (TextView)findViewById(R.id.sessionInfo);

        seInfo.setText("11/13/16 5pm");

        ckB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ckB.isChecked()){
                    seInfo.setText("11/13/16 5pm");

                }
            }
        });

        btLogOff = (Button)findViewById(R.id.btLogOff);
        btLogOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diag();
            }

        });

    }

    public void diag() {

        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Do You Want To Log Off?")
                .setNegativeButton("No",null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface diag, int which) {
                        showToast();
                        Intent in = new Intent(PersonActivity.this, LoginActivity.class);
                        startActivity(in);
                    }

                }).create().show();
    }

    public void showToast() {
        Toast.makeText(PersonActivity.this, "Logging You Off", Toast.LENGTH_SHORT).show();
    }




}
