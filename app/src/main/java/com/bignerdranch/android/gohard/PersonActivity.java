package com.bignerdranch.android.gohard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    CheckBox ckB;
    TextView seInfo;

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

    }




}
