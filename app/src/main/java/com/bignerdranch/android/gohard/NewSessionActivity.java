package com.bignerdranch.android.gohard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewSessionActivity extends AppCompatActivity {

    Button submitBtn;
    Button btLogOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_session);

        submitBtn = (Button)findViewById(R.id.newSessionBtnSub);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(NewSessionActivity.this, ReceiptActivity.class);
                startActivity(in);
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
                        Intent in = new Intent(NewSessionActivity.this, LoginActivity.class);
                        startActivity(in);
                    }

                }).create().show();
    }

    public void showToast() {
        Toast.makeText(NewSessionActivity.this, "Logging You Off", Toast.LENGTH_SHORT).show();
    }
}
