package com.example.android.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView mDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetails = (TextView) findViewById(R.id.tv_detail);

        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            mDetails.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
