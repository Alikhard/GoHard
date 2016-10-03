package com.bignerdranch.android.gohard;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView person1;
    Fragment logIn = new dataFragment();

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

    }
    /*private void selectFrag (View view){

        Fragment fr = new dataFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.email, fr);
        ft.commit();

    }*/
}
