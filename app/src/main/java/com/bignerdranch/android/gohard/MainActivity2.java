package com.bignerdranch.android.gohard;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView person1;
    Fragment logIn = new dataFragment();
    Button btLogOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        person1 = (TextView)findViewById(R.id.person1);
        person1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this, PersonActivity.class);
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
                       Intent in = new Intent(MainActivity2.this, LoginActivity.class);
                       startActivity(in);
                   }

                }).create().show();
    }

    public void showToast() {
        Toast.makeText(MainActivity2.this, "Logging You Off", Toast.LENGTH_SHORT).show();
    }


    private void selectFrag (View view){

        Fragment fr = new dataFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.email, fr);
        ft.commit();

    }
}
