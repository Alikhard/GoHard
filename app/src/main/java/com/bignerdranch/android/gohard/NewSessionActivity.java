package com.bignerdranch.android.gohard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewSessionActivity extends AppCompatActivity {

    Button submitBtn;

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

    }
}
